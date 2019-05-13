package com.qhit.produceJob.service;

import java.util.List;
import java.util.Map;

import com.qhit.baseDevice.pojo.BaseDevice;
import com.qhit.baseDevtype.pojo.BaseDevtype;
import com.qhit.produceJob.pojo.ProduceJob;
/**
* Created by GeneratorCode on 2018/04/15
*/
public interface IProduceJobService {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object id);

    List findAll();

    ProduceJob findById(Object id);

    List<ProduceJob> search(ProduceJob produceJob);


    List<Map> devamount(String year,Integer flowid);

    List<Map> findradio(String year);

    List<Map> selectDevConsume(String year, List<BaseDevice> devices);

    List<Map> selectDevTypeConsume(String year, List<BaseDevtype> devTypeList);

    List<Map> selectElectricConsume(String year, List<BaseDevice> devices);

    List<Map> selectWaterConsume(String year, List<BaseDevice> devices);

    List<Map> selectOilConsume(String year, List<BaseDevice> devices);

}