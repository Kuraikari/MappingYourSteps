package com.example.egzonneziri.mapyoursteps;

/**
 * Created by zian.wermelinger on 02.03.2018.
 */

public interface StepListener {
    void onDrawerOpened();

    public void step(long timeNs);
}
