package com.surftools.BeanstalkClientImpl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.surftools.BeanstalkClient.BeanstalkException;

public class Serializer
{

    public static byte[] serializableToByteArray(Serializable serializable)
    {
        byte[] bytes;
        ByteArrayOutputStream baos = null;
        ObjectOutputStream oos = null;
        try
        {
            baos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(baos);
            oos.writeObject(serializable);
            oos.flush();
            bytes = baos.toByteArray();
            oos.close();
            baos.close();
        }
        catch(Exception e)
        {
            throw new BeanstalkException(e.getMessage());
        }
        return bytes;
    }

    public static Serializable byteArrayToSerializable(byte[] bytes)
    {
        Serializable serializable = null;
        ByteArrayInputStream bais = null;
        ObjectInputStream ois = null;
        try
        {
            bais = new ByteArrayInputStream(bytes);
            ois = new ObjectInputStream(bais);
            serializable = (Serializable) ois.readObject();
        }
        catch(Exception e)
        {
            throw new BeanstalkException(e.getMessage());
        }
        return serializable;
    }
}
