package com.ht.test.gradle.project1;

import lombok.experimental.UtilityClass;

/**
 * Created by hutao on 15/6/23.
 * 下午6:12
 */
@UtilityClass
public final class TimeConstant {
    /**
     * 秒
     */
    public static final long SECOND = 1000;
    /**
     * 分
     */
    public static final long MINUTE = 60 * SECOND;
    /**
     * 时
     */
    public static final long HOUR = 60 * MINUTE;
    /**
     * 日
     */
    public static final long DAY = 24 * HOUR;
}
