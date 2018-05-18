package cn.zyp.ThreadPool;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CachedThreadPool {

    ThreadPoolExecutor cached=new ThreadPoolExecutor(0,Integer.MAX_VALUE,60L, TimeUnit.MILLISECONDS,new SynchronousQueue<Runnable>());
}
