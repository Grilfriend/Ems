package com.qhit.baseDevice.controller; 

import com.qhit.baseDevice.pojo.BaseDevice; 
import com.qhit.baseDevice.service.IBaseDeviceService;
import com.qhit.utils.CommonUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import org.springframework.web.bind.annotation.RestController; 

/** 
* Created by GeneratorCode on 2018/03/30
*/ 

@RestController 
@RequestMapping("/baseDevice") 
public class BaseDeviceController { 

    @Resource 
    IBaseDeviceService baseDeviceService; 

    @RequestMapping("/insert") 
    public void insert(BaseDevice baseDevice) { 
        baseDeviceService.insert(baseDevice); 
    } 

    @RequestMapping("/delete") 
    public void delete(Integer devid) { 
        baseDeviceService.delete(devid); 
    } 

    @RequestMapping("/update") 
    public void update(BaseDevice baseDevice) { 
        baseDeviceService.update(baseDevice); 
    } 

    @RequestMapping("/updateSelective") 
    public void updateSelective(BaseDevice baseDevice) { 
        baseDeviceService.updateSelective(baseDevice); 
    } 

    @RequestMapping("/load") 
    public BaseDevice load(Integer devid) { 
        BaseDevice baseDevice = baseDeviceService.findById(devid); 
        return baseDevice; 
    } 

    @RequestMapping("/list") 
    public List<BaseDevice> list()  { 
        List<BaseDevice> list = baseDeviceService.findAll(); 
        return list; 
    } 

    @RequestMapping("/search") 
    public List<BaseDevice> search(BaseDevice baseDevice) { 
        List<BaseDevice> list = baseDeviceService.search(baseDevice); 
        return list; 
    }

    @RequestMapping("/findDljByCompid")
    public List<BaseDevice> findByDljid()  {
        List<BaseDevice> list = baseDeviceService.findByTypeid(1);
        System.out.println(list);
        return list;
    }

    @RequestMapping("/findCzjByCompid")
    public List<BaseDevice> findCzjByCompid()  {
        List<BaseDevice> list = baseDeviceService.findByTypeid(2);
        System.out.println(list);
        return list;
    }

    @RequestMapping("/findPdjByCompid")
    public List<BaseDevice> findPdjByCompid()  {
        List<BaseDevice> list = baseDeviceService.findByTypeid(3);
        System.out.println(list);
        return list;
    }

    @RequestMapping("/exportToExcel")
    public void exportToExcel() throws Exception {
        String title = "商品代码表";
        String[] name = {"id","港口名","负责人","电话","地址"};
        //获取数据
        Connection connection = CommonUtil.getConnection();
        Statement statement = connection.createStatement();
        String sql = "select compid,compname,contacts,comptel,address from base_company";
        ResultSet rs = statement.executeQuery(sql);

        CommonUtil.exportExcel(title,name,rs);

    }
} 
