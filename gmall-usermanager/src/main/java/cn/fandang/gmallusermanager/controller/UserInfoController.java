package cn.fandang.gmallusermanager.controller;

import cn.fandang.gmallusermanager.bean.UserInfo;
import cn.fandang.gmallusermanager.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserInfoController {
    @Autowired
    private UserInfoService service;

    @RequestMapping("/findAll")
    public List<UserInfo> findAll(){
        List<UserInfo> userInfos = service.findAll();
        return userInfos;
    }

    @GetMapping("/findUserByName")
    public List<UserInfo> findUserInfoByName(UserInfo userInfo){
        return service.findUserInfByName(userInfo);
    }

    @GetMapping("/findUserBySName")
    public List<UserInfo> findUserInfoByName(String name){
        UserInfo userInfo = new UserInfo();
        userInfo.setName(name);
        return service.findUserInfByName(userInfo);
    }

    /**
     * 通过昵称查询用户
     * @return
     */
    @GetMapping("/findUserByNickname")
    public List<UserInfo> findUserinfoByNickname(UserInfo userInfo){
        return service.findUserInfoByNickName(userInfo);
    }
}
