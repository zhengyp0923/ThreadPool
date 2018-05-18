package cn.zyp.ThreadPool;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class FixedThreadPool {
    private int n;
    /**
     * 由于使用无界队列
     * maximum参数无效
     * RejectedExecutionHandler参数无效
     */
    ThreadPoolExecutor fixed=new ThreadPoolExecutor(n,n,0L, TimeUnit.MILLISECONDS,new LinkedBlockingQueue<Runnable>());
}
