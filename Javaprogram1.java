import java.util.Scanner;
public class Javaprogram1 
{ 
	public static int strcmp(String str1, String str2) 
		{ 
		int l1 = str1.length(); 
		int l2 = str2.length(); 
		int lmin=0;
			
			if (l1 < l2) {
				lmin =l1;
			}else{
				lmin=l2;
			}
			
			for (int i = 0; i < lmin; i++) { 
				int str1_ch = (int)str1.charAt(i); 
				int str2_ch = (int)str2.charAt(i); 
				if (str1_ch>96){
					str1_ch= str1_ch-32;
				}
				if (str2_ch>96){
					str2_ch=str1_ch-32;
				}
				if (str1_ch != str2_ch) { 
					return str1_ch - str2_ch;
				} 
			}
			if (l1 != l2) { 
				return l1 - l2;
			} 
			else { 
				return 0; 
			}
	} 

	public static void main(String args[]) 
	{ 	
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();  
		String str2 = sc.nextLine(); 
		System.out.println(strcmp(str1, str2)); 
	} 
}