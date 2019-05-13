package com.qhit.produceRepair.service.impl;

import com.qhit.produceRepair.service.IProduceRepairService;
import java.util.List;
import com.qhit.produceRepair.dao.IProduceRepairDao;
import com.qhit.produceRepair.pojo.ProduceRepair;
import org.springframework.stereotype.Service;
import javax.annotation.Resource; 

/**
* Created by GeneratorCode on 2018/04/15
*/

@Service 
public class ProduceRepairServiceImpl  implements IProduceRepairService {

    @Resource 
    IProduceRepairDao dao;

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
        ProduceRepair produceRepair = findById(id); 
        return dao.delete(produceRepair); 
    } 

    @Override 
    public List findAll() { 
        return dao.findAll(); 
    } 

    @Override 
    public ProduceRepair findById(Object id) { 
        List<ProduceRepair> list = dao.findById(id); 
        return  list.get(0); 
    } 

    @Override 
    public List<ProduceRepair> search(ProduceRepair produceRepair) { 
        return dao.search(produceRepair); 
    } 

}