package com.exercises;
//Exercise 10
//Develop concurrent programs using Java threads.
import java.util.Scanner;

class DoctorCount extends Thread
{
   String docName,departmentName;
   DoctorCount(String name,String deptName)
   
   {
     super("my extending thread");
     docName = name;
     departmentName = deptName;
     
     start();
   }
   public void run()
   {
     try
     {
        for (int i=0 ;i<3;i++)
        {
           System.out.println("Printing the count " + i);
           Thread.sleep(1000);
        }
     }
     catch(InterruptedException e)
     {
        System.out.println("Doctor thread interrupted");
     }
     System.out.println("Doctor thread is over" );
   }
}
public class DoctorConcurrency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			Scanner sc = new Scanner(System.in);
			for(int i=0;i<5;i++) {				 
				System.out.println("Doctor Name : ");
				String docName = sc.nextLine();
				System.out.println("Department : ");
				String deptName = sc.nextLine();			      
				DoctorCount cnt = new DoctorCount(docName,deptName);
			
		      try
		      {
		         while(cnt.isAlive())
		         {
		           System.out.println("Main thread will be alive till the child thread is live");
		           Thread.sleep(1500);
		         }
		      }
		      catch(InterruptedException e)
		      {
		        System.out.println("Main thread interrupted");
		      }
		      System.out.println("Main thread's run is over" );
		   }
		}
	}
}

	


