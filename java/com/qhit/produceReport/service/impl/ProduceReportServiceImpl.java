package com.qhit.produceReport.service.impl;

import com.qhit.baseDevice.pojo.BaseDevice;
import com.qhit.baseDevice.service.impl.BaseDeviceServiceImpl;
import com.qhit.baseDevtype.pojo.BaseDevtype;
import com.qhit.baseFlow.pojo.BaseFlow;
import com.qhit.baseFlow.service.impl.BaseFlowServiceImpl;
import com.qhit.energyConsume.pojo.EnergyConsume;
import com.qhit.energyConsume.service.impl.EnergyConsumeServiceImpl;
import com.qhit.produceJob.pojo.ProduceJob;
import com.qhit.produceJob.service.impl.ProduceJobServiceImpl;
import com.qhit.produceReport.service.IProduceReportService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.qhit.produceReport.dao.IProduceReportDao;
import com.qhit.produceReport.pojo.ProduceReport;
import com.qhit.utils.Get;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
* Created by GeneratorCode on 2018/04/17
*/

@Service 
public class ProduceReportServiceImpl  implements IProduceReportService {

    @Resource 
    IProduceReportDao dao;

    @Resource
    BaseFlowServiceImpl baseFlowService;

    @Resource
    ProduceJobServiceImpl produceJobService;

    @Resource
    EnergyConsumeServiceImpl energyConsumeService;

    @Override 
    public boolean insert(Object object) { 
        return dao.insert(object); 
    } 

    @Override 
    public boolean update(Object object) { 
        return dao.update(object); 
    } 

    @Override 
    public List updateSelective(Object object) {
        boolean s = dao.updateSelective(object);
        List all = findAll();
        return all;

    } 

    @Override 
    public boolean delete(Object id) { 
        ProduceReport produceReport = findById(id); 
        return dao.delete(produceReport); 
    } 

    @Override 
    public List findAll() {
        List<ProduceReport> all = dao.findAll();
        for (int i=0;i<all.size();i++){
            if (all.get(i).getStartjobtime()==null&&all.get(i).getCompletetime()==null){
                all.get(i).setStatus("未完成");
            }
            else if (all.get(i).getStartjobtime()!=null&&all.get(i).getCompletetime()==null){
                all.get(i).setStatus("作业中");
            }
            else {
                all.get(i).setStatus("已完成");
            }
        }
        return all;
    } 

    @Override 
    public ProduceReport findById(Object id) { 
        List<ProduceReport> list = dao.findById(id); 
        return  list.get(0); 
    } 

    @Override 
    public List<ProduceReport> search(ProduceReport produceReport) { 
        return dao.search(produceReport); 
    }
/*4 开发中控功能
    结束作业按钮：
    开发compoleteTask方法  接收参数：reportid,flowid,startjobtime,completetime
    操作表：
            (1)更新报岗表  更新flowid,startjobtime,completetime
               (2)插入作业信息表
            (3)插入能耗信息表*/

    @Override
    @Transactional
    public List completeTask(int reportid, int flowid, String startjobtime, String completetime) {
       //更新宝钢
        ProduceReport produceReport=new ProduceReport();
        produceReport.setReportid(reportid);
        produceReport.setFlowid(flowid);
        produceReport.setStartjobtime(startjobtime);
        //工作时长
       /* double v = Get.GetTime(startjobtime, completetime);
        String a=v+"";
        System.out.println(a);
        produceReport.setCompletetime(a);*/
        produceReport.setCompletetime(completetime);
        boolean b = dao.updateSelective(produceReport);

               /* (2)插入作业信息表*/
        ProduceJob produceJob=new ProduceJob();
        ProduceReport byId1 = findById(reportid);

        BaseFlow byId = baseFlowService.findById(flowid);


        double v = Get.GetTime(startjobtime, completetime);




       //斗轮机
        produceJob.setStarttime(startjobtime);
        produceJob.setCompletetime(completetime);
        produceJob.setDevid(byId.getDljid());
        produceJob.setDuration(v);
        produceJob.setReportid(reportid);
        produceJob.setAmount(byId1.getCapacity()*0.4);
        produceJobService.insert(produceJob);
       //装载机
        produceJob.setStarttime(startjobtime);
        produceJob.setCompletetime(completetime);
        produceJob.setDevid(byId.getZcjid());
        produceJob.setDuration(v);
        produceJob.setReportid(reportid);
        produceJob.setAmount(byId1.getCapacity()*0.4);
        produceJobService.insert(produceJob);
        //皮带机
        produceJob.setStarttime(startjobtime);
        produceJob.setCompletetime(completetime);
        produceJob.setDevid(byId.getPdjid());
        produceJob.setDuration(v);
        produceJob.setReportid(reportid);
        produceJob.setAmount(byId1.getCapacity()*0.2);
        produceJobService.insert(produceJob);


               /* (3)插入能耗信息表*/
       /* Random random = new Random();
        int a = random.nextInt(5);*///随机生成0~4中间的数字

        Random random = new Random();
        EnergyConsume energyConsume=new EnergyConsume();

         //斗轮机
        energyConsume.setDevid(byId.getDljid());
        //电耗
        int a = random.nextInt(201)+100;
        energyConsume.setElectric((byId1.getCapacity()*0.4)*a);
        //水耗
        int d= random.nextInt(10)+1;
        energyConsume.setWater((byId1.getCapacity()*0.4)*d);
        //油耗
        int n= random.nextInt(31)+10;
        energyConsume.setOil((byId1.getCapacity()*0.4)*n);
        energyConsume.setReportid(reportid);
        energyConsumeService.insert(energyConsume);

        //装载机
        energyConsume.setDevid(byId.getZcjid());
        //电耗
        int e = random.nextInt(201)+100;
        energyConsume.setElectric((byId1.getCapacity()*0.4)*e);
        //水耗
        int f= random.nextInt(10)+1;
        energyConsume.setWater((byId1.getCapacity()*0.4)*f);
        //油耗
        int g= random.nextInt(31)+10;
        energyConsume.setOil((byId1.getCapacity()*0.4)*g);
        energyConsume.setReportid(reportid);
        energyConsumeService.insert(energyConsume);

        //皮带机
        energyConsume.setDevid(byId.getPdjid());
        //电耗
        int h= random.nextInt(201)+100;
        energyConsume.setElectric((byId1.getCapacity()*0.2)*h);
        //水耗
        int i= random.nextInt(10)+1;
        energyConsume.setWater((byId1.getCapacity()*0.2)*i);
        //油耗
        int j= random.nextInt(31)+10;
        energyConsume.setOil((byId1.getCapacity()*0.2)*j);
        energyConsume.setReportid(reportid);
        energyConsumeService.insert(energyConsume);



        List all = findAll();
        return all;
    }

    @Override
    public List<Map> selectFlowAmount(String year, List<BaseFlow> flows) {
        Map map = new HashMap();
        map.put("year",year);
        map.put("flows",flows);
        return dao.selectFlowAmount(map);
    }

    @Override
    public List<Map> selectDevTypeAmount(String year, List<BaseDevtype> devTypeList) {
        Map map = new HashMap();
        map.put("year",year);
        map.put("devTypeList",devTypeList);
        return dao.selectDevTypeAmount(map);
    }

    @Override
    public List<Map> selectDevAmount(String year, List<BaseDevice> devices) {
        Map map = new HashMap();
        map.put("year",year);
        map.put("devices",devices);
        return dao.selectDevAmount(map);
    }

    @Override
    public List<Map> selectFlowConsume(String year, List<BaseFlow> flows) {
        Map map = new HashMap();
        map.put("year",year);
        map.put("flows",flows);
        return dao.selectFlowConsume(map);
    }

    @Override
    public ProduceReport findYear(String year,Integer compid) {
        ProduceReport produceReport=new ProduceReport();
        produceReport.setCompid(compid);
        produceReport.setStartjobtime(year);
        List<ProduceReport> year1 = dao.findYear(produceReport);
        return year1.get(0);
    }


    @Override
    public Map<String, Object> usage(String year) {
        String[] columns = {"港口名称","斗轮机","皮带机","装船机"};
        Map<String,Object> map = new HashMap<>();
        map.put("year",year);
        List<Map> rows = dao.usage(map);
        Map<String,Object> data = new HashMap<>();
        data.put("columns",columns);
        data.put("rows",rows);
        return data;
    }

    @Override
    public Map<String, Object> intactRatio(String year) {
        String[] columns = {"港口名称","斗轮机","皮带机","装船机"};
        Map<String,Object> map = new HashMap<>();
        map.put("year",year);
        List<Map> rows = dao.intactRatio(map);
        Map<String,Object> data = new HashMap<>();
        data.put("columns",columns);
        data.put("rows",rows);
        return data;
    }

    @Override
    public List<Map> cost(String year, Integer compid) {
        Map<String,Object> map = new HashMap<>();
        map.put("year",year);
        map.put("compid",compid);
        List<Map> rows = dao.cost(map);
        return rows;
    }

    @Override
    public Map<String, Object> amount(String year) {
        String[] columns = {"港口名称","斗轮机","皮带机","装船机"};
        Map<String,Object> map = new HashMap<>();
        map.put("year",year);
        List<Map> rows = dao.amount(map);
        Map<String,Object> data = new HashMap<>();
        data.put("columns",columns);
        data.put("rows",rows);
        return data;
    }

    @Override
    public Map<String, Object> consume(String year) {
        String[] columns = {"港口名称","斗轮机","皮带机","装船机"};
        Map<String,Object> map = new HashMap<>();
        map.put("year",year);
        List<Map> rows = dao.consume(map);
        Map<String,Object> data = new HashMap<>();
        data.put("columns",columns);
        data.put("rows",rows);
        return data;
    }
}