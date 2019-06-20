package com.pojo;

public class College {
    private String xydh;

    private String xymc;

    
    
    public College() {
		super();
	}

	public String getXydh() {
        return xydh;
    }

    public void setXydh(String xydh) {
        this.xydh = xydh == null ? null : xydh.trim();
    }

    public String getXymc() {
        return xymc;
    }

    public void setXymc(String xymc) {
        this.xymc = xymc == null ? null : xymc.trim();
    }
}