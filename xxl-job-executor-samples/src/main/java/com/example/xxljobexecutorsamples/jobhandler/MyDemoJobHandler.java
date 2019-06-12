package com.example.xxljobexecutorsamples.jobhandler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author wh
 * @description
 * @date 2019/6/12
 */
@JobHandler(value = "myDemoJobHandler")
@Service
public class MyDemoJobHandler extends IJobHandler {

    private Logger logger = LoggerFactory.getLogger(MyDemoJobHandler.class);

    @Override
    public ReturnT<String> execute(String s) throws Exception {
        logger.info("Hello world ");

        return SUCCESS;
    }
}
