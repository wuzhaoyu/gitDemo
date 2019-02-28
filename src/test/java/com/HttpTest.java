package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 类功能说明:
 * 类修改者	创建日期2019/2/27
 * 修改说明
 * <p>Title: HttpTest.java</p>
 *
 * @author Wzy
 * @version V1.0
 **/

public class HttpTest {
    Logger logger = LoggerFactory.getLogger(HttpTest.class);
    /**
     * 聚合接口校验身份证
     * @param
     * @param
     * @return boolean
     */
   /* @Test
    public void identityCheck(){
        String key = "";
        String url = "http://localhost:8083/api/enterprise/querybycondition";
//        String url = "http://localhost:8083/api/user/1";

        logger.info("请求url:" + url);
        boolean match = false; //是否匹配
        try {
            String result = HttpClientUtil.doPost(url);
            System.out.println("请求结果：" + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
//        return match;
    }
*/
}
