package com.qhit.produceReport.pojo;


import com.qhit.baseCompany.pojo.BaseCompany;

/**
* Created by GeneratorCode on 2018/04/17
*/ 

public class ProduceReport { 
    private Integer reportid;    //主键报岗id 
    private String shipname;    //船队名称 
    private Float capacity;    //装载量(吨) 
    private String planjobtime;    //预计到港时间 
    private String startjobtime;    //实际到港时间 
    private String completetime;    //完成时间 
    private Integer flowid;    //流程 
    private String reportuser;    //报岗人 
    private Integer compid;    //所属企业
    private String status;
    private Float amount;

    private BaseCompany baseCompany;

    private String flowname;
    private String compname;


    public Integer getReportid() { 
        return reportid;
    }

    public void setReportid(Integer reportid) { 
        this.reportid = reportid;
    } 

    public String getShipname() { 
        return shipname;
    }

    public void setShipname(String shipname) { 
        this.shipname = shipname;
    }
    public Float getCapacity() { 
        return capacity;
    }

    public void setCapacity(Float capacity) { 
        this.capacity = capacity;
    }

    public String getPlanjobtime() { 
        return planjobtime;
    }

    public void setPlanjobtime(String planjobtime) { 
        this.planjobtime = planjobtime;
    }
    public String getStartjobtime() { 
        return startjobtime;
    }

    public void setStartjobtime(String startjobtime) { 
        this.startjobtime = startjobtime;
    }
    public String getCompletetime() { 
        return completetime;
    }

    public void setCompletetime(String completetime) {
        this.completetime = completetime;
    }
    public Integer getFlowid() { 
        return flowid;
    }

    public void setFlowid(Integer flowid) { 
        this.flowid = flowid;
    } 

    public String getReportuser() { 
        return reportuser;
    }

    public void setReportuser(String reportuser) { 
        this.reportuser = reportuser;
    }
    public Integer getCompid() { 
        return compid;
    }

    public void setCompid(Integer compid) { 
        this.compid = compid;
    }

    public String getFlowname() {
        return flowname;
    }

    public void setFlowname(String flowname) {
        this.flowname = flowname;
    }

    public String getCompname() {
        return compname;
    }

    public void setCompname(String compname) {
        this.compname = compname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BaseCompany getBaseCompany() {
        return baseCompany;
    }

    public void setBaseCompany(BaseCompany baseCompany) {
        this.baseCompany = baseCompany;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "ProduceReport{" +
                "reportid=" + reportid +
                ", shipname='" + shipname + '\'' +
                ", capacity=" + capacity +
                ", planjobtime='" + planjobtime + '\'' +
                ", startjobtime='" + startjobtime + '\'' +
                ", completetime='" + completetime + '\'' +
                ", flowid=" + flowid +
                ", reportuser='" + reportuser + '\'' +
                ", compid=" + compid +
                ", flowname='" + flowname + '\'' +
                ", compname='" + compname + '\'' +
                '}';
    }
}