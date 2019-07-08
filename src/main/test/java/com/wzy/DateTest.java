package com.wzy;

import com.wzy.common.DateUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 类功能说明:
 * 类修改者	创建日期2019/7/8
 * 修改说明
 *
 * @author wzy
 * @version V1.0
 **/
public class DateTest {
    public static void main(String args[]){
        Map<String,Object> map  = new HashMap<>();
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat format3 = new SimpleDateFormat("yyyy年MM月");
        //获取当前年月前一月
        Date beforeDate = null;
        calendar.add(Calendar.MONTH,1);
        //获取当前年月
        Date date = null;
      /*  for (int i=0;i<6;i++){
            //每次月数减一，如果需要当前月份以后的就填1
            beforeDate =  DateUtils.getMonthFirstDate(calendar.getTime());
            calendar.add(Calendar.MONTH,-1);
            date = DateUtils.getMonthFirstDate(calendar.getTime());
            String format1 = format.format(beforeDate);
            String format2 = format.format(date);
            System.out.println(format1);
            System.out.println(format2);
        }*/

        String str = "2019年12月";
        String str1 = str.replaceAll("(年)","-").replaceAll("(月)","-01");
        System.out.println(str1);
        try {
            calendar.setTime(format.parse(str1));
            calendar.add(Calendar.MONTH,1);
            System.out.println(format.format(calendar.getTime()));
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
