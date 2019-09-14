import java.util.Scanner;

public class ArrayDemo3 
{
	private int array[]; 
	private int count; 
	private int size; 	
	
	public ArrayDemo3()
	{
		    array = new int[1]; 
	        count = 0; 
	        size = 1; 
	     
	}
	
	public void add(int data)
	{
		//Scanner sc = new Scanner(System.in);
		//int data = sc.nextInt();
	    if (count == size) { 
            growSize();  
        }  
        array[count] = data; 
        count++; 
	}
	
	public void growSize() 
    { 
  
        int temp[] = null; 
        if (count == size) { 
  
            temp = new int[size * 2]; 
            { 
                for (int i = 0; i < size; i++) { 
                    // copy all array value into temp 
                    temp[i] = array[i]; 
                } 
            } 
        } 
  
         
        array = temp; 
         
         
        size = size * 2; 
    } 
	
	
	/*
	public static void display()
	{
		System.out.println("welcome to display");
	}
	*/
	
	
	
	
	
	public static void main(String[] args)
	{
		ArrayDemo3 arr = new ArrayDemo3();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Press 1 to continue");
		int a = scanner.nextInt();
		
		
		char ch;
			
		
		
		do 
		{
			
			System.out.println("ArrayDemo");
			
			System.out.println("1.Add");
			System.out.println("2.display");
		
			int choice=scanner.nextInt();
		
			switch(choice)
		{
			case 1:
				
				int b = scanner.nextInt();
				
				arr.add(b);
				break;
			case 2 :
				
				System.out.println("Elements of array:"); 
		        for (int i = 0; i < arr.size; i++) { 
		            System.out.print(arr.array[i] + " "); 
		        } 
				break;
			
			case 3: 
                       return; 	
		}
		System.out.println();
		System.out.println("\nDo you want to continue (Type y or n) \n");
        ch = scanner.next().charAt(0);  
		
		}while (ch == 'Y'|| ch == 'y');
	}
	
	

}
