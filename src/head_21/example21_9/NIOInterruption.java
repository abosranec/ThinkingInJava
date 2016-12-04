package head_21.example21_9;
// Interrupting a blocked NIO channel.
import java.net.*;
import java.nio.*;
import java.nio.channels.*;
import java.util.concurrent.*;
import java.io.*;

class NIOBlocked implements Runnable {
  private final SocketChannel sc;
  public NIOBlocked(SocketChannel sc) { this.sc = sc; }
  public void run() {
    try {
      System.out.println("Waiting for read() in " + this);
      sc.read(ByteBuffer.allocate(1));
    } catch(ClosedByInterruptException e) {
      System.out.println("ClosedByInterruptException");
    } catch(AsynchronousCloseException e) {
      System.out.println("AsynchronousCloseException");
    } catch(IOException e) {
      throw new RuntimeException(e);
    }
    System.out.println("Exiting NIOBlocked.run() " + this);
  }
}

public class NIOInterruption {
  public static void main(String[] args) throws Exception {
    ExecutorService exec = Executors.newCachedThreadPool();
    ServerSocket server = new ServerSocket(2020);
    InetSocketAddress isa =
      new InetSocketAddress("localhost", 2020);
    SocketChannel sc1 = SocketChannel.open(isa);
    SocketChannel sc2 = SocketChannel.open(isa);
    Future<?> f = exec.submit(new NIOBlocked(sc1));
    exec.execute(new NIOBlocked(sc2));
    System.out.println("Call shutdown");
    exec.shutdown();
    TimeUnit.SECONDS.sleep(1);
    // Produce an interrupt via cancel:
    System.out.println("Close future<?>.cancel");
    f.cancel(true);
    TimeUnit.SECONDS.sleep(1);
    // Release the block by closing the channel:
    System.out.println("Close socket");
    sc2.close();
  }
}
