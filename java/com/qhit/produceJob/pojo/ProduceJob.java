package com.qhit.produceJob.pojo;


/** 
* Created by GeneratorCode on 2018/04/15
*/ 

public class ProduceJob { 
    private Integer jobid;    //主键 
    private Integer devid;    //设备名称 
    private String starttime;    //开始作业时间 
    private String completetime;    //结束作业时间 
    private Double duration;    //运行时长 
    private Double amount;    //作业量 
    private Integer reportid;//报岗id

    private String compname;
    private String devType;
    private Integer ratio;

    public Integer getJobid() { 
        return jobid;
    }

    public void setJobid(Integer jobid) { 
        this.jobid = jobid;
    } 

    public Integer getDevid() { 
        return devid;
    }

    public void setDevid(Integer devid) { 
        this.devid = devid;
    } 

    public String getStarttime() { 
        return starttime;
    }

    public void setStarttime(String starttime) { 
        this.starttime = starttime;
    }
    public String getCompletetime() { 
        return completetime;
    }

    public void setCompletetime(String completetime) { 
        this.completetime = completetime;
    }
    public Double getDuration() { 
        return duration;
    }

    public void setDuration(Double duration) { 
        this.duration = duration;
    } 

    public Double getAmount() { 
        return amount;
    }

    public void setAmount(Double amount) { 
        this.amount = amount;
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

    public String getDevType() {
        return devType;
    }

    public void setDevType(String devType) {
        this.devType = devType;
    }

    public Integer getRatio() {
        return ratio;
    }

    public void setRatio(Integer ratio) {
        this.ratio = ratio;
    }
}