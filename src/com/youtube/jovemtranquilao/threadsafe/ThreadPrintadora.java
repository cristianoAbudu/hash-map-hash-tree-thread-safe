package com.youtube.jovemtranquilao.threadsafe;

public class ThreadPrintadora extends Thread {

    public void run() {
        while (true) {
            try {                
                System.out.println("noThreadSafe:"+ThreadHashMap.map.keySet().iterator().next());
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            try{
                System.out.println("ThreadSafe:"+ThreadHashtree.map.keySet().iterator().next());
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}