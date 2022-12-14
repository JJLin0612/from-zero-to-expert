package com.example.fromzerotoexpert.service;

import com.example.fromzerotoexpert.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.security.NoSuchAlgorithmException;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author RabbitFaFa
 * @since 2022-12-01
 */
public interface UserService extends IService<User> {

    int userRegister(String mobile, String pwd, String verifyCode);
}
