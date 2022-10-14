package pwo.lab10.observer;

import pwo.lab10.observer.Publisher.Subscriber;

public class SumFinder implements Subscriber {

    Integer sum = null;

    @Override
    public void action(int x) {
        sum = sum == null ? x : sum + x;
    }

    public int getSum() {
        return sum;
    }
}
