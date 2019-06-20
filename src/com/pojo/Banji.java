package com.pojo;

public class Banji {
    private String bjdh;

    private String bjmc;

    private String xydh;

    
    
    public Banji() {
		super();
	}

	public String getBjdh() {
        return bjdh;
    }

    public void setBjdh(String bjdh) {
        this.bjdh = bjdh == null ? null : bjdh.trim();
    }

    public String getBjmc() {
        return bjmc;
    }

    public void setBjmc(String bjmc) {
        this.bjmc = bjmc == null ? null : bjmc.trim();
    }

    public String getXydh() {
        return xydh;
    }

    public void setXydh(String xydh) {
        this.xydh = xydh == null ? null : xydh.trim();
    }
}