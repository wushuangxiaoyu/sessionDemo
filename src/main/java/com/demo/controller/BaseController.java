package com.demo.controller;

import com.demo.common.ServerResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MultipartException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 基类
 * Created by  Yu  by  2017/9/20
 */
public abstract class BaseController {

    private final static Logger _log = LoggerFactory.getLogger(BaseController.class);

    public static final String CURRENT_USER = "currentUser";

    public static final String EMAIL = "email";
    public static final String USERNAME = "username";

    /**
     * 统一异常处理
     *
     */
    @ExceptionHandler
    public ServerResponse<String> exceptionHandler(HttpServletRequest request, HttpServletResponse response, Exception exception) {
        _log.error("统一异常处理：", exception);
        return ServerResponse.createByErrorMessage("出错啦");
    }
}



