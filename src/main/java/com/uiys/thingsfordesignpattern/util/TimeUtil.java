package com.uiys.thingsfordesignpattern.util;

import org.joda.time.DateTime;

import java.util.Date;

/**
 * @author 世界上只有一种真正的英雄主义
 */

public class TimeUtil {

    public static Date getDateTime() {
        Date now = DateTime.now().toDate();
        return now;
    }

}


