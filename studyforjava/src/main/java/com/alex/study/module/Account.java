package com.alex.study.module;

import io.swagger.annotations.ApiModelProperty;

import java.util.UUID;

public class Account {
    @ApiModelProperty(required = true, notes = "UUID")
    private UUID account_id;
    @ApiModelProperty(required = false, notes = "nick name")
    public String account_nickName;
    @ApiModelProperty(required = false, notes = "if null, same as user name")
    private String account_name;
    @ApiModelProperty(required = true, notes = "transaction password")
    private String account_transaction_pwd;

    public void setAccount_nickName(String account_nickName) {
        this.account_nickName = account_nickName;
    }

    public String getAccount_nickName() {
        return account_nickName;
    }

    public void setAccount_id(UUID account_id) {
        this.account_id = account_id;
    }

    public UUID getAccount_id() {
        return account_id;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }

    public String getAccount_name() {
        return account_name;
    }

    public void setAccount_transaction_pwd(String account_transaction_pwd) {
        this.account_transaction_pwd = account_transaction_pwd;
    }

    public String getAccount_transaction_pwd() {
        return account_transaction_pwd;
    }
}
