package ch.hslu.sw13;

import com.sun.org.apache.xpath.internal.functions.FuncRound;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class WorkerDemo {
    final static Logger LOG = LogManager.getLogger(Worker.class);
    public static void main(final String[] args) {
        List<WorkerCallable> workers = new ArrayList<>();
        List<Future<Integer>> returnValues = new ArrayList<>();

        for(int i = 0; i<10; i++){
            workers.add(new WorkerCallable(new Worker(i)));
        }

        final ExecutorService execSvc = Executors.newFixedThreadPool(workers.size());

       for(WorkerCallable w : workers){
           returnValues.add(execSvc.submit(w));
       }
       for(Future<Integer> f : returnValues){
           try {
               LOG.info("Worker finished: " + f.get());
           } catch (InterruptedException e) {
               e.printStackTrace();
           } catch (ExecutionException e) {
               e.printStackTrace();
           }
       }
    }

    private static void startThread(Worker worker){
        final Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                worker.processWork();
            }
        });
        thread.start();
    }
}
