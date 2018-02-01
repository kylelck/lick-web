package com.lick.mq;

import com.lick.channel.UserMessageChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.support.GenericMessage;

import java.util.Date;

/**
 * @description：
 * @author: lick
 * @date: 2018年01月23日 13:40
 * @copyright: 版权归所有
 */
@EnableBinding(value = {UserMessageChannel.class})
public class UserPublisher {
    private static final Logger logger = LoggerFactory.getLogger(UserPublisher.class);
    @Bean
    @InboundChannelAdapter(value = UserMessageChannel.USEROUTPUT, poller = @Poller(fixedDelay = "2000"))
    public MessageSource<Date> timerMessageSource() {
        return () -> new GenericMessage<>(new Date());
    }
}
