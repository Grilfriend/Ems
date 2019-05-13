package com.qhit.energyConsume.pojo;


/** 
* Created by GeneratorCode on 2018/04/13
*/ 

public class EnergyConsume { 
    private Integer consumeid;    //主键能耗id 
    private Integer devid;    //设备名称 
    private Double electric;    //电耗(kw.h) 
    private Double water;    //水耗(吨) 
    private Double oil;    //油耗(L) 
    private Integer reportid;    //报岗id

    private String compname;

    public Integer getConsumeid() { 
        return consumeid;
    }

    public void setConsumeid(Integer consumeid) { 
        this.consumeid = consumeid;
    } 

    public Integer getDevid() { 
        return devid;
    }

    public void setDevid(Integer devid) { 
        this.devid = devid;
    } 

    public Double getElectric() { 
        return electric;
    }

    public void setElectric(Double electric) { 
        this.electric = electric;
    } 

    public Double getWater() { 
        return water;
    }

    public void setWater(Double water) { 
        this.water = water;
    } 

    public Double getOil() { 
        return oil;
    }

    public void setOil(Double oil) { 
        this.oil = oil;
    } 

    public Integer getReportid() { 
        return reportid;
    }

    public void setReportid(Integer reportid) { 
        this.reportid = reportid;
    }

    public String getCompname() {
        return compname;
    }

    public void setCompname(String compname) {
        this.compname = compname;
    }
}