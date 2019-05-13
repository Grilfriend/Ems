package com.qhit.produceRepair.controller; 

import com.qhit.produceRepair.pojo.ProduceRepair; 
import com.qhit.produceRepair.service.IProduceRepairService; 
import org.springframework.web.bind.annotation.RequestMapping; 
import javax.annotation.Resource; 
import java.util.List; 
import org.springframework.web.bind.annotation.RestController; 

/** 
* Created by GeneratorCode on 2018/04/15
*/ 

@RestController 
@RequestMapping("/produceRepair") 
public class ProduceRepairController { 

    @Resource 
    IProduceRepairService produceRepairService; 

    @RequestMapping("/insert") 
    public void insert(ProduceRepair produceRepair) { 
        produceRepairService.insert(produceRepair); 
    } 

    @RequestMapping("/delete") 
    public void delete(Integer repairid) { 
        produceRepairService.delete(repairid); 
    } 

    @RequestMapping("/update") 
    public void update(ProduceRepair produceRepair) { 
        produceRepairService.update(produceRepair); 
    } 

    @RequestMapping("/updateSelective") 
    public void updateSelective(ProduceRepair produceRepair) { 
        produceRepairService.updateSelective(produceRepair); 
    } 

    @RequestMapping("/load") 
    public ProduceRepair load(Integer repairid) { 
        ProduceRepair produceRepair = produceRepairService.findById(repairid); 
        return produceRepair; 
    } 

    @RequestMapping("/list") 
    public List<ProduceRepair> list()  { 
        List<ProduceRepair> list = produceRepairService.findAll(); 
        return list; 
    } 

    @RequestMapping("/search") 
    public List<ProduceRepair> search(ProduceRepair produceRepair) { 
        List<ProduceRepair> list = produceRepairService.search(produceRepair); 
        return list; 
    } 

} 
