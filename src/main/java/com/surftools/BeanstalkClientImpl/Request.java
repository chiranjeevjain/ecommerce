package com.surftools.BeanstalkClientImpl;


public class Request
{

    private String command;
    private String[] validStates;
    private String[] errorStates;
    private byte[] data;
    private ExpectedResponse expectedResponse;
    private int expectedDataLengthIndex;

    public Request()
    {
    }

    public Request(String command, String[] validStates, String[] errorStates, byte[] data, ExpectedResponse expectedResponse)
    {
        this.command = command;
        this.validStates = validStates;
        this.errorStates = errorStates;
        this.data = data;
        this.expectedResponse = expectedResponse;
        this.expectedDataLengthIndex = -1;
    }

    public Request(String command, String[] validStates, String[] errorStates, byte[] data, ExpectedResponse expectedResponse, int expectedDataLengthIndex)
    {
        this(command, validStates, errorStates, data, expectedResponse);
        this.expectedDataLengthIndex = expectedDataLengthIndex;
    }

    public Request(String command, String validState, String errorState, byte[] data, ExpectedResponse expectedResponse)
    {
        this.command = command;

        if(validState != null)
        {
            validStates = new String[]
            {
                validState
            };
        }

        if(errorState != null)
        {
            errorStates = new String[]
            {
                errorState
            };
        }

        this.data = data;
        this.expectedResponse = expectedResponse;
        this.expectedDataLengthIndex = -1;
    }

    public Request(String command, String validState, String errorState, byte[] data, ExpectedResponse expectedResponse, int expectedDataLengthIndex)
    {
        this(command, validState, errorState, data, expectedResponse);
        this.expectedDataLengthIndex = expectedDataLengthIndex;
    }

    public String getCommand()
    {
        return command;
    }

    public void setCommand(String command)
    {
        this.command = command;
    }

    public String[] getValidStates()
    {
        return validStates;
    }

    public void setValidStates(String[] validStates)
    {
        this.validStates = validStates;
    }

    public String[] getErrorStates()
    {
        return errorStates;
    }

    public void setErrorStates(String[] errorStates)
    {
        this.errorStates = errorStates;
    }

    public byte[] getData()
    {
        return data;
    }

    public void setData(byte[] data)
    {
        this.data = data;
    }

    public ExpectedResponse getExpectedResponse()
    {
        return expectedResponse;
    }

    public void setExpectedResponse(ExpectedResponse expectedResponse)
    {
        this.expectedResponse = expectedResponse;
    }

    public void setExpectedDataLengthIndex(int index)
    {
        this.expectedDataLengthIndex = index;
    }

    public int getExpectedDataLengthIndex()
    {
        return this.expectedDataLengthIndex;
    }
}
