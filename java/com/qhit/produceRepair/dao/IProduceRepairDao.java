package com.qhit.produceRepair.dao;

import org.apache.ibatis.annotations.Mapper;
import com.qhit.produceRepair.pojo.ProduceRepair;
import java.util.List;

/** 
* Created by GeneratorCode on 2018/04/15
*/

@Mapper  
public interface IProduceRepairDao {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object object);

    List freeFind(String sql);

    List findAll();

    List findById(Object id);

    boolean freeUpdate(String sql);

    List<ProduceRepair> search(ProduceRepair produceRepair);

    List findByDevid(Object devid);

    List findByCause(Object cause);

    List findByCost(Object cost);

    List findByRepairdate(Object repairdate);

}