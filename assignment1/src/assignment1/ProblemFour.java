package assignment1;

import java.util.Scanner;

public class ProblemFour {

	public static void main(String[] args) {


		Scanner scan=new Scanner(System.in);
		System.out.println("enter user name and password");
		new JobReg().check(scan.nextLine(),scan.nextInt());

	}

}

class JobReg
{
	String userName;
	 int password;
    static void check(String userName,int password)
	{
    	boolean flag=false;	
		if(userName.length()>8 && userName.endsWith("_job"))
		{
			flag= true;
		}
			else
			{
				flag=false;
		}
		
		if(flag) {
			System.out.println("done!");
		}
		else {
			System.out.println("incorrect credencials");
		}
		
	}
}
