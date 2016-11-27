package head_21.example21_2;//: concurrency/CallableDemo.java
import java.util.concurrent.*;
import java.util.*;

class TaskWithResult implements Callable<String> {
  private int id;
  public TaskWithResult(int id) {
      this.id = id;
  }
  public String call() throws InterruptedException {
      //Thread.currentThread().sleep(id) ;
      Thread.sleep(id);
      return "result of TaskWithResult " + id;
  }
}

public class CallableDemo {
  public static void main(String[] args) {
      ExecutorService exec = Executors.newCachedThreadPool();
      ArrayList<Future<String>> results = new ArrayList<>();
      for (int i = 9; i >= 0; i--)
          results.add(exec.submit(new TaskWithResult((int)Math.pow(i,3))));
      while (results.size() != 0) {
          for (Future<String> fs : new ArrayList<>(results))
              try {
                  if (fs.isDone() == true) {
                      System.out.println(fs.get());
                      results.remove(fs);
                  }
              } catch (InterruptedException e) {
                  System.out.println(e);
                  return;
              } catch (ExecutionException e) {
                  System.out.println(e);
              } finally {
                  exec.shutdown();
              }
      }
  }
}
