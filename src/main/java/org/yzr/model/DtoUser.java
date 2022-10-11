package org.yzr.model;

import lombok.Data;

@Data
public class DtoUser {

    private String id;

    private String username;

    private String token;

    private String lastLoginIp;

    public DtoUser(User user) {
        this.id = user.getId();
        this.username = user.getUsername();
        this.token = user.getToken();
        this.lastLoginIp = user.getLastLoginIp();
    }
}
