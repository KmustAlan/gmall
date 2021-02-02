package cn.fandang.gmallusermanager.service.impl;

import cn.fandang.gmallusermanager.bean.UserInfo;
import cn.fandang.gmallusermanager.mapper.UserInfoMapper;
import cn.fandang.gmallusermanager.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> findAll() {
        return userInfoMapper.selectAll();
    }

    @Override
    public List<UserInfo> findUserInfByName(UserInfo userInfo) {
        return userInfoMapper.select(userInfo);
    }

    @Override
    public List<UserInfo> findUserInfoByNickName(UserInfo userInfo) {
        Example example = new Example(UserInfo.class);
        example.createCriteria().andLike("nickName", "%"+userInfo.getNickName()+"%");
        return userInfoMapper.selectByExample(example);
    }

}
