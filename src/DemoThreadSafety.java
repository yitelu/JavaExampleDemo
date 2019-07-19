import java.util.concurrent.atomic.AtomicInteger;

class Counter
{
    //option2: use AtomicInteger
    //AtomicInteger count = new AtomicInteger();
    int count=0;

    //option 1: to make thread safe, add the keyword "synchronized" on the method: public synchronized void increment()
    public synchronized void increment(){

        count++; // count = count + 1;

        //count.incrementAndGet();
    }
}

public class DemoThreadSafety {

    public static void main(String[] args) throws Exception
    {
        Counter c = new Counter();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println("thread 1");
                for(int i=1; i<=1000; i++){
                    c.increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println("thread 2");
                for(int j=1; j<=1000; j++){
                    c.increment();
                }

            }
        });


        //
        t1.start();
        t2.start();
        t1.join();//waiting for other thread to join
        t2.join();//waiting for other thread to join
        //


        System.out.println(c.count);


    }
}
