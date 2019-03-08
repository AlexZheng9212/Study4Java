package com.alex.study.service;

import com.alex.study.module.User;
import com.alex.study.service.Impl.userAccountImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/user")
@Api(tags = "User Account")
public class userAccount {
    @PostMapping(value ="/create", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "create a user account", notes = "create",
            consumes = "application/json", produces = "application/json")
    @ApiResponse(code = 200, message = "Success", response = User.class)
    @ResponseStatus(HttpStatus.CREATED)
    public User createUserAccount(@ApiParam(required = true) @Valid @RequestBody() User user) {
        return userAccountImpl.createUserAccountImpl(user);
    }
}
