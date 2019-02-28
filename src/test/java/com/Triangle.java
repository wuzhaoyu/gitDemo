package com.segasoft.ol.group;

import java.io.Serializable;

/**
 * 类功能说明: 三角形
 * 类修改者	创建日期2019/1/20
 * 修改说明
 * <p>Title: Triangle.java</p>
 *
 * @author foreverWQ
 * @version V1.0
 **/
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
        sb.append("width长度 : ");
        sb.append(this.width);
        sb.append("\nheight高度 : ");
        sb.append(this.height);
        sb.append("\narea面积 : ");
        sb.append(this.area);
        return sb.toString();
    }

}
