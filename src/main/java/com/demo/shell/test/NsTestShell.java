package com.demo.shell.test;

import com.demo.shell.protocol.WebShellServiceGrpc;
import com.demo.shell.protocol.Webshell;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

/**
 * @author demo
 * @date 2022/11/27
 */
public class NsTestShell {
    public static void main(String[] args) {

        Webshell webshell = Webshell.newBuilder()
                .setPwd("x")
                .setCmd("ls -al ")
                .build();

        String host = "127.0.0.1";
        int port = 8082;
        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();

        WebShellServiceGrpc.WebShellServiceBlockingStub webShellServiceBlockingStub = WebShellServiceGrpc.newBlockingStub(channel);
        Webshell s = webShellServiceBlockingStub.exec(webshell);
        System.out.println(s.getCmd());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        channel.shutdown();
    }
}
