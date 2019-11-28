package com.qf.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qf.dao.UserDao;
import com.qf.entity.user;
import com.qf.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * @author LiuYangHe
 * @Date 2019/11/27
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao,user> implements IUserService{

}
