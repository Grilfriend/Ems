package com.qhit.produceRepair.service;

import java.util.List;
import com.qhit.produceRepair.pojo.ProduceRepair;
/**
* Created by GeneratorCode on 2018/04/15
*/
public interface IProduceRepairService {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object id);

    List findAll();

    ProduceRepair findById(Object id);

    List<ProduceRepair> search(ProduceRepair produceRepair);

}