package com.gesoft.oper;


import org.slf4j.LoggerFactory;

/**
 * Created by WCL on 2017/9/29.
 */
public class TestOper {
    private static org.slf4j.Logger logger = LoggerFactory.getLogger(TestOper.class);
    public static String getInfo()
    {
        logger.info("=======TestOper===");
        return "TestOper";
    }
}
