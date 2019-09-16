package test;

import java.util.Scanner;

public class ArrayCarParkingDemo {
	
	int carparking[][]=new int[5][];
	Scanner sc=new Scanner(System.in);
	
	public void addCarToParking() {
		
		carparking[0]=new int[10];
		carparking[1]=new int[8];
		carparking[2]=new int[7];
		carparking[3]=new int[5];
		carparking[4]=new int[3];
		
		for(int i=0; i < carparking.length; i++){
			   
			System.out.println("ENTER THE CAR IN FlOOR:"+i);
	         for(int j=0; j < carparking[i].length; j++){
	        	 
	        	 
	        	 
	        	 carparking[i][j] = sc.nextInt();
	         }    
	      }
		
		
		/*for(int i=0;i<carparking.length;i++) {
			for(int j=0;j<carparking[i].length;j++)
			{
				System.out.print(carparking[i][j]);
			}
			System.out.println();
		}*/

	}
	
	public void availableSpaceForParking() {
		try {
		for(int i=0;i<carparking.length;i++) {
			for(int j=0;j<carparking[i].length;j++) {
				if(carparking[i][j]==0) {
					System.out.println("AVAILABLE SPACE FOR CAR AT FLOOR "+i+" AT SLOT NUMBER "+j);
				}
			}
		}
		}
		catch(Exception e) {
			System.out.println("ALL PARKING IS EMPTY TO ADD CAR TO PARKING PRESS 1");
		}
	}
	
	public void removeCarFromParking() {
		
		System.out.println("ENTER FLOOR TO REMOVE CAR:");
		int removeCar=sc.nextInt();
		System.out.println("ENTER SLOT NUMBER TO REMOVE CAR:");
		int removeCar1=sc.nextInt();
		
		if(removeCar<carparking.length) {
			if(removeCar1<carparking.length) {
			carparking[removeCar][removeCar1]=0;
			System.out.print("REMOVING CAR FROM FLOOR:"+removeCar);
			System.out.println(" THERE SLOT NUMBER IS:"+removeCar1);
			System.out.println();
		}
		else {
			System.out.println("CAR REMOVING FAILED");
		}
			availableSpaceForParking();
	}
}
	
	public void givenTokenNumberInCar() {
		
		int count=500;
		for(int i=0;i<carparking.length;i++) {
			for(int j=0;j<carparking[i].length;j++)
			{
				if(carparking[i][j]==0) {
				
				}
				else {
				System.out.println("CAR PARKING FLOOR IS:"+i+"\n"+"THERE SLOT NO IS:"+j+"\n"+"CAR NAME IS:"+carparking[i][j]+"\n"+"CAR TOKEN NUMBER IS:"+count+"\n");
				count++;
				}
			}
			
			System.out.println();
		}
	}
	
	public void insertCarForRemoveParkingPosition() {
		
		System.out.println("ENTER FLOOR TO INSERT CAR:");
		int addCar=sc.nextInt();
		System.out.println("ENTER SLOT NUMBER TO INSERT CAR:");
		int addCar1=sc.nextInt();
		
		if(addCar<carparking.length) {
			if(addCar1<carparking.length) {
			System.out.println("ENTER CAR NUMBER:");
			carparking[addCar][addCar1]=sc.nextInt();
			System.out.print("INSERTION CAR FLOOR IS:"+addCar);
			System.out.println(" THERE SLOT NUMBER IS:"+addCar1);
			System.out.println();
		}
		else {
			System.out.println("CAR INSERTION FAILED");
		}

	}
}

	
	public static void main(String[] args) {
		
		
		ArrayCarParkingDemo arrayCarParkingDemo = new ArrayCarParkingDemo();
		char choice;
		Scanner sc=new Scanner(System.in);
		
		do {
			 	System.out.println();
	            System.out.println("[1] ADD CAR TO PARKING");
	            System.out.println("[2] SHOW CARS TOKEN NUMBER");
	            System.out.println("[3] SHOW AVAILABLE SPACE");
	            System.out.println("[4] REMOVE CAR FROM PARKING");
	            System.out.println("[5] INSERT CAR FOR REMOVE POSITION");
	            System.out.println("[6] EXIT");
	            System.out.print("Choice: ");
	            choice = sc.next().charAt(0);
	            System.out.println();
	            
	            switch(choice){
	            
	            	case '1':
	            		arrayCarParkingDemo.addCarToParking();
	            		break;
	            	case '2':
	            		arrayCarParkingDemo.givenTokenNumberInCar();
	            		break;
	            	case '3':
	            		arrayCarParkingDemo.availableSpaceForParking();
	            		break;
	            	case '4':
	            		arrayCarParkingDemo.removeCarFromParking();
	            		break;
	            	case '5':
	            		arrayCarParkingDemo.insertCarForRemoveParkingPosition();
	            	}
	           }
		 		while(choice!='6');
        		System.out.println("THANK YOU");
        		System.out.println("VISIT AGAIN!!!!!");		
		
	}

}
