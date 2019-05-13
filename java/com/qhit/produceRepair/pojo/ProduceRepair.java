package com.qhit.produceRepair.pojo;


/** 
* Created by GeneratorCode on 2018/04/15
*/ 

public class ProduceRepair { 
    private Integer repairid;    //主键维修id 
    private Integer devid;    //设备名称 
    private String cause;    //维修原因 
    private Integer cost;    //维修费用 
    private String repairdate;    //维修日期

    private String devname;

    public Integer getRepairid() { 
        return repairid;
    }

    public void setRepairid(Integer repairid) { 
        this.repairid = repairid;
    } 

    public Integer getDevid() { 
        return devid;
    }

    public void setDevid(Integer devid) { 
        this.devid = devid;
    } 

    public String getCause() { 
        return cause;
    }

    public void setCause(String cause) { 
        this.cause = cause;
    }
    public Integer getCost() { 
        return cost;
    }

    public void setCost(Integer cost) { 
        this.cost = cost;
    } 

    public String getRepairdate() { 
        return repairdate;
    }

    public void setRepairdate(String repairdate) { 
        this.repairdate = repairdate;
    }

    public String getDevname() {
        return devname;
    }

    public void setDevname(String devname) {
        this.devname = devname;
    }
}