package com.crossoverjie.cim.client.service.impl.command;

import com.crossoverjie.cim.client.sdk.Client;
import com.crossoverjie.cim.client.sdk.Event;
import com.crossoverjie.cim.client.service.GroupHandle;
import com.crossoverjie.cim.client.service.InnerCommand;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

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
    @Resource
    private Client client ;

    @Override
    public void process(String msg) throws Exception {
//        :cg 1726505078895,1726504561095 去掉前缀，空格
        msg = msg.replace(":cg", "").trim();
        String[] userIds = msg.split(",");
        List<String> userIdList = List.of(userIds);

        String groupId = client.createGroup(userIdList);
        event.info("Create group success, groupId={}", groupId);
    }
}
