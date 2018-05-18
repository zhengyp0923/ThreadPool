package cn.zyp.ThreadPool;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class SingledThreadPool {

    /**
     * 由于使用无界队列，任务队列不会满
     *  maxinumPoolSize 无效
     *  RejectExecutionHandler 无效
     */
    ThreadPoolExecutor single=new ThreadPoolExecutor(1,1,0L, TimeUnit.MILLISECONDS,new LinkedBlockingQueue<Runnable>(),new ThreadPoolExecutor.DiscardPolicy());

}
