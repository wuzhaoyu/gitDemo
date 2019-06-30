package com.wzy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;

/**
 * 类功能说明:
 * 类修改者	创建日期2019/2/23
 * 修改说明
 * <p>Title: WholeExceptionHandle.java</p>
 *
 * @author Wzy
 * @version V1.0
 **/
@ControllerAdvice
public class WholeExceptionHandle {

    private static final Logger log = LoggerFactory.getLogger(WholeExceptionHandle.class);

    /**
     * 返回异常具体信息
     * @param e
     * @param response
     * @return
     */
   /* @ExceptionHandler(Exception.class)
    public ModelAndView exception(Exception e, HttpServletResponse response) {
        response.setStatus(500);
        log.error(e.getMessage(),e);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("mes",e.getMessage());
        modelAndView.setViewName("index");
        return modelAndView;
    }*/
}
