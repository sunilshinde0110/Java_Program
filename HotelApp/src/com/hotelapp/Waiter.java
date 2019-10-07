package com.hotelapp;



public class Waiter extends Thread{
    
    private Message msg;
    
    public Waiter(Message m){
        this.msg=m;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        orderProcess(name);
    }

	private void orderProcess(String name) {
		synchronized (msg) {
            try{
                System.out.println(name+" Waiting for orders from customer :"+java.time.LocalDateTime.now());
                
                msg.wait();
                
                if(currentThread().isAlive()==true);{
                	System.out.println(currentThread().getName()+" Is Working");
                }
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(name+" Take the order from customer at :"+java.time.LocalDateTime.now());
            //process the message now
            System.out.println(name+" Order processed &"+msg.getMsg());
        }
	}

}
