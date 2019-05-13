package com.qhit.produceJob.service.impl;

import com.qhit.baseDevice.pojo.BaseDevice;
import com.qhit.baseDevtype.pojo.BaseDevtype;
import com.qhit.produceJob.service.IProduceJobService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.qhit.produceJob.dao.IProduceJobDao;
import com.qhit.produceJob.pojo.ProduceJob;
import org.springframework.stereotype.Service;
import javax.annotation.Resource; 

/**
* Created by GeneratorCode on 2018/04/15
*/

@Service 
public class ProduceJobServiceImpl  implements IProduceJobService {

    @Resource 
    IProduceJobDao dao;

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
        ProduceJob produceJob = findById(id); 
        return dao.delete(produceJob); 
    } 

    @Override 
    public List findAll() { 
        return dao.findAll(); 
    } 

    @Override 
    public ProduceJob findById(Object id) { 
        List<ProduceJob> list = dao.findById(id); 
        return  list.get(0); 
    } 

    @Override 
    public List<ProduceJob> search(ProduceJob produceJob) { 
        return dao.search(produceJob); 
    }


    @Override
    public List<Map> devamount(String year, Integer flowid) {
        Map map=new HashMap();
        map.put("year",year);
        map.put("flowid",flowid);
        return dao.devamount(map);
    }


    @Override
    public List<Map> findradio(String year) {
        Map map=new HashMap();
        map.put("year",year);
        return dao.findradio(map);
    }

    @Override
    public List<Map> selectDevConsume(String year, List<BaseDevice> devices) {
        Map map = new HashMap();
        map.put("year",year);
        map.put("devices",devices);
        return dao.selectDevConsume(map);
    }

    @Override
    public List<Map> selectDevTypeConsume(String year, List<BaseDevtype> devTypeList) {
        Map map = new HashMap();
        map.put("year",year);
        map.put("devTypeList",devTypeList);
        return dao.selectDevTypeConsume(map);
    }


    @Override
    public List<Map> selectElectricConsume(String year, List<BaseDevice> devices) {
        Map map = new HashMap();
        map.put("year",year);
        map.put("devices",devices);
        return dao.selectElectricConsume(map);
    }

    @Override
    public List<Map> selectWaterConsume(String year, List<BaseDevice> devices) {
        Map map = new HashMap();
        map.put("year",year);
        map.put("devices",devices);
        return dao.selectWaterConsume(map);
    }

    @Override
    public List<Map> selectOilConsume(String year, List<BaseDevice> devices) {
        Map map = new HashMap();
        map.put("year",year);
        map.put("devices",devices);
        return dao.selectOilConsume(map);
    }
}