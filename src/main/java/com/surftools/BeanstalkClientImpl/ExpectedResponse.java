package com.surftools.BeanstalkClientImpl;


public enum ExpectedResponse
{

    None(0),
    ByteArray(1),
    List(2),
    Map(3);
    private int id = 0;

    ExpectedResponse(int id)
    {
        this.id = id;
    }

    public int getId()
    {
        return id;
    }

    public static ExpectedResponse getById(int id)
    {
        for(ExpectedResponse t : values())
        {
            if(t.id == id)
            {
                return t;
            }
        }
        return null;
    }
}
