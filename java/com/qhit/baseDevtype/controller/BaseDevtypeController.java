package com.qhit.baseDevtype.controller; 

import com.qhit.baseDevtype.pojo.BaseDevtype; 
import com.qhit.baseDevtype.service.IBaseDevtypeService; 
import org.springframework.web.bind.annotation.RequestMapping; 
import javax.annotation.Resource; 
import java.util.List; 
import org.springframework.web.bind.annotation.RestController; 

/** 
* Created by GeneratorCode on 2018/04/03
*/ 

@RestController 
@RequestMapping("/baseDevtype") 
public class BaseDevtypeController { 

    @Resource 
    IBaseDevtypeService baseDevtypeService; 

    @RequestMapping("/insert") 
    public void insert(BaseDevtype baseDevtype) { 
        baseDevtypeService.insert(baseDevtype); 
    } 

    @RequestMapping("/delete") 
    public void delete(Integer typeid) { 
        baseDevtypeService.delete(typeid); 
    } 

    @RequestMapping("/update") 
    public void update(BaseDevtype baseDevtype) { 
        baseDevtypeService.update(baseDevtype); 
    } 

    @RequestMapping("/updateSelective") 
    public void updateSelective(BaseDevtype baseDevtype) { 
        baseDevtypeService.updateSelective(baseDevtype); 
    } 

    @RequestMapping("/load") 
    public BaseDevtype load(Integer typeid) { 
        BaseDevtype baseDevtype = baseDevtypeService.findById(typeid); 
        return baseDevtype; 
    } 

    @RequestMapping("/list") 
    public List<BaseDevtype> list()  { 
        List<BaseDevtype> list = baseDevtypeService.findAll(); 
        return list; 
    } 

    @RequestMapping("/search") 
    public List<BaseDevtype> search(BaseDevtype baseDevtype) { 
        List<BaseDevtype> list = baseDevtypeService.search(baseDevtype); 
        return list; 
    } 

} 
