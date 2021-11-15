package exceptionhandling;

public class Trycatchexample { //class name changed

	public static void main(String[] args) {
		 try  
	        {  
	        int[] arr= {1,3,5,7};  // arraytype(eg:[]) should declare in datatype not in variable
	        System.out.println(arr[10]); //may throw exception   
	        }  
	            // handling the array exception  
	        catch(ArrayIndexOutOfBoundsException e)  
	        {  
	            System.out.println(e);  
	        }  
	        System.out.println("rest of the code");  

	}

}
