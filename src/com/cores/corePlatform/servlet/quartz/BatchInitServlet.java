package com.cores.corePlatform.servlet.quartz;

import com.cores.corePlatform.base.api.content.SpringContext;
import com.cores.corePlatform.base.service.QuartzService;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 批处理调度任务servlet
 * Created by super on 2015/4/23.
 */
public class BatchInitServlet extends HttpServlet {

    private static final long serialVersionUID = 3641735387168255915L;
    private static Logger logger = Logger.getLogger(BatchInitServlet.class.getName());

    public void init() throws ServletException {
        logger.info("quartz批处理正在加载中...");
        try {
            super.init();
            try {
                QuartzService quartzService = (QuartzService) SpringContext.getBean("quartzServiceImpl");
                quartzService.initScheduler();
            } catch (Exception e) {
                logger.error("quartz批处理加载失败...", e);
            }
        } catch (ServletException e) {
            logger.error("quartz批处理加载失败.", e);
        }
        logger.info("quartz批处理加载完成...");
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
