package com.exercises;
class NewThread implements Runnable{
	String name;
	Thread t;
	NewThread(String threadname){
		name = threadname;
		t = new Thread(this,name);
		System.out.println("Thread Name: " + t.getName());
		System.out.println("Thread Priority: " + t.getPriority());
		System.out.println("Thread state: " + t.getState());
		System.out.println();
		t.start();
	}
	public void run() {
		try {
			for(int i = 1;i<4;i++) {
				System.out.println(name + " said hello " + i);
				Thread.sleep(1000);
			}
		}catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println(name + "Interrupted");
		}
		System.out.println(name + " exiting");
	}
}

public class MultiThreading {

	public static void main(String[] args) {
		 
		 new NewThread("MONICA");
		 new NewThread("RACHEL");
		 new NewThread("PHEOBE");		 
        try {
        	System.out.println("Ross,Joey and Chandler came in and waved a hi");
        	Thread.sleep(5000);
        }catch (InterruptedException e) {
			// TODO: handle exception
        	System.out.println("Main thread Interrupted");
		}
        System.out.println("All three backed of exiting");
        System.out.println("Main Thread exiting");
	}    
}