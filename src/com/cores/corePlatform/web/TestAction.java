package com.cores.corePlatform.web;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * Created by Administrator on 2015/4/23.
 */
@RestController
public class TestAction {

    private static Logger logger = Logger.getLogger(TestAction.class.getName());
    @RequestMapping("/test.action")
    public ModelAndView init(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
        logger.info("sessionid="+session.getId());
        ModelAndView view = new ModelAndView("/resource/jsp/test");
        return view;
    }

}
