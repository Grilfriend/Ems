package com.qhit.baseUser.dao;

import org.apache.ibatis.annotations.Mapper;
import com.qhit.baseUser.pojo.BaseUser;
import java.util.List;

/** 
* Created by GeneratorCode on 2018/03/20
*/

@Mapper  
public interface IBaseUserDao {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object object);

    List freeFind(String sql);

    List findAll();

    List findById(Object id);

    boolean freeUpdate(String sql);

    List<BaseUser> search(BaseUser baseUser);

    List findByCname(Object cname);

    List findByUsername(Object username);

    List findByPassword(Object password);

    List findByTelno(Object telno);

    List findByEmail(Object email);

    List findBySex(Object sex);

    List findByCompid(Object compid);

}