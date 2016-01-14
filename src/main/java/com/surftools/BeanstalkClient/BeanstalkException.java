package com.surftools.BeanstalkClient;



public class BeanstalkException extends RuntimeException
{

    private static final long serialVersionUID = 5592298800830452296L;

    /**
     *
     * @param message
     */
    public BeanstalkException(String message)
    {
        super(message);
    }
}
