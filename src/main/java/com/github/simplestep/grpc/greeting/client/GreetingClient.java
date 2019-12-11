package com.github.simplestep.grpc.greeting.client;

//import com.proto.dummy.DummyServiceGrpc;
//import com.proto.greet.GreetEveryoneRequest;
//import com.proto.greet.GreetEveryoneResponse;
//import com.proto.greet.GreetManyTimesRequest;
//import com.proto.greet.GreetRequest;
//import com.proto.greet.GreetResponse;
//import com.proto.greet.GreetServiceGrpc;
//import com.proto.greet.GreetWithDeadlineRequest;
//import com.proto.greet.GreetWithDeadlineResponse;
//import com.proto.greet.Greeting;
//import com.proto.greet.LongGreetRequest;
//import com.proto.greet.LongGreetResponse;
import io.grpc.Deadline;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

import javax.net.ssl.SSLException;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class GreetingClient {

    public static void main(String[] args) {
        System.out.println("Hello gRPC client");

        GreetingClient main = new GreetingClient();
        main.run();
    }

    public void run() {
        ManagedChannel channel = null;

//        doUnaryCall(channel);

        System.out.println("Shutting down channel");
        channel.shutdown();
    }

    /*
    private void doUnaryCall(ManagedChannel channel) {
        // TODO
        GreetServiceGrpc.GreetServiceBlockingStub greetClient = null;

        // Unary
        // TODO: created a protocol buffer greeting message
        Greeting greeting = null;

        // TODO: do the same for a GreetRequest
        GreetRequest greetRequest = null;

        // TODO: call the RPC and get back a GreetResponse (protocol buffers)

//        System.out.println("greetResponse : " + greetResponse.getResult());
    }
     */

    /*
    private void doServerStreamingCall(ManagedChannel channel) {
        // TODO
        GreetServiceGrpc.GreetServiceBlockingStub greetClient = null;

        // Server Streaming
        // TODO: we prepare the request
        GreetManyTimesRequest greetManyTimesRequest = null;

        // TODO: we stream the responses (in a blocking manner)
    }

     */

    /*
    private void doClientStreamingCall(ManagedChannel channel) {
        // TODO: create an asynchronous client
        GreetServiceGrpc.GreetServiceStub asyncClient = null;

        CountDownLatch latch = new CountDownLatch(1);

        // TODO
        StreamObserver<LongGreetRequest> requestObserver = null;

        // streaming message #1
        System.out.println("sending message #1");
        requestObserver.onNext(LongGreetRequest.newBuilder()
                .setGreeting(Greeting.newBuilder().setFirstName("Timo").build())
                .build());

        // streaming message #2
        System.out.println("sending message #2");
        requestObserver.onNext(LongGreetRequest.newBuilder()
                .setGreeting(Greeting.newBuilder().setFirstName("Ben").build())
                .build());

        // streaming message #3
        System.out.println("sending message #3");
        requestObserver.onNext(LongGreetRequest.newBuilder()
                .setGreeting(Greeting.newBuilder().setFirstName("Titan").build())
                .build());

        // we tell the server taht the client is done sending data
        requestObserver.onCompleted();

        try {
            latch.await(3L, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

     */

    /*
    private void doBiDiStreaming(ManagedChannel channel) {
        GreetServiceGrpc.GreetServiceStub asyncClient = GreetServiceGrpc.newStub(channel);

        CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<GreetEveryoneRequest> requestObserver = asyncClient.greetEveryone(null);

        Arrays.asList("Timo", "Ben", "Titan", "Joey").forEach(name -> {
            System.out.println("Sending: " + name);
            requestObserver.onNext(GreetEveryoneRequest.newBuilder()
                    .setGreeting(Greeting.newBuilder().setFirstName(name).build()).build());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        requestObserver.onCompleted();

        try {
            latch.await(3L, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     */
}
