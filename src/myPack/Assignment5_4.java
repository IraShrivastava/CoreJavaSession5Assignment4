package myPack;
import java.util.Scanner;
public class Assignment5_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Size For Fixed Stack");
		Scanner in=new Scanner(System.in);
		FixedStack fs=new FixedStack(in.nextInt());		//assigning size for fixed stack
		System.out.println("Enter Size For Dynamic Stack");
		VariableStack vs=new VariableStack(in.nextInt());	//assigning size for dynamic stack
		System.out.println("Push Operation for Fixed Stack");
		System.out.println("Enter elements for fixed stack:");
		for(int i=0;i<fs.StackSize;i++)
			fs.push(in.nextInt());	//pushing element into fixed stack
		System.out.println("Input element to demonstarte Overflow Stack");
		fs.push(in.nextInt());	//push element to check for stack overflow condition
		System.out.println("POP Operation for Fixed Stack");
		for(int j=0;j<fs.StackSize;j++)
			System.out.println(fs.pop());	//popping element out of fixed stack
		System.out.println("Push Stack for Dynamic Stack");
		System.out.println("Enter elements for dynamic stack:");
		for(int i=0;i<vs.SSize;i++)
			vs.push(in.nextInt());	//pushing element into dynamic stack
		System.out.println("Input element to demonstart resizing Dynamic Stack");
		vs.push(in.nextInt());	//pushing element to resize dynamic stack
		System.out.println("POP Operation");
		for(int j=0;j<vs.arr.length;j++)
			System.out.println(vs.pop());	//popping element out of dynamic stack
	}
}
