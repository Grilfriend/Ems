package com.qhit.energyConsume.controller; 

import com.qhit.energyConsume.pojo.EnergyConsume; 
import com.qhit.energyConsume.service.IEnergyConsumeService; 
import org.springframework.web.bind.annotation.RequestMapping; 
import javax.annotation.Resource; 
import java.util.List; 
import org.springframework.web.bind.annotation.RestController; 

/** 
* Created by GeneratorCode on 2018/04/13
*/ 

@RestController 
@RequestMapping("/energyConsume") 
public class EnergyConsumeController { 

    @Resource 
    IEnergyConsumeService energyConsumeService; 

    @RequestMapping("/insert") 
    public void insert(EnergyConsume energyConsume) { 
        energyConsumeService.insert(energyConsume); 
    } 

    @RequestMapping("/delete") 
    public void delete(Integer consumeid) { 
        energyConsumeService.delete(consumeid); 
    } 

    @RequestMapping("/update") 
    public void update(EnergyConsume energyConsume) { 
        energyConsumeService.update(energyConsume); 
    } 

    @RequestMapping("/updateSelective") 
    public void updateSelective(EnergyConsume energyConsume) { 
        energyConsumeService.updateSelective(energyConsume); 
    } 

    @RequestMapping("/load") 
    public EnergyConsume load(Integer consumeid) { 
        EnergyConsume energyConsume = energyConsumeService.findById(consumeid); 
        return energyConsume; 
    } 

    @RequestMapping("/list") 
    public List<EnergyConsume> list()  { 
        List<EnergyConsume> list = energyConsumeService.findAll(); 
        return list; 
    } 

    @RequestMapping("/search") 
    public List<EnergyConsume> search(EnergyConsume energyConsume) { 
        List<EnergyConsume> list = energyConsumeService.search(energyConsume); 
        return list; 
    } 

} 
