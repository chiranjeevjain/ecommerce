package com.surftools.BeanstalkClient;


public interface Job
{

    /**
     *
     * @return
     */
    public long getJobId();

    /**
     *
     * @return
     */
    public byte[] getData();

    /**
     *
     * @param data
     */
    public void setData(byte[] data);
}
