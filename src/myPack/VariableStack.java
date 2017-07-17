package myPack;

public class VariableStack implements Stack
{
	public int arr[ ];	//integer array to store stack element
	public int top,SSize;	//integer variable to store top of stack and stack size
	VariableStack(int size)	//parameterized constructor to initialize stack size
	{
		SSize=size;	//storing initial stack size to SSize variable
		arr=new int[size];	//initializing array size
		top=-1;
	}
	public void push(int i)	//push method to insert element into stack
	{
		if(top==arr.length-1)
		{
			System.out.println("Resizing Stack");
			int t[ ]=new int[arr.length * 2];	//resizing new length of stack
			for(int j=0;j<arr.length;j++)
				t[j]=arr[j];	//coping old array to new array
			arr=t;
			arr[++top]=i;	//adding element to new resized stack
		}
		else
			arr[++top]=i;	//push element to stack
	}
	public int pop()	//pop method to remove element from stack
	{
		if(top==-1)	//condition to check if element is present in stack
		{
			System.out.println("No Elemenet in Stack");
			return -1;
		}
		else
			return arr[top--];	//popping value out of stack
	}
}