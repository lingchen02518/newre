package com.example.yk_study.service.impl;

import com.example.yk_study.mapper.UserMapper;
import com.example.yk_study.po.userpo;
import com.example.yk_study.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 虎哥
 * @since 2024-03-04
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, userpo> implements IUserService {

}
