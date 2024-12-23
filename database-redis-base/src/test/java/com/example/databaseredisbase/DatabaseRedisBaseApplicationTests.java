package com.example.databaseredisbase;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.util.Assert;

@SpringBootTest
class DatabaseRedisBaseApplicationTests {

	@Autowired
	private RedisTemplate redisTemplate;

	@Test
	void contextLoads() {
		redisTemplate.opsForValue().set("name", "张三");
		Assert.isTrue("张三".equals(redisTemplate.opsForValue().get("name")), "名字不对");
		//delete
		redisTemplate.delete("name");
		Assert.isNull(redisTemplate.opsForValue().get("name"), "名字不对");
	}

}
