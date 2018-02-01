package com.lick.integration;

import com.lick.api.UserInfoApi;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @description：
 * @author: lick
 * @date: 2018年01月16日 11:37
 * @copyright: 版权归所有
 */
@FeignClient(value = "lick-core")
public interface UserInfoClient extends UserInfoApi {
}
