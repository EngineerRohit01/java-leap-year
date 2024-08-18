import java.util.Scanner;

public class file{
	public static void main(String[] args){
	Scanner leap = new Scanner(System.in);
	System.out.print("enter a year");
	
	int a = leap.nextInt();
	
	if(a%4==0 && a%100!=0){
		if(a%4==0){
			System.out.print("Leap yewar");
	}
}
else{
	System.out.print("not a leap year");
}
	}
}