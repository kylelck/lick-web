package com.lick;

import com.lick.proxy.ProxyFactory;
import com.lick.service.UserService;
import com.lick.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Proxy;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LickWebApplicationTests {
	/**
	 * 测试动态代理
	 */
	@Test
	public void contextLoads() {
		UserServiceImpl user = new UserServiceImpl();
		ProxyFactory pf = new ProxyFactory(user);
		UserService userapi = (UserService) Proxy.newProxyInstance(user.getClass().getClassLoader(),user.getClass().getInterfaces(),pf);
		userapi.removeUsr(11);
	}

	public static void main(String[] args) {
		UserServiceImpl user = new UserServiceImpl();
		ProxyFactory pf = new ProxyFactory(user);
		UserService userapi = (UserService) Proxy.newProxyInstance(user.getClass().getClassLoader(),user.getClass().getInterfaces(),pf);
		userapi.removeUsr(11);
	}

}
