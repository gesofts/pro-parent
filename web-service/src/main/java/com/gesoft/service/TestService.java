package com.gesoft.service;

import com.gesoft.oper.TestOper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by WCL on 2017/9/29.
 */
public class TestService {

    private static Logger logger = LoggerFactory.getLogger(TestService.class);
    public static String getInfo()
    {
        logger.info("===========getInfo");
        return "=====21212==" + TestOper.getInfo();
    }
}
