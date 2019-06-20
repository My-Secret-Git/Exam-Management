package com.pojo;

public class Shijuan {
    private Integer id;

    private String shijuanmingcheng;

    private String timu;

    private String bjdh;

    private String courseID;

    private String status;

    
    
    public Shijuan() {
		super();
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShijuanmingcheng() {
        return shijuanmingcheng;
    }

    public void setShijuanmingcheng(String shijuanmingcheng) {
        this.shijuanmingcheng = shijuanmingcheng == null ? null : shijuanmingcheng.trim();
    }

    public String getTimu() {
        return timu;
    }

    public void setTimu(String timu) {
        this.timu = timu == null ? null : timu.trim();
    }

    public String getBjdh() {
        return bjdh;
    }

    public void setBjdh(String bjdh) {
        this.bjdh = bjdh == null ? null : bjdh.trim();
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID == null ? null : courseID.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}