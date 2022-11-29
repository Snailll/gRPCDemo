package com.demo.shell.test;

import com.demo.shell.protocol.User;
import com.demo.shell.protocol.UserServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Iterator;

/**
 * @author demo
 * @date 2022/11/27
 */
public class NsTest {
    public static void main(String[] args) {

        User user = User.newBuilder()
                .setUserId(100)
                .build();

        String host = "127.0.0.1";
        int port = 8082;
        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
        UserServiceGrpc.UserServiceBlockingStub userServiceBlockingStub = UserServiceGrpc.newBlockingStub(channel);
        User responseUser = userServiceBlockingStub.getUser(user);
        System.out.println(responseUser);

        Iterator<User> users = userServiceBlockingStub.getUsers(user);
        while (users.hasNext()) {
            System.out.println(users.next());
        }

        channel.shutdown();
    }
}
