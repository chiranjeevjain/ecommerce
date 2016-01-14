package com.surftools.BeanstalkClient;


import java.util.List;
import java.util.Map;

public interface Client
{

    /**
     *
     */
    public final String DEFAULT_HOST = "localhost";
    /**
     *
     */
    public final int DEFAULT_PORT = 11300;

    // ****************************************************************
    // Producer methods
    // ****************************************************************
    
    /**
     *
     * @param priority
     * @param delaySeconds
     * @param timeToRun
     * @param data
     *
     * @return
     */
    public long put(long priority, int delaySeconds, int timeToRun, byte[] data);

    /**
     *
     * @param tubeName
     */
    public void useTube(String tubeName);

    // ****************************************************************
    // Consumer methods
    //	job-related
    // ****************************************************************
    
    /**
     *
     * @param timeoutSeconds
     *
     * @return
     */
    public Job reserve(Integer timeoutSeconds);

    /**
     *
     * @param jobId
     *
     * @return
     */
    public boolean delete(long jobId);

    /**
     *
     * @param jobId
     * @param priority
     * @param delaySeconds
     *
     * @return
     */
    public boolean release(long jobId, long priority, int delaySeconds);

    /**
     *
     * @param jobId
     * @param priority
     *
     * @return
     */
    public boolean bury(long jobId, long priority);

    /**
     *
     * @param jobId
     *
     * @return
     */
    public boolean touch(long jobId);

    // ****************************************************************
    // Consumer methods
    //	tube-related
    // ****************************************************************
    
    /**
     *
     * @param tubeName
     *
     * @return
     */
    public int watch(String tubeName);

    /**
     *
     * @param tubeName
     *
     * @return -1, for NOT_IGNORED response in an attempt for a single tube
     */
    public int ignore(String tubeName);

    // ****************************************************************
    // Consumer methods
    //	peek-related
    // ****************************************************************
    
    /**
     *
     * @param jobId
     *
     * @return
     */
    public Job peek(long jobId);

    /**
     *
     * @return
     */
    public Job peekReady();

    /**
     *
     * @return
     */
    public Job peekDelayed();

    /**
     *
     * @return
     */
    public Job peekBuried();

    /**
     *
     * @param count
     *
     * @return
     */
    public int kick(int count);

    /*****************************************************************
     * Consumer methods 
     * stats-related
     ****************************************************************
    
    /**
     *
     * @param jobId
     *
     * @return
     */
    public Map<String, String> statsJob(long jobId);

    /**
     *
     * @param tubeName
     *
     * @return
     */
    public Map<String, String> statsTube(String tubeName);

    /**
     *
     * @return
     */
    public Map<String, String> stats();

    /**
     *
     * @return
     */
    public List<String> listTubes();

    /**
     *
     * @return
     */
    public String listTubeUsed();

    /**
     *
     * @return
     */
    public List<String> listTubesWatched();

    /******************************************************************
     * Client methods
     ******************************************************************/
     
    /**
     * return the version of this Beanstalkd Client
     *
     * @return
     */
    public String getClientVersion();

    /**
     * return the version of the beanstalkd daemon
     *
     * @return
     */
    public String getServerVersion();

    /**
     * close underlying connection to beanstalkd
     */
    public void close();

    /**
     * one unique connection per thread or a single shared connection?
     *
     * @return
     */
    public boolean isUniqueConnectionPerThread();

    /**
     *
     * @param uniqueConnectionPerThread
     */
    public void setUniqueConnectionPerThread(boolean uniqueConnectionPerThread);

    /**
     *
     * @param tubeName is the tube to pause
     * @param pause is an integer number of seconds to wait before reserving any more
    jobs from the queue
     */
    public boolean pauseTube(String tubeName, int pause);
}
