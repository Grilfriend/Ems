package com.qhit.reports;

import com.qhit.baseCompany.pojo.BaseCompany;
import com.qhit.baseCompany.service.impl.BaseCompanyServiceImpl;
import com.qhit.baseDevice.pojo.BaseDevice;
import com.qhit.baseDevice.service.IBaseDeviceService;
import com.qhit.baseDevtype.pojo.BaseDevtype;
import com.qhit.baseDevtype.service.IBaseDevtypeService;
import com.qhit.baseFlow.pojo.BaseFlow;
import com.qhit.baseFlow.service.IBaseFlowService;
import com.qhit.baseUser.pojo.BaseUser;
import com.qhit.produceJob.service.impl.ProduceJobServiceImpl;
import com.qhit.produceReport.pojo.ProduceReport;
import com.qhit.produceReport.service.IProduceReportService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/4/21 0013.
 */
@RestController
@RequestMapping("/jobAmount")
public class JobAmount {

    @Resource
    IBaseFlowService baseFlowService;
    @Resource
    IProduceReportService produceReportService;
    @Resource
    IBaseDevtypeService baseDevtypeService;
    @Resource
    IBaseDeviceService baseDeviceService;
    @Resource
    BaseCompanyServiceImpl baseCompanyService;
    @Resource
    ProduceJobServiceImpl produceJobService;

    @RequestMapping("/flowAmount")
    public Object flowAmount(String year, HttpSession session){
        Map map = new HashMap();
        BaseUser baseUser = (BaseUser) session.getAttribute("baseUser");
        Integer compid = baseUser.getCompid();
        List<BaseFlow> flows = baseFlowService.findByCompid(compid);
//        列属性columns
        String[] flowArr = new String[flows.size()+1];
        flowArr[0]="月份";
        for (int i = 0; i <flows.size() ; i++) {
            flowArr[i+1]=flows.get(i).getFlowname();
        }
//        行属性rows
        List<Map> rows = produceReportService.selectFlowAmount(year,flows);
        map.put("columns",flowArr);
        map.put("rows",rows);
        return  map;
    }

    @RequestMapping("/devTypeAmount")
    public Object devTypeAmount(String year){
        Map map = new HashMap();
        List<BaseDevtype> devTypeList = baseDevtypeService.findAll();
//        列属性columns
        String[] devTypeArr = new String[devTypeList.size()+1];
        devTypeArr[0]="月份";
        for (int i = 0; i <devTypeList.size() ; i++) {
            devTypeArr[i+1]=devTypeList.get(i).getTypename();
        }
//        行属性rows
        List<Map> rows = produceReportService.selectDevTypeAmount(year,devTypeList);
        map.put("columns",devTypeArr);
        map.put("rows",rows);
        return  map;
    }

    @RequestMapping("/devAmount")
    public Object devAmount(String year, HttpSession session){
        Map map = new HashMap();
        BaseUser baseUser = (BaseUser) session.getAttribute("baseUser");
        Integer compid = baseUser.getCompid();
        List<BaseDevice> devices = baseDeviceService.findByCompid(compid);
//        列属性columns
        String[] devArr = new String[devices.size()+1];
        devArr[0]="月份";
        for (int i = 0; i <devices.size() ; i++) {
            devArr[i+1]=devices.get(i).getDevname();
        }
//        行属性rows
        List<Map> rows = produceReportService.selectDevAmount(year,devices);
        map.put("columns",devArr);
        map.put("rows",rows);
        return  map;
    }




    @RequestMapping("/selectFlowConsume")
    public Object selectFlowConsume(String year, HttpSession session){
        Map map = new HashMap();
        BaseUser baseUser = (BaseUser) session.getAttribute("baseUser");
        Integer compid = baseUser.getCompid();
        List<BaseFlow> flows = baseFlowService.findByCompid(compid);
        System.out.println(flows.size());
//        列属性columns
        String[] flowArr = new String[flows.size()+1];
        flowArr[0]="月份";
        for (int i = 0; i <flows.size() ; i++) {
            flowArr[i+1]=flows.get(i).getFlowname();
        }
//        行属性rows
        List<Map> rows = produceReportService.selectFlowConsume(year,flows);
        map.put("columns",flowArr);
        map.put("rows",rows);
        return  map;
    }


}
