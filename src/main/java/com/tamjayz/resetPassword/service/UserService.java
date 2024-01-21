package com.tamjayz.resetPassword.service;

import com.tamjayz.resetPassword.dto.LoginRequest;
import com.tamjayz.resetPassword.dto.Request;
import com.tamjayz.resetPassword.dto.Response;

public interface UserService {
    Response signUp(Request request);
    Response login(LoginRequest request);
}
