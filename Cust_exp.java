import java.util.Scanner;
class Cust_exp extends Exception{
	 public void myException(String s) 
    { 
        super(s);
    } 
}
public static void main(String ar[]){
	int age=0;
	Scanner sc = new Scanner(System.in);
	int age = sc.nextInt();  
		try{
			age = age/0;
			throw new myException("Not appplicable")
		}
		finally{
			System.out.println("Code Compiled Succesfully");
		}
}

