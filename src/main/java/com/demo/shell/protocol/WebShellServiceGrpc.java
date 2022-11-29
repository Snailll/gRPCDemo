package com.demo.shell.protocol;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.50.2)",
    comments = "Source: webshell.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WebShellServiceGrpc {

  private WebShellServiceGrpc() {}

  public static final String SERVICE_NAME = "protocol.WebShellService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.demo.shell.protocol.Webshell,
      com.demo.shell.protocol.Webshell> getExecMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "exec",
      requestType = com.demo.shell.protocol.Webshell.class,
      responseType = com.demo.shell.protocol.Webshell.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.demo.shell.protocol.Webshell,
      com.demo.shell.protocol.Webshell> getExecMethod() {
    io.grpc.MethodDescriptor<com.demo.shell.protocol.Webshell, com.demo.shell.protocol.Webshell> getExecMethod;
    if ((getExecMethod = WebShellServiceGrpc.getExecMethod) == null) {
      synchronized (WebShellServiceGrpc.class) {
        if ((getExecMethod = WebShellServiceGrpc.getExecMethod) == null) {
          WebShellServiceGrpc.getExecMethod = getExecMethod =
              io.grpc.MethodDescriptor.<com.demo.shell.protocol.Webshell, com.demo.shell.protocol.Webshell>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "exec"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.demo.shell.protocol.Webshell.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.demo.shell.protocol.Webshell.getDefaultInstance()))
              .setSchemaDescriptor(new WebShellServiceMethodDescriptorSupplier("exec"))
              .build();
        }
      }
    }
    return getExecMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WebShellServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WebShellServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WebShellServiceStub>() {
        @java.lang.Override
        public WebShellServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WebShellServiceStub(channel, callOptions);
        }
      };
    return WebShellServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WebShellServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WebShellServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WebShellServiceBlockingStub>() {
        @java.lang.Override
        public WebShellServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WebShellServiceBlockingStub(channel, callOptions);
        }
      };
    return WebShellServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WebShellServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WebShellServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WebShellServiceFutureStub>() {
        @java.lang.Override
        public WebShellServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WebShellServiceFutureStub(channel, callOptions);
        }
      };
    return WebShellServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class WebShellServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void exec(com.demo.shell.protocol.Webshell request,
        io.grpc.stub.StreamObserver<com.demo.shell.protocol.Webshell> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExecMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getExecMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.demo.shell.protocol.Webshell,
                com.demo.shell.protocol.Webshell>(
                  this, METHODID_EXEC)))
          .build();
    }
  }

  /**
   */
  public static final class WebShellServiceStub extends io.grpc.stub.AbstractAsyncStub<WebShellServiceStub> {
    private WebShellServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WebShellServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WebShellServiceStub(channel, callOptions);
    }

    /**
     */
    public void exec(com.demo.shell.protocol.Webshell request,
        io.grpc.stub.StreamObserver<com.demo.shell.protocol.Webshell> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExecMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class WebShellServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<WebShellServiceBlockingStub> {
    private WebShellServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WebShellServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WebShellServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.demo.shell.protocol.Webshell exec(com.demo.shell.protocol.Webshell request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExecMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class WebShellServiceFutureStub extends io.grpc.stub.AbstractFutureStub<WebShellServiceFutureStub> {
    private WebShellServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WebShellServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WebShellServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.demo.shell.protocol.Webshell> exec(
        com.demo.shell.protocol.Webshell request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExecMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_EXEC = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WebShellServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WebShellServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EXEC:
          serviceImpl.exec((com.demo.shell.protocol.Webshell) request,
              (io.grpc.stub.StreamObserver<com.demo.shell.protocol.Webshell>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class WebShellServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WebShellServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.demo.shell.protocol.WebshellOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WebShellService");
    }
  }

  private static final class WebShellServiceFileDescriptorSupplier
      extends WebShellServiceBaseDescriptorSupplier {
    WebShellServiceFileDescriptorSupplier() {}
  }

  private static final class WebShellServiceMethodDescriptorSupplier
      extends WebShellServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WebShellServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (WebShellServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WebShellServiceFileDescriptorSupplier())
              .addMethod(getExecMethod())
              .build();
        }
      }
    }
    return result;
  }
}
