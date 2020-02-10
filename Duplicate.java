package java_assign;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ele = 0;
		ArrayList<String>  color = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("");
			System.out.println("1 For Insert Color");
			System.out.println("2 For Show List");
			System.out.println("3 For Exit");
			ele = sc.nextInt();
			switch(ele) {
				case 1:{
					System.out.println("Enter the Color");
					String col = sc.next();				
						color.add(col);
						break;
				}
				case 2:{
					Set<String> set = new HashSet<String>(color);
					System.out.println(set);					
					break;
				}
				case 3:{
					System.exit(0);
				}
				default:{
					System.out.println("Choose Right Option");
				}
			}

		}
		while(ele != 3);
	
	}

}
