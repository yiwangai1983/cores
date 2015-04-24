package com.cores.corePlatform.base.service.impl;

import com.cores.corePlatform.base.service.QuartzService;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2015/4/24.
 */
@Service
public class QuartzServiceImpl extends BaseServiceImpl implements QuartzService {

    public void initScheduler() throws Exception {
        String xxx = super.coresProperties.getProperty("com.superc.cores.test");
        logger.info(xxx);

    }

    public void reScheduler() throws Exception {

    }
}
