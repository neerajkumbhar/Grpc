package io.grpc.examples.pollservice;

import static io.grpc.stub.Calls.createMethodDescriptor;
import static io.grpc.stub.Calls.asyncUnaryCall;
import static io.grpc.stub.Calls.asyncServerStreamingCall;
import static io.grpc.stub.Calls.asyncClientStreamingCall;
import static io.grpc.stub.Calls.duplexStreamingCall;
import static io.grpc.stub.Calls.blockingUnaryCall;
import static io.grpc.stub.Calls.blockingServerStreamingCall;
import static io.grpc.stub.Calls.unaryFutureCall;
import static io.grpc.stub.ServerCalls.createMethodDefinition;
import static io.grpc.stub.ServerCalls.asyncUnaryRequestCall;
import static io.grpc.stub.ServerCalls.asyncStreamingRequestCall;

@javax.annotation.Generated("by gRPC proto compiler")
public class PollsGrpc {

  private static final io.grpc.stub.Method<io.grpc.examples.pollservice.PollQuestion,
      io.grpc.examples.pollservice.PollQuestion> METHOD_POST =
      io.grpc.stub.Method.create(
          io.grpc.MethodType.UNARY, "post",
          io.grpc.proto.ProtoUtils.marshaller(io.grpc.examples.pollservice.PollQuestion.PARSER),
          io.grpc.proto.ProtoUtils.marshaller(io.grpc.examples.pollservice.PollQuestion.PARSER));

  public static PollsStub newStub(io.grpc.Channel channel) {
    return new PollsStub(channel, CONFIG);
  }

  public static PollsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PollsBlockingStub(channel, CONFIG);
  }

  public static PollsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PollsFutureStub(channel, CONFIG);
  }

  public static final PollsServiceDescriptor CONFIG =
      new PollsServiceDescriptor();

  @javax.annotation.concurrent.Immutable
  public static class PollsServiceDescriptor extends
      io.grpc.stub.AbstractServiceDescriptor<PollsServiceDescriptor> {
    public final io.grpc.MethodDescriptor<io.grpc.examples.pollservice.PollQuestion,
        io.grpc.examples.pollservice.PollQuestion> post;

    private PollsServiceDescriptor() {
      post = createMethodDescriptor(
          "grpc.example.pollservice.Polls", METHOD_POST);
    }

    @SuppressWarnings("unchecked")
    private PollsServiceDescriptor(
        java.util.Map<java.lang.String, io.grpc.MethodDescriptor<?, ?>> methodMap) {
      post = (io.grpc.MethodDescriptor<io.grpc.examples.pollservice.PollQuestion,
          io.grpc.examples.pollservice.PollQuestion>) methodMap.get(
          CONFIG.post.getName());
    }

    @java.lang.Override
    protected PollsServiceDescriptor build(
        java.util.Map<java.lang.String, io.grpc.MethodDescriptor<?, ?>> methodMap) {
      return new PollsServiceDescriptor(methodMap);
    }

    @java.lang.Override
    public com.google.common.collect.ImmutableList<io.grpc.MethodDescriptor<?, ?>> methods() {
      return com.google.common.collect.ImmutableList.<io.grpc.MethodDescriptor<?, ?>>of(
          post);
    }
  }

  public static interface Polls {

    public void post(io.grpc.examples.pollservice.PollQuestion request,
        io.grpc.stub.StreamObserver<io.grpc.examples.pollservice.PollQuestion> responseObserver);
  }

  public static interface PollsBlockingClient {

    public io.grpc.examples.pollservice.PollQuestion post(io.grpc.examples.pollservice.PollQuestion request);
  }

  public static interface PollsFutureClient {

    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.pollservice.PollQuestion> post(
        io.grpc.examples.pollservice.PollQuestion request);
  }

  public static class PollsStub extends
      io.grpc.stub.AbstractStub<PollsStub, PollsServiceDescriptor>
      implements Polls {
    private PollsStub(io.grpc.Channel channel,
        PollsServiceDescriptor config) {
      super(channel, config);
    }

    @java.lang.Override
    protected PollsStub build(io.grpc.Channel channel,
        PollsServiceDescriptor config) {
      return new PollsStub(channel, config);
    }

    @java.lang.Override
    public void post(io.grpc.examples.pollservice.PollQuestion request,
        io.grpc.stub.StreamObserver<io.grpc.examples.pollservice.PollQuestion> responseObserver) {
      asyncUnaryCall(
          channel.newCall(config.post), request, responseObserver);
    }
  }

  public static class PollsBlockingStub extends
      io.grpc.stub.AbstractStub<PollsBlockingStub, PollsServiceDescriptor>
      implements PollsBlockingClient {
    private PollsBlockingStub(io.grpc.Channel channel,
        PollsServiceDescriptor config) {
      super(channel, config);
    }

    @java.lang.Override
    protected PollsBlockingStub build(io.grpc.Channel channel,
        PollsServiceDescriptor config) {
      return new PollsBlockingStub(channel, config);
    }

    @java.lang.Override
    public io.grpc.examples.pollservice.PollQuestion post(io.grpc.examples.pollservice.PollQuestion request) {
      return blockingUnaryCall(
          channel.newCall(config.post), request);
    }
  }

  public static class PollsFutureStub extends
      io.grpc.stub.AbstractStub<PollsFutureStub, PollsServiceDescriptor>
      implements PollsFutureClient {
    private PollsFutureStub(io.grpc.Channel channel,
        PollsServiceDescriptor config) {
      super(channel, config);
    }

    @java.lang.Override
    protected PollsFutureStub build(io.grpc.Channel channel,
        PollsServiceDescriptor config) {
      return new PollsFutureStub(channel, config);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.pollservice.PollQuestion> post(
        io.grpc.examples.pollservice.PollQuestion request) {
      return unaryFutureCall(
          channel.newCall(config.post), request);
    }
  }

  public static io.grpc.ServerServiceDefinition bindService(
      final Polls serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder("grpc.example.pollservice.Polls")
      .addMethod(createMethodDefinition(
          METHOD_POST,
          asyncUnaryRequestCall(
            new io.grpc.stub.ServerCalls.UnaryRequestMethod<
                io.grpc.examples.pollservice.PollQuestion,
                io.grpc.examples.pollservice.PollQuestion>() {
              @java.lang.Override
              public void invoke(
                  io.grpc.examples.pollservice.PollQuestion request,
                  io.grpc.stub.StreamObserver<io.grpc.examples.pollservice.PollQuestion> responseObserver) {
                serviceImpl.post(request, responseObserver);
              }
            }))).build();
  }
}
