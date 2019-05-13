package com.qhit.produceJob.dao;

import org.apache.ibatis.annotations.Mapper;
import com.qhit.produceJob.pojo.ProduceJob;
import java.util.List;
import java.util.Map;

/** 
* Created by GeneratorCode on 2018/04/15
*/

@Mapper  
public interface IProduceJobDao {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object object);

    List freeFind(String sql);

    List findAll();

    List findById(Object id);

    boolean freeUpdate(String sql);

    List<ProduceJob> search(ProduceJob produceJob);

    List findByDevid(Object devid);

    List findByStarttime(Object starttime);

    List findByCompletetime(Object completetime);

    List findByDuration(Object duration);

    List findByAmount(Object amount);

    List findByReportid(Object reportid);

    List<Map> devamount(Map map);

    List<Map> findradio(Map map);

    List<Map> findwanhaolu(Map map);


    List<Map> selectDevConsume(Map map);

    List<Map> selectDevTypeConsume(Map map);

    List<Map> selectElectricConsume(Map map);

    List<Map> selectWaterConsume(Map map);

    List<Map> selectOilConsume(Map map);

}