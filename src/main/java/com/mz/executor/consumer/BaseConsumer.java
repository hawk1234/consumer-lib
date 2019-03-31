package com.mz.executor.consumer;

public abstract class BaseConsumer implements Runnable{

	public void run(){
	    System.out.println("Initiate connection and start receiving events.");
	    try{
            System.out.println("Consuming event");
            consume(new Event());
            System.out.println("Consuming event finished successfully");
        }catch(Exception any){
	        System.out.println("There was an error consuming event");
        }
    }

    protected abstract void consume(Event event);
}
