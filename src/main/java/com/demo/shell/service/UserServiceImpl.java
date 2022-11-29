package com.demo.shell.service;

import com.demo.shell.protocol.User;
import com.demo.shell.protocol.UserServiceGrpc;
import io.grpc.stub.StreamObserver;
//import net.devh.boot.grpc.server.service.GrpcService;


/**
 * @author demo
 * @date 2022/11/27
 */
//@GrpcService
public class UserServiceImpl extends UserServiceGrpc.UserServiceImplBase {
    @Override
    public void getUser(User request, StreamObserver<User> responseObserver) {
        System.out.println(request);
        User user = User.newBuilder()
                .setName("response name")
                .build();
        responseObserver.onNext(user);
        responseObserver.onCompleted();
    }

    @Override
    public void getUsers(User request, StreamObserver<User> responseObserver) {
        System.out.println("get users");
        System.out.println(request);
        User user = User.newBuilder()
                .setName("user1")
                .build();
        User user2 = User.newBuilder()
                .setName("user2")
                .build();
        responseObserver.onNext(user);
        responseObserver.onNext(user2);
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<User> saveUsers(StreamObserver<User> responseObserver) {

        return new StreamObserver<User>() {
            @Override
            public void onNext(User user) {
                System.out.println("get saveUsers list ---->");
                System.out.println(user);
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("saveUsers error " + throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                User user = User.newBuilder()
                        .setName("saveUsers user1")
                        .build();
                responseObserver.onNext(user);
                responseObserver.onCompleted();
            }
        };
    }
}
