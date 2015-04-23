package com.cores.corePlatform.servlet;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by super on 2015/4/22.
 */
public class CacheServlet extends HttpServlet{

    private static final long serialVersionUID = 1L;

    private static Logger logger = Logger.getLogger(CacheServlet.class.getName());

    /**
     * ˢ�»���
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException {
        logger.info("刷新缓存开始...start");

        logger.info("刷新缓存开始...end");
    }

    /**
     * ˢ�»���
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException {
        this.doGet(request, response);
    }
}
