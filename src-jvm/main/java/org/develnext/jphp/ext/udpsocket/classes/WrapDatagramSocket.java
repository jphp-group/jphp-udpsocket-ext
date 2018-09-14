package org.develnext.jphp.ext.udpsocket.classes;

import org.develnext.jphp.ext.udpsocket.UDPSocketExtension;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.lang.BaseObject;
import php.runtime.reflection.ClassEntity;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

@Reflection.Name("UDPSocket")
@Reflection.Namespace(UDPSocketExtension.NS)
public class WrapDatagramSocket extends BaseObject{
    public WrapDatagramSocket(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
    public WrapDatagramSocket(Environment env, DatagramSocket socket) {
        super(env);
        this.socket = socket;
    }

    private DatagramSocket socket;

    @Reflection.Signature
    public void __construct() throws SocketException {
        socket = new DatagramSocket(null);
    }
    @Reflection.Signature
    public void __construct(int port) throws SocketException {
        socket = new DatagramSocket(port);
    }
    @Reflection.Signature
    public void __construct(int port, String host) throws SocketException {
        socket = new DatagramSocket(new InetSocketAddress(host, port));
    }

    @Reflection.Signature
    public void bind(String host, int port) throws SocketException{
        socket.bind(new InetSocketAddress(host, port));
    }
    @Reflection.Signature
    public void close(){
        socket.close();
    }
    @Reflection.Signature
    public void connect(String host, int port) throws SocketException{
        socket.connect(new InetSocketAddress(host, port));
    }
    @Reflection.Signature
    public void disconnect(){
        socket.disconnect();
    }
    @Reflection.Signature
    public boolean isConnected(){
        return socket.isConnected();
    }
    @Reflection.Signature
    public boolean isClosed(){
        return socket.isClosed();
    }
    @Reflection.Signature
    public boolean isBound(){
        return socket.isBound();
    }
    @Reflection.Signature
    public void send(DatagramPacket packet) throws IOException {
        socket.send(packet);
    }
    @Reflection.Signature
    public void receive(DatagramPacket packet) throws IOException{
        socket.receive(packet);
    }

    @Reflection.Signature
    public boolean getBroadcast() throws SocketException{
        return socket.getBroadcast();
    }
    @Reflection.Signature
    public int getLocalPort(){
        return socket.getLocalPort();
    }
    @Reflection.Signature
    public String getInetAddress(){
        return socket.getInetAddress().toString();
    }
    @Reflection.Signature
    public String getLocalAddress(){
        return socket.getLocalAddress().toString();
    }
    @Reflection.Signature
    public String getRemoteSocketAddress(){
        return socket.getRemoteSocketAddress().toString();
    }
    @Reflection.Signature
    public int getReceiveBufferSize() throws SocketException{
        return socket.getReceiveBufferSize();
    }
    @Reflection.Signature
    public boolean getReuseAddress() throws SocketException{
        return socket.getReuseAddress();
    }
    @Reflection.Signature
    public int getSendBufferSize() throws SocketException{
        return socket.getSendBufferSize();
    }
    @Reflection.Signature
    public int getSoTimeout() throws SocketException{
        return socket.getSoTimeout();
    }
    @Reflection.Signature
    public int getTrafficClass() throws SocketException{
        return socket.getTrafficClass();
    }

    @Reflection.Signature
    public void setBroadcast(boolean value) throws SocketException{
        socket.setBroadcast(value);
    }
    @Reflection.Signature
    public void setReceiveBufferSize(int value) throws SocketException{
        socket.setReceiveBufferSize(value);
    }
    @Reflection.Signature
    public void setReuseAddress(boolean value) throws SocketException{
        socket.setReuseAddress(value);
    }
    @Reflection.Signature
    public void setSendBufferSize(int value) throws SocketException{
        socket.setSendBufferSize(value);
    }
    @Reflection.Signature
    public void setSoTimeout(int value) throws SocketException{
        socket.setSoTimeout(value);
    }
    @Reflection.Signature
    public void setTrafficClass(int value) throws SocketException{
        socket.	setTrafficClass(value);
    }
}