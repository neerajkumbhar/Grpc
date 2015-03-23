package edu.sjsu.cmpe273.lab2;

import io.grpc.ChannelImpl;
import io.grpc.transport.netty.NegotiationType;
import io.grpc.transport.netty.NettyChannelBuilder;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A simple client that requests a PollServer.
 */
public class PollServiceClient {
  private static final Logger logger = Logger.getLogger(PollServiceClient.class.getName());

  private final ChannelImpl channel;
  private final PollServiceGrpc.PollServiceBlockingStub blockingStub;

//  private final PollServiceBlockingStub blockingStub;

  public PollServiceClient(String host, int port) {
    channel =
        NettyChannelBuilder.forAddress(host, port).negotiationType(NegotiationType.PLAINTEXT)
            .build();
    blockingStub = PollServiceGrpc.newBlockingStub(channel);
  }

  public void shutdown() throws InterruptedException {
    channel.shutdown().awaitTerminated(5, TimeUnit.SECONDS);
  }

  public void createPoll(String moderatorId, String question, String started_at, String expired_at, String[] choice) {
  
    if (choice == null || choice.length < 2) {
            new RuntimeException("At least two choices should be present ");
        }

    try {
      logger.info("Creating Poll for Moderator: "+moderatorId);
      PollRequest request = PollRequest.newBuilder().setModeratorId(moderatorId).setQuestion(question).setStartedAt(started_at).setExpiredAt(expired_at).addChoice(choice[0]).addChoice(choice[1]).build();
      PollResponse response = blockingStub.createPoll(request);
      logger.info("PollId: " + response.getId());
    } catch (RuntimeException e) {
      logger.log(Level.WARNING, "RPC failed", e);
      return;
    }
  }

  public static void main(String[] args) throws Exception {
    PollServiceClient client = new PollServiceClient("localhost", 50051);
    try {
      /* Access a service running on the local machine on port 50051 */
        String moderatorId = "1";
        String question = "What type of smartphone do you have?";
        String started_at = "2015-03-18T13:00:00.000Z";
        String expired_at = "2015-03-19T13:00:00.000Z";
        String[] choice = new String[] { "Android", "iPhone" };
     
      client.createPoll(moderatorId, question, started_at, expired_at, choice);
    } finally {
      client.shutdown();
    }
  }
}

