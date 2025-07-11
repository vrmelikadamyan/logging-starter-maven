package com.vmelik.loggingstartermaven;

public class LoggingStarterAutoConfiguration {

    public static void println(String str) {
        System.out.println("Выведено из стартера maven: " + str);
    }
}
