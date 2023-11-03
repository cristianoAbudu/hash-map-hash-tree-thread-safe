package com.youtube.jovemtranquilao.threadsafe;

import java.util.HashMap;
import java.util.Map;

public class ThreadHashMap extends Thread {

    public static Map<String, Long> map = new HashMap<>();


    public void run() {
        while (true) {
            try {
                map.put(getName()+Math.random(), System.currentTimeMillis());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}