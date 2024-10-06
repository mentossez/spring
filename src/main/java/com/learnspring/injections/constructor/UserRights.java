package com.learnspring.injections.constructor;

import java.util.List;

public class UserRights {
    private List<String> userRolesList;

    public List<String> getUserRolesList() {
        return userRolesList;
    }

    public UserRights() {
    }

    public UserRights(List<String> userRoles) {
        this.userRolesList = userRoles;
    }
}
