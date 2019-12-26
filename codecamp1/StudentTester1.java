package codecamp1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
public class StudentTester1 implements Comparator {

					public static void main(String[] args)
					{
						int grades[]={1,7,2};
						String fname[]={"S","N","V"};
						String lname[]= {"rekha","sree","sai"};
						
						for(byte b=0;b<grades.length;++b)
						{
							System.out.println(fname[b]+lname[b]+" grades "+grades[b]);
						}
						System.out.println("before sorting an array");
						for(int g:grades) 
						{
							System.out.println(g);
							
						}
						
						Arrays.sort(grades);
						System.out.println("after sorting an array");
						for(int g:grades )
						{
							System.out.println(g);
						}
					}

					

					@Override
					public int compare(Object arg0, Object arg1) 
					{
						String s1=(String)arg0;
						String s2=(String)arg1;
						if(s1.equals(s2))
						{
							return 1;
						}else
						{
							return 0;
						}
					}

				}
