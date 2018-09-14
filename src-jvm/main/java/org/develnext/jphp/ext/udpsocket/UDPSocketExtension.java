package org.develnext.jphp.ext.udpsocket;

import org.develnext.jphp.ext.udpsocket.classes.DatagramPacketWrapper;
import org.develnext.jphp.ext.udpsocket.classes.WrapDatagramSocket;
import php.runtime.env.CompileScope;
import php.runtime.ext.support.Extension;

import java.net.DatagramPacket;

public class UDPSocketExtension extends Extension {
    public static final String NS = "php\\net";
    
    @Override
    public Status getStatus() {
        return Status.EXPERIMENTAL;
    }
    
    @Override
    public void onRegister(CompileScope scope) {
        registerClass(scope, WrapDatagramSocket.class);
        registerWrapperClass(scope, DatagramPacket.class, DatagramPacketWrapper.class);
    }
}