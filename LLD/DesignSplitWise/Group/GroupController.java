package LLD.DesignSplitWise.Group;

import java.util.List;

import LLD.DesignSplitWise.User.User;

public class GroupController {
     List<Group> groupList;
     

     public void createNewGroup(String groupId, String groupName, User createdByUser) {
        Group group = new Group();

        group.setGroupId(groupId);
        group.setGroupName(groupName);
        group.addMember(createdByUser);

        groupList.add(group);
     }

     public Group getGroup(String groupId) {
        for(Group group : groupList) {
            if(group.getGroupId().equals(groupId)) {
                return group;
            }
        }
        return null;
     }
}
