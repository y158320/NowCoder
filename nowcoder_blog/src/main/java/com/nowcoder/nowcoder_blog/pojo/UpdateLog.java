package com.nowcoder.nowcoder_blog.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "updatelog")
public class UpdateLog {

    @Id
    private String id;
    private String logdesc;
    private String makedate;
    private String maketime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMakedate() {
        return makedate;
    }

    public void setMakedate(String makedate) {
        this.makedate = makedate;
    }

    public String getMaketime() {
        return maketime;
    }

    public void setMaketime(String maketime) {
        this.maketime = maketime;
    }

    public String getLogdesc() {
        return logdesc;
    }

    public void setLogdesc(String logdesc) {
        this.logdesc = logdesc;
    }
}
