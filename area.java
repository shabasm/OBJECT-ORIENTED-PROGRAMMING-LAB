import java.util.*;

class myClass{
	int a;
	double a1;
	void area(int x,int y){
		a=x*y;
		System.out.println("Area of rectangle:"+a);
	}
	void area(int x){
		a=x*x;
		System.out.println("Area of square:"+a);
	}
	void area(double x){
		a1=3.14*x*x;
		System.out.println("Area of circle:"+a1);
	}
	void area(double x,double y){
		a1=0.5*x*y;
		System.out.println("Area of triangle:"+a1);
	}
}

public class area{
	public static void main(String args[]){
		int s,l,b,ch,wish;
		double r,h,b1;
		Scanner sc=new Scanner(System.in);
		System.out.println("---MENU---");
		System.out.println("1.Area of rectangle\n2.Area of circle\n3.Area of square\n4.Area of triangle\n");
		do{
			System.out.println("Enter your choice:");
			ch=sc.nextInt();
			myClass myObj=new myClass();

			switch(ch){
				case 1:System.out.println("Enter the length of rectangle:");
					l=sc.nextInt();
					System.out.println("Enter the breadth of rectangle:");
					b=sc.nextInt();
					myObj.area(l,b);
						break;
case 2:System.out.println("Enter the radius of circle:");
r=sc.nextDouble();
myObj.area(r);
break;
case 3:System.out.println("Enter the length of square:");
s=sc.nextInt();
myObj.area(s);
break;
case 4:System.out.println("Enter the base of triangle:");
b1=sc.nextDouble();
System.out.println("Enter the height of triangle:");
h=sc.nextDouble();
myObj.area(b1,h);
break;
default:System.out.println("Wrong choice..");
break;
}
System.out.println("Do you wish to continue(1/0):");
wish=sc.nextInt();
}while(wish==1);
}
}
