package com.youtube.jovemtranquilao.threadsafe;

import java.util.Hashtable;
import java.util.Map;

public class ThreadHashtree extends Thread {

    public static Map<String, Long> map = new Hashtable<>();

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