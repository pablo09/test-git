package com.pzeszko.factory;

/**
 * Created by Admin on 16.05.2017.
 */
public class LuxuryCleanService extends CleanService {
    @Override
    public void clean() {
        System.out.println("Cleaning...");
        System.out.println("Filling bottles of alcohol...");
        System.out.println("Sending sms notification");
    }
}
