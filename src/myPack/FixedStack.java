package myPack;

public class FixedStack implements Stack
{
	public int arr[ ];		//integer array to store stack element
	public int top,StackSize;	//integer variable to store top of stack,length of array and Stack Size
	FixedStack(int size)	//parameterized constructor to initialize the size of stack
	{
		StackSize=size;		//storing stack size in variable StackSize variable
		arr=new int[StackSize];		//initializing size of array
		top=-1;
	}
	public void push(int i)	//push method to insert element into stack
	{
		if(top+1>=StackSize)	//condition to check overflow
		{
			System.out.println("Stack Overflows");
		}
		else
			arr[++top]=i;		//pushing value into stack
	}
	public int pop()	//pop method to remove element from stack
	{
		if(top<0)	//condition to check if stack is empty
		{
			System.out.println("Stack is empty");
			return 0;
		}
		else
			return arr[top--];	//popping value out of stack
	}
}