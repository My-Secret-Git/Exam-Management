/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pojo;

/**
 *
 * @author Administrator
 */
public class Item {
    private String mingcheng1;
    private String zhongwenmingcheng1;

    
    
    public Item(String mingcheng1, String zhongwenmingcheng1) {
		super();
		this.mingcheng1 = mingcheng1;
		this.zhongwenmingcheng1 = zhongwenmingcheng1;
	}

	/**
     * @return the mingcheng1
     */
    
    
    public String getMingcheng1() {
        return mingcheng1;
    }

    /**
     * @param mingcheng1 the mingcheng1 to set
     */
    public void setMingcheng1(String mingcheng1) {
        this.mingcheng1 = mingcheng1;
    }

    /**
     * @return the zhongwenmingcheng1
     */
    public String getZhongwenmingcheng1() {
        return zhongwenmingcheng1;
    }

    /**
     * @param zhongwenmingcheng1 the zhongwenmingcheng1 to set
     */
    public void setZhongwenmingcheng1(String zhongwenmingcheng1) {
        this.zhongwenmingcheng1 = zhongwenmingcheng1;
    }
    
}
