package ClassesAndObjects;
import java.io.*;
import java.util.*;


class Triangle{
	int length,breadth,height;
	Triangle(int length,int breadth,int height){
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}
	public int area() {
		return ((length*breadth*height)/3);
	}
	
}
class Rectangle{
	int length,breadth;
	Rectangle(int length,int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	public int area() {
		return length*breadth;
	}
}
class Square{
	int side;
	Square(int side){
		this.side = side;		
	}
	public int area() {
		return side*side;
	}
	
}


public class PolygonAreaCalculator {

	public static void main(String[] args) {  
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the shape to which the area has to be calculated: ");
		System.out.println("1: Triangle");
        System.out.println("2: Rectangle");
        System.out.println("3: Square");  
        System.out.println("4: Exit");
        while(true) {
        	System.out.println("Enter your choice: ");
        	int opt = sc.nextInt();
        	switch(opt) {
        	case 1:
        		System.out.println("Enter the dimensions to find the area of a triangle: "); 
        		System.out.println("Length: ");
        		int length = sc.nextInt();
        		System.out.println("Breadth: ");
        		int breadth = sc.nextInt();
        		System.out.println("Height: ");
        		int height = sc.nextInt();
        		Triangle t = new Triangle(length,breadth,height);
        		int area = t.area();
        		System.out.println("Area of the triangle: "+area);
        		break;
        		
        	case 2:
        		System.out.println("Enter the dimensions to find the area of a rectangle: ");
        		System.out.println("Length: ");
        		int length1 = sc.nextInt();
        		System.out.println("Breadth: ");
        		int breadth1 = sc.nextInt();
        		Rectangle r = new Rectangle(length1,breadth1);
        		int area1 = r.area();
        		System.out.println("Area of the rectangle: "+area1);
        		break;
        	case 3:
        		System.out.println("Enter the dimensions to find the area of a square: ");
        		System.out.println("Side: ");
        		int side = sc.nextInt();        		 
        		Square s = new Square(side);
        		int area2 = s.area();
        		System.out.println("Area of the rectangle: "+area2);
        		break;
        	case 4:
        		System.out.println("Exiting Out of the program");
        		System.exit(0);
        	default:
        		System.out.println("Invalid Choice!");
        	}
        }
	}

}
