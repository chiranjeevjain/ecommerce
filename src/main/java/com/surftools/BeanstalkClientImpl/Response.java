package com.surftools.BeanstalkClientImpl;


public class Response
{

    private String status;
    private String reponse;
    private String responseLine;
    private boolean matchOk;
    private boolean matchError;
    private Object data;

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getReponse()
    {
        return reponse;
    }

    public void setReponse(String reponse)
    {
        this.reponse = reponse;
    }

    public String getResponseLine()
    {
        return responseLine;
    }

    public void setResponseLine(String responseLine)
    {
        this.responseLine = responseLine;
    }

    public boolean isMatchOk()
    {
        return matchOk;
    }

    public void setMatchOk(boolean matchOk)
    {
        this.matchOk = matchOk;
    }

    public boolean isMatchError()
    {
        return matchError;
    }

    public void setMatchError(boolean matchError)
    {
        this.matchError = matchError;
    }

    public Object getData()
    {
        return data;
    }

    public void setData(Object data)
    {
        this.data = data;
    }
}
