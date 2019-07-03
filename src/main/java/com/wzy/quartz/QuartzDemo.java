package com.wzy.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 类功能说明: 执行的方法
 * 类修改者	创建日期2019/3/1
 * 修改说明
 *
 * @author wzy
 * @version V1.0
 **/
public class QuartzDemo implements Job {


    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("定是任务。。。。。。。");
    }
}
