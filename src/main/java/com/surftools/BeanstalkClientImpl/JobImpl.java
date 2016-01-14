package com.surftools.BeanstalkClientImpl;



import com.surftools.BeanstalkClient.Job;

public class JobImpl implements Job
{

    private byte[] data;
    private long jobId;

    public JobImpl(long jobId)
    {
        this.jobId = jobId;
    }

    public byte[] getData()
    {
        return data;
    }

    public long getJobId()
    {
        return jobId;
    }

    public void setData(byte[] data)
    {
        this.data = data;
    }
}
