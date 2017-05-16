package com.pzeszko.factory;

/**
 * Created by Admin on 16.05.2017.
 */
public final class CleanServiceFactory {

    private CleanServiceFactory() {}

    public static CleanService getCleanService(String user) {
        if(user.equals("Pawka")) {
            return new LuxuryCleanService();
        } else {
            return new NormalCleanService();
        }
    }
}
