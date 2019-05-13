package com.qhit.reports;

import com.qhit.baseCompany.pojo.BaseCompany;
import com.qhit.baseCompany.service.impl.BaseCompanyServiceImpl;
import com.qhit.baseDevice.pojo.BaseDevice;
import com.qhit.baseDevice.service.IBaseDeviceService;
import com.qhit.baseDevtype.pojo.BaseDevtype;
import com.qhit.baseDevtype.service.IBaseDevtypeService;
import com.qhit.baseFlow.pojo.BaseFlow;
import com.qhit.baseFlow.service.IBaseFlowService;
import com.qhit.baseFlow.service.impl.BaseFlowServiceImpl;
import com.qhit.baseUser.pojo.BaseUser;
import com.qhit.energyConsume.service.impl.EnergyConsumeServiceImpl;
import com.qhit.produceJob.service.impl.ProduceJobServiceImpl;
import com.qhit.produceReport.service.IProduceReportService;
import com.qhit.produceReport.service.impl.ProduceReportServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/04/20
 */
@RestController
@RequestMapping("/energyConsume")
public class EnergyConsume {

    @Resource
    IBaseDevtypeService baseDevtypeService;
    @Resource
    IBaseDeviceService baseDeviceService;
    @Resource
    EnergyConsumeServiceImpl energyConsumeService;
    @Resource
    BaseCompanyServiceImpl baseCompanyService;
    @Resource
    ProduceJobServiceImpl produceJobService;
    @Resource
    BaseFlowServiceImpl baseFlowService;
    @Resource
    ProduceReportServiceImpl produceReportService;




    @RequestMapping("/flowConsume")
    public Object flowConsume(String year, HttpSession session){
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
        List<Map> rows = produceReportService.selectFlowConsume(year,flows);
        map.put("columns",flowArr);
        map.put("rows",rows);
        return  map;
    }

    @RequestMapping("/devTypeConsume")
    public Object devTypeConsume(String year){
        Map map = new HashMap();
        List<BaseDevtype> devTypeList = baseDevtypeService.findAll();
//        列属性columns
        String[] devTypeArr = new String[devTypeList.size()+1];
        devTypeArr[0]="月份";
        for (int i = 0; i <devTypeList.size() ; i++) {
            devTypeArr[i+1]=devTypeList.get(i).getTypename();
        }
//        行属性rows
        List<Map> rows = produceJobService.selectDevTypeConsume(year,devTypeList);
        map.put("columns",devTypeArr);
        map.put("rows",rows);
        return  map;
    }
    @RequestMapping("/devConsume")
    public Object devConsume(String year, HttpSession session){
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
        List<Map> rows = produceJobService.selectDevConsume(year,devices);
        map.put("columns",devArr);
        map.put("rows",rows);
        return  map;
    }
    @RequestMapping("/electricConsume")
    public Object electricConsume(String year, HttpSession session){
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
        List<Map> rows = produceJobService.selectElectricConsume(year,devices);
        map.put("columns",devArr);
        map.put("rows",rows);
        return  map;
    }

    @RequestMapping("/waterConsume")
    public Object waterConsume(String year, HttpSession session){
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
        List<Map> rows = produceJobService.selectWaterConsume(year,devices);
        map.put("columns",devArr);
        map.put("rows",rows);
        return  map;
    }
    @RequestMapping("/oilConsume")
    public Object oilConsume(String year, HttpSession session){
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
        List<Map> rows = produceJobService.selectOilConsume(year,devices);
        map.put("columns",devArr);
        map.put("rows",rows);
        return  map;
    }


    @RequestMapping("/model")
    public Object model(String year,HttpSession session){
        Map map = new HashMap();
        BaseUser baseUser = (BaseUser) session.getAttribute("baseUser");
        Integer compid = baseUser.getCompid();
        BaseCompany findcopnameen = baseCompanyService.findcopnameen(year, compid);
        Double consume=findcopnameen.getElectric()+findcopnameen.getOil()+findcopnameen.getWater();




        map.put("comp",findcopnameen.getCompname());
        map.put("consume",consume);



        return  map;
    }



}
