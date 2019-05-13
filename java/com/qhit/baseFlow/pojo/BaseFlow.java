package com.qhit.baseFlow.pojo;


import com.qhit.baseCompany.pojo.BaseCompany;
import com.qhit.baseDevtype.pojo.BaseDevtype;
import com.qhit.produceReport.pojo.ProduceReport;

/**
* Created by GeneratorCode on 2018/04/09
*/ 

public class BaseFlow { 
    private Integer flowid;    //主键 
    private String flowname;    //流程名称 
    private Integer dljid;    //斗轮机 
    private Integer zcjid;    //装船机 
    private Integer pdjid;    //皮带机 
    private Integer compid;    //所属企业
    private Float capacity;
    private String a;

    private String dljname;
    private String zcjname;
    private String pdjname;
    private String compname;

    private ProduceReport produceReport;



    public Integer getFlowid() { 
        return flowid;
    }

    public void setFlowid(Integer flowid) { 
        this.flowid = flowid;
    } 

    public String getFlowname() { 
        return flowname;
    }

    public void setFlowname(String flowname) { 
        this.flowname = flowname;
    }
    public Integer getDljid() { 
        return dljid;
    }

    public void setDljid(Integer dljid) { 
        this.dljid = dljid;
    } 

    public Integer getZcjid() { 
        return zcjid;
    }

    public void setZcjid(Integer zcjid) { 
        this.zcjid = zcjid;
    } 

    public Integer getPdjid() { 
        return pdjid;
    }

    public void setPdjid(Integer pdjid) { 
        this.pdjid = pdjid;
    } 

    public Integer getCompid() { 
        return compid;
    }

    public void setCompid(Integer compid) { 
        this.compid = compid;
    }

    public String getDljname() {
        return dljname;
    }

    public void setDljname(String dljname) {
        this.dljname = dljname;
    }

    public String getZcjname() {
        return zcjname;
    }

    public void setZcjname(String zcjname) {
        this.zcjname = zcjname;
    }

    public String getPdjname() {
        return pdjname;
    }

    public void setPdjname(String pdjname) {
        this.pdjname = pdjname;
    }

    public String getCompname() {
        return compname;
    }

    public void setCompname(String compname) {
        this.compname = compname;
    }

    public ProduceReport getProduceReport() {
        return produceReport;
    }

    public void setProduceReport(ProduceReport produceReport) {
        this.produceReport = produceReport;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }


    public Float getCapacity() {
        return capacity;
    }

    public void setCapacity(Float capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "BaseFlow{" +
                "flowid=" + flowid +
                ", flowname='" + flowname + '\'' +
                ", dljid=" + dljid +
                ", zcjid=" + zcjid +
                ", pdjid=" + pdjid +
                ", compid=" + compid +
                ", dljname='" + dljname + '\'' +
                ", zcjname='" + zcjname + '\'' +
                ", pdjname='" + pdjname + '\'' +
                ", compname='" + compname + '\'' +
                '}';
    }
}