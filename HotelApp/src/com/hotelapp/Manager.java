package com.hotelapp;


public class Manager extends Thread {

    private Message msg;
    
    public Manager(Message msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name+" Working");
        customerOrderDeliveryTime();
        
    }

	private void customerOrderDeliveryTime() {
		try {
        	
            Thread.sleep(1000);
            synchronized (msg) {
            
                msg.setMsg(" Customer order delivered on :"+java.time.LocalDateTime.now());
               // msg.notify();
                 msg.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}

}
