package pwo.lab10.observer;

import pwo.lab10.observer.Publisher.Subscriber;

public class MaxFinder implements Subscriber {

    Integer max = null;

    @Override
    public void action(int x) {
        if (max == null || max < x) {
            max = x;
        }
    }

    public int getMax() {
        return max;
    }
}
