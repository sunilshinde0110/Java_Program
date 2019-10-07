package com.hotelapp;


public class HotelTest {

    public static void main(String[] args) {
        Message msg = new Message("process it");
        Waiter waiter = new Waiter(msg);
        waiter.start();
        waiter.setName("Waiter1");
    
        
        
        Waiter waiter1 = new Waiter(msg);
        waiter1.setName("Waiter2");
        waiter1.start();
    
        
        Manager manager = new Manager(msg);
        manager.setName("Manager");
        manager.start();
       
        System.out.println("Hotel Is Open");
    }

}
