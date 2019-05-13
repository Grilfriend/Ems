package com.qhit.baseCompany.dao;

import org.apache.ibatis.annotations.Mapper;
import com.qhit.baseCompany.pojo.BaseCompany;
import java.util.List;
import java.util.Map;

/** 
* Created by GeneratorCode on 2018/03/30
*/

@Mapper  
public interface IBaseCompanyDao {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object object);

    List freeFind(String sql);

    List findAll();

    List findById(Object id);

    boolean freeUpdate(String sql);

    List<BaseCompany> search(BaseCompany baseCompany);

    List findByCompname(Object compname);

    List findByContacts(Object contacts);

    List findByComptel(Object comptel);

    List findByIndustry(Object industry);

    List findByAddress(Object address);

    List findcopnameen(Map map);

}