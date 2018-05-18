package cn.zyp.ThreadPool;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 定时任务的调度
 */
public class ScheduledThreadPoolExecutor {
    private int n;
    /**
     * DelayQueue为无界队列
     */
    ThreadPoolExecutor scheduled=new ThreadPoolExecutor(n,n,60L, TimeUnit.MILLISECONDS,new DelayQueue());
}
