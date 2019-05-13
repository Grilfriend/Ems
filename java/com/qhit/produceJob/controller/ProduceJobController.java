package com.qhit.produceJob.controller; 

import com.qhit.produceJob.pojo.ProduceJob; 
import com.qhit.produceJob.service.IProduceJobService; 
import org.springframework.web.bind.annotation.RequestMapping; 
import javax.annotation.Resource; 
import java.util.List; 
import org.springframework.web.bind.annotation.RestController; 

/** 
* Created by GeneratorCode on 2018/04/15
*/ 

@RestController 
@RequestMapping("/produceJob") 
public class ProduceJobController { 

    @Resource 
    IProduceJobService produceJobService; 

    @RequestMapping("/insert") 
    public void insert(ProduceJob produceJob) { 
        produceJobService.insert(produceJob); 
    } 

    @RequestMapping("/delete") 
    public void delete(Integer jobid) { 
        produceJobService.delete(jobid); 
    } 

    @RequestMapping("/update") 
    public void update(ProduceJob produceJob) { 
        produceJobService.update(produceJob); 
    } 

    @RequestMapping("/updateSelective") 
    public void updateSelective(ProduceJob produceJob) { 
        produceJobService.updateSelective(produceJob); 
    } 

    @RequestMapping("/load") 
    public ProduceJob load(Integer jobid) { 
        ProduceJob produceJob = produceJobService.findById(jobid); 
        return produceJob; 
    } 

    @RequestMapping("/list") 
    public List<ProduceJob> list()  { 
        List<ProduceJob> list = produceJobService.findAll(); 
        return list; 
    } 

    @RequestMapping("/search") 
    public List<ProduceJob> search(ProduceJob produceJob) { 
        List<ProduceJob> list = produceJobService.search(produceJob); 
        return list; 
    } 

} 
