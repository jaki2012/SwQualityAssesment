package com.tongji409.website.service;

import com.tongji409.website.dao.StaticDefectDao;
import com.tongji409.website.service.support.ServiceSupport;

/**
 * Created by lijiechu on 16/11/26.
 */
public class StaticDefectService extends ServiceSupport {

    private StaticDefectDao staticDefectDao;


    public void setStaticDefectDao(StaticDefectDao staticDefectDao) {
        this.staticDefectDao = staticDefectDao;
    }

    public StaticDefectDao getStaticDefectDao() {
        return staticDefectDao;
    }
}
