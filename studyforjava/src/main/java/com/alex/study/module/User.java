package com.alex.study.module;

import io.swagger.annotations.ApiModelProperty;

import java.util.UUID;


public class User {
    @ApiModelProperty(required = true, notes = "user name")
    private String user_name;
    @ApiModelProperty(required = true, notes = "password")
    private String password;
    @ApiModelProperty(required = true, notes = "UUID")
    private UUID user_id;

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_id(UUID user_id) {
        this.user_id = user_id;
    }

    public UUID getUser_id() {
        return user_id;
    }
}
