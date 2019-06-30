package com;

import com.wzy.common.Utils;
import org.springframework.util.StringUtils;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 类功能说明:
 * 类修改者	创建日期2019/1/6
 * 修改说明
 * <p>Title: TestDemo.java</p>
 *
 * @author Wuzhaoyu
 * @version V1.0
 **/
public class TestDemo {
    public static void main(String[] args){
        int a ;
        a = 2;
        if(-1<a && a<2){
            System.out.println("12");
        }else{
            System.out.println("34");

        }
       /*demo1();

       Void v1 = demo2();
       System.out.println(v1);//null

        Demo<Void> obj = new Demo<>();
        Void v2 = obj.get();
        System.out.println(v2);//null
        Object obj1 = new TestDemo();
        Object obj2 = new TestDemo();
        System.out.println(obj1.equals(obj2));//null*/
        /*IdmEngineConfiguration idmEngineConfiguration = new IdmEngineConfiguration();
        IdmEngine idmEngine = idmEngineConfiguration.buildIdmEngine();*/
        //System.out.println(s);
        /*String wechat = "Hollis";
        String introduce = "每日更新Java相关技术文章";
        String hollis = wechat + "," + introduce;
        System.out.println(hollis);*/
//        String count = "25";
//        String lbh = "0" + count;
//        String fbh = lbh.length()<4? lbh.substring(lbh.length()-2,lbh.length()):lbh.substring(lbh.length()-3,lbh.length());
//        String bh = getBh(fbh);
/*
        int i=2;//
        String b=String.valueOf(i);//转换成string类型
        b = (b.length() == 1 ? "000" + b : b.length() == 2 ? "00" + b: b.length() == 3 ? "0" + b : b);*/

        /*String bh = "0100";
        int length = bh.length();
        String fbh = length<4? bh.substring(length-2,length):bh.substring(length-3,length);
        String lbh = "0" + (Integer.valueOf(fbh)+ 1);*/


        String nowDate = Utils.date2String(new Date(), "yyyy-MM-dd");
        String bhSuffix = new SimpleDateFormat("yy").format(new Date());
        System.out.println("WZGF"+bhSuffix);
        String str = "WZGF"+bhSuffix+"098";
        System.out.println(incrementBh(str.substring(6,9)));
    }
    public  static void demo1(){
    }
    private static String incrementBh(String maxTidBh){
        String var1 = "";
        int var5 = 0;
        String var2 = maxTidBh.substring(0, 1);
        String var4 = maxTidBh.substring(1, 2);
        int var3 = maxTidBh.length();
        if(!"0".equals(var2)){
            var5 = Integer.valueOf(maxTidBh)+1;
            var1 = String.valueOf(var5);
        }else {
            if (!"0".equals(var4)) {
                var5 = Integer.valueOf(maxTidBh.substring(var3 - 2, var3)) + 1;
                if (var5 > 99) {
                    var1 = String.valueOf(var5);
                } else {
                    var1 = "0" + String.valueOf(var5);
                }
            } else {
                int num = Integer.valueOf(maxTidBh.substring(var3 - 1, var3)) + 1;
                if (num > 9) {
                    var1 = "0" + String.valueOf(num);
                } else {
                    var1 = "00" + String.valueOf(num);
                }
            }
        }
        return   var1;
    }
    private static String getBh(String bh){
        //查出来编号
        String lbh = "0" + (Integer.valueOf(bh)+ 1);
        String bh1 = lbh.length()<4? lbh.substring(lbh.length()-2,lbh.length()):lbh.substring(lbh.length()-3,lbh.length());
        return bh1;
//        String htqybh = null;
        /*if(htqybh == null){
            return bh;
        }else {
            String lbh = "0" + (Integer.valueOf(bh)+ 1);
            bh = lbh.substring(lbh.length()-2,lbh.length());
            return getBh(bh);
        }*/
    }
    public static String generateYpbh(String ypbh) {
        List<Map<String, Object>> ypbhs = new ArrayList<>();
        Map<String,Object> map = new HashMap<>();
        map.put("ypbh","JZ2019KH0315014");
        ypbhs.add(map);
        if (null != ypbhs && ypbhs.size() > 0) {
            String maxYpbh = Utils.mapStr(ypbhs.get(0), "ypbh");
            maxYpbh = maxYpbh.split("_")[0];
            String maxIndex = maxYpbh.substring(maxYpbh.length() - 3, maxYpbh.length());
            Long index = Long.valueOf(maxIndex) + 1L;
            String serialNumber = "";
            if (index.toString().length() == 1) {
                serialNumber = "00" + String.valueOf(index);
            } else if (index.toString().length() == 2) {
                serialNumber = "0" + String.valueOf(index);
            } else if (index.toString().length() == 3) {
                serialNumber = String.valueOf(index);
            }
            ypbh = ypbh + serialNumber;
        } else {
            ypbh = ypbh + "001";
        }
        return ypbh;
    }
    public static Void demo2(){
        return null;
    }
    static class Demo<T>{
        public T get(){
            return null;
        }
    }
    public boolean equals(TestDemo t){
        return true;
    }

}
