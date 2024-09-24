package com.crossoverjie.cim.client.service;

/**
 * @author:qjj
 * @create: 2024-09-24 00:53
 * @Description:
 */

public interface GroupHandle {

/**
     * 创建群组
     * @param userIds
     * @return groupId
     */
    String createGroup(String[] userIds);
}
