package com.qhit.baseCompany.service.impl;

import com.qhit.baseCompany.service.IBaseCompanyService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.qhit.baseCompany.dao.IBaseCompanyDao;
import com.qhit.baseCompany.pojo.BaseCompany;
import org.springframework.stereotype.Service;
import javax.annotation.Resource; 

/**
* Created by GeneratorCode on 2018/03/30
*/

@Service 
public class BaseCompanyServiceImpl  implements IBaseCompanyService {

    @Resource 
    IBaseCompanyDao dao;

    @Override 
    public boolean insert(Object object) { 
        return dao.insert(object); 
    } 

    @Override 
    public boolean update(Object object) { 
        return dao.update(object); 
    } 

    @Override 
    public boolean updateSelective(Object object) { 
        return dao.updateSelective(object); 
    } 

    @Override 
    public boolean delete(Object id) { 
        BaseCompany baseCompany = findById(id); 
        return dao.delete(baseCompany); 
    } 

    @Override 
    public List findAll() { 
        return dao.findAll(); 
    } 

    @Override 
    public BaseCompany findById(Object id) { 
        List<BaseCompany> list = dao.findById(id); 
        return  list.get(0); 
    } 

    @Override 
    public List<BaseCompany> search(BaseCompany baseCompany) { 
        return dao.search(baseCompany); 
    }


    @Override
    public BaseCompany findcopnameen(String year, Integer compid) {
        Map map=new HashMap();
        map.put("year",year);
        map.put("compid",compid);
        List<BaseCompany> findcopnameen = dao.findcopnameen(map);
        return findcopnameen.get(0);
    }
}