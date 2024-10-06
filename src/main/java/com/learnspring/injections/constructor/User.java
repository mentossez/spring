package com.learnspring.injections.constructor;

public class User {
    private String partyId;
    private UserRights userRights;

    public String getPartyId() {
        return partyId;
    }

    public UserRights getUserRights() {
        return userRights;
    }

    public User() {
    }

    public User(String partyId, UserRights userRights) {
        this.partyId = partyId;
        this.userRights = userRights;
    }
}
