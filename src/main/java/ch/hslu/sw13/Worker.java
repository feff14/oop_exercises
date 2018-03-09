package ch.hslu.sw13;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.util.concurrent.Callable;


public class Worker {
    final Logger LOG = LogManager.getLogger(Worker.class);
    int numberToDouble = 0;


    public Worker(int number) {
        numberToDouble = number;
    }

    public void processWork() {
        try {
            Thread.sleep((long) 10000.0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LOG.info("I'm Working");
    }

    public int doubleValue() {
        numberToDouble += numberToDouble;
        LOG.info(numberToDouble);
        return numberToDouble;
    }
}
