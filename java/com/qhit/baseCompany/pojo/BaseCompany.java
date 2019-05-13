package com.qhit.baseCompany.pojo;


import com.qhit.produceJob.pojo.ProduceJob;
import com.qhit.produceReport.pojo.ProduceReport;

/**
* Created by GeneratorCode on 2018/03/30
*/ 

public class BaseCompany { 
    private Integer compid;    //主键 
    private String compname;    //公司名称 
    private String contacts;    //联系人 
    private String comptel;    //联系电话 
    private String industry;    //行业 
    private String address;    //地址

    private Double electric;    //电耗(kw.h)
    private Double water;    //水耗(吨)
    private Double oil;    //油耗(L)

    private ProduceReport produceReport;
    private ProduceJob produceJob;

    public Integer getCompid() { 
        return compid;
    }

    public void setCompid(Integer compid) { 
        this.compid = compid;
    } 

    public String getCompname() { 
        return compname;
    }

    public void setCompname(String compname) { 
        this.compname = compname;
    }
    public String getContacts() { 
        return contacts;
    }

    public void setContacts(String contacts) { 
        this.contacts = contacts;
    }
    public String getComptel() { 
        return comptel;
    }

    public void setComptel(String comptel) { 
        this.comptel = comptel;
    }
    public String getIndustry() { 
        return industry;
    }

    public void setIndustry(String industry) { 
        this.industry = industry;
    }
    public String getAddress() { 
        return address;
    }

    public void setAddress(String address) { 
        this.address = address;
    }


    public ProduceReport getProduceReport() {
        return produceReport;
    }

    public void setProduceReport(ProduceReport produceReport) {
        this.produceReport = produceReport;
    }

    public ProduceJob getProduceJob() {
        return produceJob;
    }

    public void setProduceJob(ProduceJob produceJob) {
        this.produceJob = produceJob;
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
}