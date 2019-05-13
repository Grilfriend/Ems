package com.qhit.energyConsume.dao;

import org.apache.ibatis.annotations.Mapper;
import com.qhit.energyConsume.pojo.EnergyConsume;
import java.util.List;
import java.util.Map;

/** 
* Created by GeneratorCode on 2018/04/13
*/

@Mapper  
public interface IEnergyConsumeDao {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object object);

    List freeFind(String sql);

    List findAll();

    List findById(Object id);

    boolean freeUpdate(String sql);

    List<EnergyConsume> search(EnergyConsume energyConsume);

    List findByDevid(Object devid);

    List findByElectric(Object electric);

    List findByWater(Object water);

    List findByOil(Object oil);

    List findByReportid(Object reportid);

    EnergyConsume findcopnameen(Map map);

}