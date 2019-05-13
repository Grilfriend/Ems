package com.qhit.baseFlow.service;

import java.util.List;
import java.util.Map;

import com.qhit.baseFlow.pojo.BaseFlow;
/**
* Created by GeneratorCode on 2018/04/09
*/
public interface IBaseFlowService {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object id);

    List findAll();

    BaseFlow findById(Object id);

    List<BaseFlow> search(BaseFlow baseFlow);

    List findByDljid(Object dljid);

    List findByZcjid(Object zcjid);

    List findByPdjid(Object pdjid);

    List findByCompid(Object compid);

    List<Map> flowamount(String year,Integer compid);

}