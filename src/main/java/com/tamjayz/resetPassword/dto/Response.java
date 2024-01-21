package com.tamjayz.resetPassword.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Response {
    private int statusCode;
    private String responseMessage;
    private UserInfo userInfo;
}