import java.util.Scanner;
class student_det
{
	String usn;
	String name;
	int marks[]=new int[3];
Scanner sc=new Scanner(System.in);
	void put_data()
	{
System.out.println("Enter USN:");
		usn=sc.next();
System.out.println("Enter Name:");
		name=sc.next();
		System.out.println("Enter marks\n");
		for(int l=0; l<3; l++)
		{
			marks[l]=sc.nextInt();
		}

	}//putdata end
void cal_credits
{
int tot_credits=3*4;
}



void cal_sgpa()
{
int sum;
for(int i=0;i<3;i++)
{
sum=sum+marks[i];
}
}

	void display()
	{

		System.out.println("Name:"+name);
		System.out.println("USN:"+usn);
		for(int i=0;i<3;i++)
		{
		System.out.println("marks of 3 subjects"+" "+marks[i]);	
		}	
	}

}//class end
class Student
{
	public static void main(String args[])
	{
		student_det s1[]=new student_det[3];
		for(int i=0; i<3; i++)
		{
		 s1[i]=new student_det();
		}//for end
		for(int j=0; j<3; j++)
		{
			System.out.println("enter the details of "+ ( j+1 ));
			s1[j].put_data();
		}//for end
		for(int k=0; k<3; k++)
		{
			s1[k].display();
		}
	}

}//main class end
