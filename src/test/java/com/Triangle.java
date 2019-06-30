package com.segasoft.ol.group;

import java.io.Serializable;


public class Triangle implements Serializable {

    private Integer width;
    private Integer height;
    private transient Integer area;

    public Triangle (Integer width, Integer height){
        this.width = width;
        this.height = height;
        this.area = width * height;
    }

    public void setArea(){
        this.area = this.width * this.height;
    }
    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer(30);

        return sb.toString();
    }

}
