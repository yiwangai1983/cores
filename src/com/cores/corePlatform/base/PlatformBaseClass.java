package com.cores.corePlatform.base;

import com.cores.corePlatform.base.api.content.SpringContext;
import org.apache.log4j.Logger;

import javax.annotation.Resource;
import java.util.Properties;

/**
 * Created by super on 2015/4/22.
 */
public abstract class PlatformBaseClass {

    protected final Logger logger = Logger.getLogger(getClass());
    @Resource
    protected Properties ebizProperties;

    public PlatformBaseClass() {
        if (null == ebizProperties) {
            ebizProperties = (Properties) SpringContext.getBean("ebizProperties");
        }


    }

}
