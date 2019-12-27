package Arith;
import java.io.InputStreamReader;
import static java.lang.System.out;

import java.awt.DisplayMode;
import java.io.BufferedReader;
import java.io.IOException;
public class Multidimensionarraydemo {

	public static void main(String[] args) throws IOException
	{
		String studentName[]= {"ram","rekha"};
		String subjectName[]= {"math","phy","chemi"};
		int marks[][][]= new int[2][2][3];
		//int year=1;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		for(int i=0;i<=2;i++)
		{
			out.println("enter marks for the year:"+(i+1));
			
			for(int j=0;j<2;j++)
			{
				out.println("enter "+studentName[j]+"marks:");
			
			for(int k=0;k<3;k++)
			{
				out.println("marks for"+subjectName[k]);
				marks[i][j][k]=Integer.parseInt(br.readLine());
			}
		}
   
	}

	
	   display(marks,studentName,subjectName);
	   
	}
	public static void display(int m[][][],String sName[],String subname[])
	{
		for(int i=0;i<=2;i++)
		{
			out.println("enter marks for the year:"+(i+1));
			
			for(int j=0;j<2;j++)
			{
				out.println(sName[j]+"marks:");
			
			for(int k=0;k<3;k++)
			{
				out.println("marks for"+subname[k]);
				out.print(m[i][j][k]);
			}
			}
		}
	}
	
}