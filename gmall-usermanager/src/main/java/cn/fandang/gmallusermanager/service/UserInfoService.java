package cn.fandang.gmallusermanager.service;

import cn.fandang.gmallusermanager.bean.UserInfo;

import java.util.List;

public interface UserInfoService {
    List<UserInfo> findAll();

    List<UserInfo> findUserInfByName(UserInfo userInfo);

    List<UserInfo> findUserInfoByNickName(UserInfo userInfo);
}
