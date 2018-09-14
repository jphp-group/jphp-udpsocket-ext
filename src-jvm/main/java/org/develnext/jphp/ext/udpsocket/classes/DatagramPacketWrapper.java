package org.develnext.jphp.ext.udpsocket.classes;

import org.develnext.jphp.ext.udpsocket.UDPSocketExtension;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

@Reflection.Name("UDPSocketPacket")
@Reflection.Namespace(UDPSocketExtension.NS)
public class DatagramPacketWrapper extends BaseWrapper<DatagramPacket>{
    public DatagramPacketWrapper(Environment env, DatagramPacket wrappedObject) {
        super(env, wrappedObject);
    }
    public DatagramPacketWrapper(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    interface WrappedInterface{
        int getOffset();
        int getLength();
        int getPort();
    }

    @Reflection.Signature
    public void __construct(int length) throws SocketException {
        __wrappedObject = new DatagramPacket(new byte[length], length);
    }
    @Reflection.Signature
    public void __construct(int length, String host, int port) throws SocketException {
        __wrappedObject = new DatagramPacket(new byte[length], length, new InetSocketAddress(host, port));
    }
    @Reflection.Signature
    public String getAddress(){
        return getWrappedObject().getAddress().toString();
    }
    @Reflection.Signature
    public String getSocketAddress(){
        return getWrappedObject().getSocketAddress().toString();
    }
    @Reflection.Signature
    public String getData(){
        return new String(getWrappedObject().getData());
    }
    @Reflection.Signature
    public void setData(String data){
        getWrappedObject().setData(data.getBytes());
    }
    @Reflection.Signature
    public void setSocketAddress(String host, int port){
        getWrappedObject().setSocketAddress(new InetSocketAddress(host, port));
    }
}