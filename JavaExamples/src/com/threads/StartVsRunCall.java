package com.threads;


public class StartVsRunCall{

    public static void main(String args[]) {
        
        //creating two threads for start and run method call
        Thread startThread = new Thread(new Task("start"));
        Thread runThread = new Thread(new Task("run"));
        
        // Even below is valid 
        startThread.run();
        
        startThread.start(); //calling start method of Thread - will execute in new Thread
        runThread.run();  	 //calling run method of Thread - will execute in current Thread

        
        // Even below is valid, after starting thread also you can call run()
        startThread.run();
        
        // You cannot call start() twice
        // second call of start() will throw IllegalStateException
        // startThread.start();
        
        // You can call run() method twice or more
        runThread.run();
        runThread.run();
        runThread.run();
        runThread.run();
        runThread.run();
        runThread.run();
        
        runThread.start();

    }

    /*
     * Simple Runnable implementation
     */
    private static class Task implements Runnable{
        private String caller;
        
        public Task(String caller){
            this.caller = caller;
        }
        
        @Override
        public void run() {
            System.out.println("Caller: "+ caller + " and code on this Thread is executed by : " + Thread.currentThread().getName());
            
        }         
    } 
}