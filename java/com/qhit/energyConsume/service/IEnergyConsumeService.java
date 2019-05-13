package com.qhit.energyConsume.service;

import java.util.List;
import java.util.Map;

import com.qhit.energyConsume.pojo.EnergyConsume;
/**
* Created by GeneratorCode on 2018/04/13
*/
public interface IEnergyConsumeService {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object id);

    List findAll();

    EnergyConsume findById(Object id);

    List<EnergyConsume> search(EnergyConsume energyConsume);

    EnergyConsume findcopnameen(String year,Integer compid);

}