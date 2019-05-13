package com.qhit.baseCompany.service;

import java.util.List;
import com.qhit.baseCompany.pojo.BaseCompany;
/**
* Created by GeneratorCode on 2018/03/30
*/
public interface IBaseCompanyService {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object id);

    List findAll();

    BaseCompany findById(Object id);

    List<BaseCompany> search(BaseCompany baseCompany);

    BaseCompany findcopnameen(String year, Integer compid);

}