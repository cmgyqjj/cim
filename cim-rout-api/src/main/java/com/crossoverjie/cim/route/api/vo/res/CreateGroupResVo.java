package com.crossoverjie.cim.route.api.vo.res;

import com.crossoverjie.cim.common.req.BaseRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author:qjj
 * @create: 2024-09-24 20:45
 * @Description:
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateGroupResVo extends BaseRequest {

    private String groupId;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return "CreateGroupResVo{" +
                "groupId='" + groupId + '\'' +
                '}';
    }
}
