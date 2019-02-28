package com;

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
        String wechat = "Hollis";
        String introduce = "每日更新Java相关技术文章";
        String hollis = wechat + "," + introduce;
        System.out.println(hollis);
    }
    public  static void demo1(){
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
