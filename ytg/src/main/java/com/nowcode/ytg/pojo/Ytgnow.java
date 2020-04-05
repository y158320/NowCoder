package com.nowcode.ytg.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Ytgnow")
public class Ytgnow {

    @Id
    private String nowid;
    private String beforeid;
    private String afterid;
    private String nowdesc;

    public String getNowid() {
        return nowid;
    }

    public void setNowid(String nowid) {
        this.nowid = nowid;
    }

    public String getBeforeid() {
        return beforeid;
    }

    public void setBeforeid(String beforeid) {
        this.beforeid = beforeid;
    }

    public String getAfterid() {
        return afterid;
    }

    public void setAfterid(String afterid) {
        this.afterid = afterid;
    }

    public String getNowdesc() {
        return nowdesc;
    }

    public void setNowdesc(String nowdesc) {
        this.nowdesc = nowdesc;
    }
}
