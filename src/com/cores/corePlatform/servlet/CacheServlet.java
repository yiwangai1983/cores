package com.cores.corePlatform.servlet;

import com.cores.corePlatform.base.api.content.SpringContext;
import com.cores.corePlatform.base.service.QuartzService;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by super on 2015/4/22.
 */
public class CacheServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private static Logger logger = Logger.getLogger(CacheServlet.class.getName());

    public void init() throws ServletException {
        logger.info("自动加载...." + this.getClass().getName());
    }

    /**
     * 刷新缓存
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException {
        logger.info("刷新缓存...start");

        logger.info("刷新缓存...end");
    }

    /**
     * 刷新缓存
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException {
        this.doGet(request, response);
    }
}
