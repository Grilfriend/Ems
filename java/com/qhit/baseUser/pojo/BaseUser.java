package com.qhit.baseUser.pojo;


import com.qhit.baseCompany.pojo.BaseCompany;

/**
* Created by GeneratorCode on 2018/03/20
*/ 

public class BaseUser { 
    private Integer userid;    //主键 
    private String cname;    //姓名 
    private String username;    //用户名 
    private String password;    //密码 
    private String telno;    //手机号 
    private String email;    //邮箱 
    private String sex;    //性别 
    private Integer compid;    //所属企业 
    private BaseCompany baseCompany;

    public BaseCompany getBaseCompany() {
        return baseCompany;
    }

    public void setBaseCompany(BaseCompany baseCompany) {
        this.baseCompany = baseCompany;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) { 
        this.userid = userid;
    } 

    public String getCname() { 
        return cname;
    }

    public void setCname(String cname) { 
        this.cname = cname;
    }
    public String getUsername() { 
        return username;
    }

    public void setUsername(String username) { 
        this.username = username;
    }
    public String getPassword() { 
        return password;
    }

    public void setPassword(String password) { 
        this.password = password;
    }
    public String getTelno() { 
        return telno;
    }

    public void setTelno(String telno) { 
        this.telno = telno;
    }
    public String getEmail() { 
        return email;
    }

    public void setEmail(String email) { 
        this.email = email;
    }
    public String getSex() { 
        return sex;
    }

    public void setSex(String sex) { 
        this.sex = sex;
    }
    public Integer getCompid() { 
        return compid;
    }

    public void setCompid(Integer compid) { 
        this.compid = compid;
    } 


 }