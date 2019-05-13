package com.qhit.produceReport.controller; 

import com.qhit.produceReport.pojo.ProduceReport; 
import com.qhit.produceReport.service.IProduceReportService; 
import org.springframework.web.bind.annotation.RequestMapping; 
import javax.annotation.Resource; 
import java.util.List; 
import org.springframework.web.bind.annotation.RestController; 

/** 
* Created by GeneratorCode on 2018/04/17
*/ 

@RestController 
@RequestMapping("/produceReport") 
public class ProduceReportController { 

    @Resource 
    IProduceReportService produceReportService; 

    @RequestMapping("/insert") 
    public void insert(ProduceReport produceReport) { 
        produceReportService.insert(produceReport); 
    } 

    @RequestMapping("/delete") 
    public void delete(Integer reportid) { 
        produceReportService.delete(reportid); 
    } 

    @RequestMapping("/update") 
    public void update(ProduceReport produceReport) { 
        produceReportService.update(produceReport); 
    } 

    @RequestMapping("/updateSelective") 
    public List updateSelective(ProduceReport produceReport) {
       return produceReportService.updateSelective(produceReport);
    } 

    @RequestMapping("/load") 
    public ProduceReport load(Integer reportid) { 
        ProduceReport produceReport = produceReportService.findById(reportid); 
        return produceReport; 
    } 

    @RequestMapping("/list") 
    public List<ProduceReport> list()  { 
        List<ProduceReport> list = produceReportService.findAll(); 
        return list; 
    } 

    @RequestMapping("/search") 
    public List<ProduceReport> search(ProduceReport produceReport) { 
        List<ProduceReport> list = produceReportService.search(produceReport);
        return list; 
    }

    @RequestMapping("/completeTask")
    public List completeTask(int reportid, int flowid, String startjobtime, String completetime) {
     return  produceReportService.completeTask(reportid,flowid,startjobtime,completetime);

    }

} 
