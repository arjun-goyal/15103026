package lab;

import java.util.Scanner;

class calculator implements calc{
	int num1;
	int num2;
	
	public static void main(String arg[])
	{
		int opt, data1 =0, data2=0;
		
		calculator c = new calculator();
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			System.out.print("Choose the option");

			System.out.print("\n1.Enter numbers\n2.Add\n3.Sub\n4.Multiply\n5.Division\n6.Max\n7.Min\n8.Cos\n9.Sin");
			opt = scan.nextInt();
			switch(opt)
			{
			case 1:
				
					System.out.print("Enter the two numbers: ");
					data1 = scan.nextInt();
					data2 = scan.nextInt();
					c.enter(data1, data2);
				break;
			case 2:
					c.add(data1, data2);
				break;
			case 3:
				c.sub(data1, data2);
				break;
			case 4:
				c.mul(data1, data2);
				break;
			case 5:
				c.div(data1, data2);
				break;
			case 6:
				c.maxnum(data1, data2);
				break;
			case 7:
				c.minnum(data1, data2);
				break;
			case 8:
				c.cos(data1, data2);
				break;
			case 9:
				c.sin(data1, data2);
				
			}
		if(opt>9)
				break;	
			}
	}
	
	public void enter(int data1, int data2)
	{
		num1 = data1;
		num2 = data2;
	}
		public void sub(int data1, int data2)
		{
			System.out.print(num1-num2);
		}
		public void mul(int data1, int data2)
		{
			System.out.print(num1*num2);
		}
		public void div(int data1, int data2)
		{
			System.out.print(num1/num2);
		}
		public void maxnum(int data1, int data2)
		{
			if(num1>num2)
				System.out.print(num1);
			else
			System.out.print(num2);
			
		}
		public void minnum(int data1, int data2)
		{
			if(num1<num2)
				System.out.print(num1);
			else
			System.out.print(num2);
		}	
		
		public void cos(int data1, int data2)
		{
			System.out.print(Math.cos(num1));
			System.out.print(Math.cos(num2));
		}
		public void add(int data1, int data2)
		{
			System.out.print(num1+num2);
		}
		public void sin(int data1, int data2)
		{
			System.out.print(Math.sin(num1));
			System.out.print(Math.sin(num2));
		}
}
	


interface calc {
	void enter(int a, int b);
	void add(int a, int b);
	void sub(int a, int b);
	void mul(int a, int b);
	void div(int a, int b);
	void maxnum(int a, int b);
	void minnum(int a, int b);
	void cos(int a, int b);
	void sin(int a, int b);
}

