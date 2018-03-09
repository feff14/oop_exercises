package ch.hslu.sw13;

import java.util.concurrent.Callable;

public class WorkerCallable implements Callable<Integer> {
    public Worker worker;

    public WorkerCallable(Worker worker) {
        this.worker = worker;
    }

    @Override
    public Integer call() throws Exception {
        return worker.doubleValue();
    }
}
