package com.crossoverjie.cim.route.service;

import com.crossoverjie.cim.route.api.vo.req.CreateGroupReqVo;

/**
 * @author:qjj
 * @create: 2024-09-24 00:53
 * @Description:
 */

public interface GroupService {

    /**
     * 创建群组
     *
     * @param createGroupReqVo
     * @return groupId
     */
    String createGroup(CreateGroupReqVo createGroupReqVo);
}
