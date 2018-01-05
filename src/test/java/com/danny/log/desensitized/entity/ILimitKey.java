package com.danny.log.desensitized.entity;

import java.util.concurrent.TimeUnit;

public interface ILimitKey {

    /**
     * 时间值
     * @return
     */
    public long getTimes();

    /**
     * 时间单位
     * @return
     */
    public TimeUnit getTimeUnit();

    /**
     * 限制值
     * @return
     */
    public long getLimitValue();

    /**
     * 限制key
     * @param objects
     * @return
     */
    public String getLimitFrequencyKey(Object... objects);
}
