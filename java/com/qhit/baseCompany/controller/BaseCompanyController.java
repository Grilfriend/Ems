package com.qhit.baseCompany.controller; 

import com.qhit.baseCompany.pojo.BaseCompany; 
import com.qhit.baseCompany.service.IBaseCompanyService; 
import org.springframework.web.bind.annotation.RequestMapping; 
import javax.annotation.Resource; 
import java.util.List; 
import org.springframework.web.bind.annotation.RestController; 

/** 
* Created by GeneratorCode on 2018/03/30
*/ 

@RestController 
@RequestMapping("/baseCompany") 
public class BaseCompanyController { 

    @Resource 
    IBaseCompanyService baseCompanyService; 

    @RequestMapping("/insert") 
    public void insert(BaseCompany baseCompany) { 
        baseCompanyService.insert(baseCompany); 
    } 

    @RequestMapping("/delete") 
    public void delete(Integer compid) { 
        baseCompanyService.delete(compid); 
    } 

    @RequestMapping("/update") 
    public void update(BaseCompany baseCompany) { 
        baseCompanyService.update(baseCompany); 
    } 

    @RequestMapping("/updateSelective") 
    public void updateSelective(BaseCompany baseCompany) { 
        baseCompanyService.updateSelective(baseCompany); 
    } 

    @RequestMapping("/load") 
    public BaseCompany load(Integer compid) { 
        BaseCompany baseCompany = baseCompanyService.findById(compid); 
        return baseCompany; 
    } 

    @RequestMapping("/list") 
    public List<BaseCompany> list()  { 
        List<BaseCompany> list = baseCompanyService.findAll(); 
        return list; 
    } 

    @RequestMapping("/search") 
    public List<BaseCompany> search(BaseCompany baseCompany) { 
        List<BaseCompany> list = baseCompanyService.search(baseCompany); 
        return list; 
    }

} 
