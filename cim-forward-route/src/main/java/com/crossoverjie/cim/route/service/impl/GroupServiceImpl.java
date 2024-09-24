package com.crossoverjie.cim.route.service.impl;

import com.crossoverjie.cim.route.api.vo.req.CreateGroupReqVo;
import com.crossoverjie.cim.route.api.vo.res.CreateGroupResVo;
import com.crossoverjie.cim.route.service.GroupService;
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
public class GroupServiceImpl implements GroupService {

    @Resource
    private RedisTemplate redisTemplate;

    @Override
    public String createGroup(CreateGroupReqVo createGroupReqVo) {
        String groupId = UUID.randomUUID().toString();
        for (String userId : createGroupReqVo.getUserIds()) {
            redisTemplate.opsForSet().add(groupId, userId);
        }
        redisTemplate.expire(groupId, 1, TimeUnit.HOURS);
        return groupId;
    }
}
