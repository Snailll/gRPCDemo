package com.demo.shell.test;

import com.demo.shell.service.UserServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

/**
 * @author demo
 * @date 2022/11/27
 */
public class NsServer {
    public static void main(String[] args) throws Exception {
        int port = 8082;
        Server server = ServerBuilder
                .forPort(port)
                .addService(new UserServiceImpl())
                .build()
                .start();
        System.out.println("server started, port : " + port);
        server.awaitTermination();
    }
}
