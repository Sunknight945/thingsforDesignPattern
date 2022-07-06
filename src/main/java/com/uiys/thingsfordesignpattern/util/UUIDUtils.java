package com.uiys.thingsfordesignpattern.util;

import cn.hutool.core.lang.UUID;

/**
 * @author 世界上只有一种真正的英雄主义
 */

public class UUIDUtils {
    public static String getUuid() {
        return UUID.randomUUID().toString(true);
    }

}


