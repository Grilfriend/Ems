package com.qhit.produceReport.service;

import java.util.List;
import java.util.Map;

import com.qhit.baseDevice.pojo.BaseDevice;
import com.qhit.baseDevtype.pojo.BaseDevtype;
import com.qhit.baseFlow.pojo.BaseFlow;
import com.qhit.produceReport.pojo.ProduceReport;
/**
* Created by GeneratorCode on 2018/04/17
*/
public interface IProduceReportService {

    boolean insert(Object object);

    boolean  update(Object object);

    List updateSelective(Object object);

    boolean delete(Object id);

    List findAll();

    ProduceReport findById(Object id);

    List<ProduceReport> search(ProduceReport produceReport);



    List completeTask(int reportid ,int flowid,String intstartjobtime,String completetime);

    List<Map> selectFlowAmount(String year, List<BaseFlow> flows);

    List<Map> selectDevTypeAmount(String year, List<BaseDevtype> devTypeList);

    List<Map> selectDevAmount(String year, List<BaseDevice> devices);

    List<Map> selectFlowConsume(String year, List<BaseFlow> flows);

    ProduceReport findYear(String year,Integer compid);


    Map<String,Object> usage(String year);

    Map<String,Object> intactRatio(String year);

    List<Map> cost(String year, Integer compid);

    Map<String,Object> amount(String year);

    Map<String,Object> consume(String year);
}