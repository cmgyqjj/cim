package com.crossoverjie.cim.client.service.impl;

import com.crossoverjie.cim.client.service.GroupHandle;
import jakarta.annotation.Resource;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @author:qjj
 * @create: 2024-09-24 00:54
 * @Description:
 */
@Service
public class GroupHandler implements GroupHandle {

    @Resource
    private RedisTemplate redisTemplate;

    @Override
    public String createGroup(String[] userIds) {
        String groupId = UUID.randomUUID().toString();
        redisTemplate.opsForSet().add(groupId, userIds);
        redisTemplate.expire(groupId, 1, TimeUnit.HOURS);
        return groupId;
    }
}
