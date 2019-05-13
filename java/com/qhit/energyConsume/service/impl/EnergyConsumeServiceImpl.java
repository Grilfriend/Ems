package com.qhit.energyConsume.service.impl;

import com.qhit.energyConsume.service.IEnergyConsumeService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.qhit.energyConsume.dao.IEnergyConsumeDao;
import com.qhit.energyConsume.pojo.EnergyConsume;
import org.springframework.stereotype.Service;
import javax.annotation.Resource; 

/**
* Created by GeneratorCode on 2018/04/13
*/

@Service 
public class EnergyConsumeServiceImpl  implements IEnergyConsumeService {

    @Resource 
    IEnergyConsumeDao dao;

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
        EnergyConsume energyConsume = findById(id); 
        return dao.delete(energyConsume); 
    } 

    @Override 
    public List findAll() { 
        return dao.findAll(); 
    } 

    @Override 
    public EnergyConsume findById(Object id) { 
        List<EnergyConsume> list = dao.findById(id); 
        return  list.get(0); 
    } 

    @Override 
    public List<EnergyConsume> search(EnergyConsume energyConsume) { 
        return dao.search(energyConsume); 
    }

    @Override
    public EnergyConsume findcopnameen(String year, Integer compid) {
        Map map=new HashMap();
        map.put("year",year);
        map.put("compid",compid);
        return dao.findcopnameen(map);
    }
}