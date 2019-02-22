package com.wzy.common;

/**
 * ClassName ResultCode
 * Description
 * Author lixun
 * Date 2019/1/9 15:38
 * Version 1.0
 **/

public class ResultCode {
    static final int CODE_SUCCESS = 200;
    static final int CODE_ERROR = 2100;
    static final int CODE_NO_PM = 3100;
    public static int ERROR_COMMON_LOGIN_NOT_CORRECT = 1000001;
    public static String ERROR_COMMON_LOGIN_NOT_CORRECT_MSG = "用户名密码错误";
    public static int ERROR_PARAMETER_NOT_CORRECT = 1001001;
    public static String ERROR_PARAMETER_NOT_CORRECT_MSG = "参数错误";
    public static int ERROR_QUERY_FAILED = 1001002;
    public static String ERROR_QUERY_FAILED_MSG = "查询失败";
    public static int ERROR_SAVE_FAILED = 1001003;
    public static String ERROR_SAVE_FAILED_MSG = "保存失败";
    public static int ERROR_DELETE_FAILED = 1001004;
    public static String ERROR_DELETE_FAILED_MSG = "删除失败";
    public static int ERROR_OPRATION_FAILED = 1001005;
    public static String ERROR_OPRATION_FAILED_MSG = "操作失败";
    public static int ERROR_UPLOAD_FAILED = 1000009;
    public static String ERROR_UPLOAD_FAILED_MSG = "文件上传失败";
}
