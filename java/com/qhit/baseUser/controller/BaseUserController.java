package com.qhit.baseUser.controller; 

import com.qhit.baseUser.pojo.BaseUser; 
import com.qhit.baseUser.service.IBaseUserService; 
import org.springframework.web.bind.annotation.RequestMapping; 
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List; 
import org.springframework.web.bind.annotation.RestController; 

/** 
* Created by GeneratorCode on 2018/03/20
*/ 

@RestController 
@RequestMapping("/baseUser") 
public class BaseUserController { 

    @Resource 
    IBaseUserService baseUserService; 

    @RequestMapping("/insert") 
    public void insert(BaseUser baseUser) { 
        baseUserService.insert(baseUser); 
    } 
    @RequestMapping("/login")
    public BaseUser login(BaseUser baseUser, HttpSession session) {
        List<BaseUser> list = search(baseUser);
        if(list.size()>0){
            BaseUser user = list.get(0);
            session.setAttribute("baseUser",user);
            return user;
        }
        return null;
    }
    @RequestMapping("/getUserInfo")
    public BaseUser getUserInfo(HttpSession session) {
        BaseUser baseUser = (BaseUser) session.getAttribute("baseUser");
        return baseUser;
    }

    @RequestMapping("/delete") 
    public void delete(Integer userid) { 
        baseUserService.delete(userid); 
    } 

    @RequestMapping("/update") 
    public void update(BaseUser baseUser) { 
        baseUserService.update(baseUser); 
    } 

    @RequestMapping("/updateSelective") 
    public void updateSelective(BaseUser baseUser) { 
        baseUserService.updateSelective(baseUser); 
    } 

    @RequestMapping("/load") 
    public BaseUser load(Integer userid) { 
        BaseUser baseUser = baseUserService.findById(userid); 
        return baseUser; 
    } 

    @RequestMapping("/list") 
    public List<BaseUser> list()  { 
        List<BaseUser> list = baseUserService.findAll(); 
        return list; 
    } 

    @RequestMapping("/search") 
    public List<BaseUser> search(BaseUser baseUser) { 
        List<BaseUser> list = baseUserService.search(baseUser); 
        return list; 
    } 

} 
