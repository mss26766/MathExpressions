import java.util.Scanner;

public class MathExpressions {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a value for x");
		int x = keyboard.nextInt();
		System.out.print(f(x)+"\n");
		
		System.out.println("Enter a value for y");
		int y = keyboard.nextInt();
		System.out.print(g(x,y) + "\n");
		
		System.out.println("Enter a value for z");
		int z = keyboard.nextInt();
		System.out.println(h(x,y,z));
	
		keyboard.close();
	}
public static int f(int x){
	return (int) Math.pow(x, 10);
}
public static int g(int x, int y){
	return x + y ;
}
public static int h(int x, int y, int z){
	return (int) (Math.sqrt(x)+ Math.abs(y)+ Math.pow(z, y));
}
}
 