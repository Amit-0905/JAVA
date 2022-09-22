import java.util.*;  
class swap {  
    public static void main(String[] args) {  
       int x, y, temp;
       Scanner sc = new Scanner(System.in);  
       System.out.println("Enter the you want to swap");  
       x = sc.nextInt();  
       y = sc.nextInt();  
       System.out.println("before swapping: "+x +"  "+ y);  
       temp = x;  
       x = y;  
       y = temp;  
       System.out.println("After swapping: "+x +"   " + y);  
    }    
} 
