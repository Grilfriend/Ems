package com.qhit.baseFlow.service.impl;

import com.qhit.baseFlow.service.IBaseFlowService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.qhit.baseFlow.dao.IBaseFlowDao;
import com.qhit.baseFlow.pojo.BaseFlow;
import org.springframework.stereotype.Service;
import javax.annotation.Resource; 

/**
* Created by GeneratorCode on 2018/04/09
*/

@Service 
public class BaseFlowServiceImpl  implements IBaseFlowService {

    @Resource 
    IBaseFlowDao dao;

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
        BaseFlow baseFlow = findById(id); 
        return dao.delete(baseFlow); 
    } 

    @Override 
    public List findAll() { 
        return dao.findAll(); 
    } 

    @Override 
    public BaseFlow findById(Object id) { 
        List<BaseFlow> list = dao.findById(id); 
        return  list.get(0); 
    } 

    @Override 
    public List<BaseFlow> search(BaseFlow baseFlow) { 
        return dao.search(baseFlow); 
    }

    @Override
    public List findByZcjid(Object zcjid) {
        return dao.findByZcjid(zcjid);
    }

    @Override
    public List findByPdjid(Object pdjid) {
        return dao.findByPdjid(pdjid);
    }

    @Override
    public List findByCompid(Object compid) {
        return dao.findByCompid(compid);
    }

    @Override
    public List findByDljid(Object dljid) {
        return dao.findByDljid(dljid);
    }

    @Override
    public List<Map> flowamount(String year, Integer compid) {
        Map map = new HashMap();
        map.put("year",year);
        map.put("compid",compid);
        return dao.flowamount(map);
    }
}