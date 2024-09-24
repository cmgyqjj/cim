package com.crossoverjie.cim.client.service.impl.command;

import com.crossoverjie.cim.client.sdk.Event;
import com.crossoverjie.cim.client.service.GroupHandle;
import com.crossoverjie.cim.client.service.InnerCommand;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @author:qjj
 * @create: 2024-09-24 00:48
 * @Description:
 */
@Service
public class GroupCommand implements InnerCommand {

    @Resource
    private Event event ;
    @Resource
    private GroupHandle groupHandle ;

    @Override
    public void process(String msg) throws Exception {
        String[] userIds = msg.split(",");
        String groupId = groupHandle.createGroup(userIds);
        event.info("Create group success, groupId={}", groupId);
    }
}
