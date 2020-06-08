package NewPackage;

import java.io.IOException;

class Room extends Building{
		   //It throws an unchecked exception
		   void color() throws ArithmeticException
		   {
		       System.out.println("White");
		   }

		   public static void main(String args[]){  
		       Room obj = new Room();  
		       obj.color(); 
		   } 
		}
	


