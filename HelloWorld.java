package selenumPkg;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner myobj = new Scanner(System.in);
		System.out.println("Enter the first word");
		String str = myobj.nextLine();
		str = str+" ";
		System.out.println("Enter the second word");
		String str1 = myobj.nextLine();
		String str3 = str.concat(str1);
		System.out.println(str3);
		
	}

}
