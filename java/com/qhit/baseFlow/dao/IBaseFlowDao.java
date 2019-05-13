package com.qhit.baseFlow.dao;

import org.apache.ibatis.annotations.Mapper;
import com.qhit.baseFlow.pojo.BaseFlow;
import java.util.List;
import java.util.Map;

/** 
* Created by GeneratorCode on 2018/04/09
*/

@Mapper  
public interface IBaseFlowDao {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object object);

    List freeFind(String sql);

    List findAll();

    List findById(Object id);

    boolean freeUpdate(String sql);

    List<BaseFlow> search(BaseFlow baseFlow);

    List findByFlowname(Object flowname);

    List findByDljid(Object dljid);

    List findByZcjid(Object zcjid);

    List findByPdjid(Object pdjid);

    List findByCompid(Object compid);

    List<Map> flowamount(Map map);

    List<Map> findflowennger(Map map);

}