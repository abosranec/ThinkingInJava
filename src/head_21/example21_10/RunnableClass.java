package head_21.example21_10;

import java.util.concurrent.*;

class ClassWithWhile{
    private int i = 0;
    public void methodWhile() {
        while (true){
            i++;
        }
    }
}

class ClassRunnableWhile implements Runnable{
    @Override
    public void run() {
        (new ClassWithWhile()).methodWhile();
        System.out.println("Interrapt run() " + this.getClass().getSimpleName());
    }
}

class ClassWithSleep{
    public static void methodSleep() {
        try {
            TimeUnit.SECONDS.sleep(20);
        } catch (InterruptedException e) {
            System.out.println("interrapting...");
        }
    }
}

public class RunnableClass implements Runnable {
    @Override
    public void run() {
        ClassWithSleep.methodSleep();
        System.out.println("Interrapt run() " + this.getClass().getSimpleName());
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("task 1");
        Thread thread = new Thread(new RunnableClass());
        thread.start();
        TimeUnit.MILLISECONDS.sleep(100);
        thread.interrupt();
        TimeUnit.MILLISECONDS.sleep(500);

        System.out.println("task 2");
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new RunnableClass());
        TimeUnit.MILLISECONDS.sleep(100);
        executorService.shutdownNow();

//        System.out.println("task 3");
//        Thread thread2 = new Thread(new ClassRunnableWhile());
//        thread2.start();
//        TimeUnit.MILLISECONDS.sleep(100);
//        thread2.interrupt();
//        TimeUnit.MILLISECONDS.sleep(500);
//
//        System.out.println("task 4");
//        ExecutorService executorService2 = Executors.newCachedThreadPool();
//        Future<?> f = executorService2.submit(new ClassRunnableWhile());
//        TimeUnit.MILLISECONDS.sleep(100);
//        f.cancel(true);
//        TimeUnit.MILLISECONDS.sleep(100);
//        System.out.println("task 1 " + thread.isAlive());
//        System.out.println("task 2 " + executorService.isShutdown());
//        System.out.println("task 3 " + thread2.isAlive());
//        System.out.println("task 4 " + executorService2.isShutdown());
    }
}
