
public class MyPointDriver {

	public static void main(String[] args) {
		
		//array instances
		MyPoint[] PointArray = new MyPoint[10];
		MyCircle[] CircleArray = new MyCircle[10];
		
		
		int counter = 1;       // counter for points
		int Arraycounter = 0;  // counter for index of array
		
		// loop to create points
		while(counter < 11) {	
			
			MyPoint point = new MyPoint(counter, counter);
			PointArray[Arraycounter] = point;
			
			//increase counters
			counter ++;
			Arraycounter ++;
		} //end of loop
		
		//initialize second counter
		int counter2 = 0;
		int Printcounter = 1; //counter used for printing purposes
		
		
		// loop to print points
		while(counter2 < PointArray.length) {
			
			//call toString of each point
			System.out.println("point " + Printcounter + ": " +  PointArray[counter2]);	
			
			//increase counters
			counter2 ++;
			Printcounter ++;
		} //end of loop
		
		//line space
		System.out.println();
		
		//initialize counter 3
		int counter3 = 0;
		int radcounter = 1;
		
		//loop to create instances of MyCircle 
		while(counter3 < 10) {
			MyCircle circle = new MyCircle(PointArray[counter3], radcounter);
			CircleArray[counter3] = circle;
			
			//increase counters
			counter3 ++;
			radcounter ++;
		}
		
		//counter to print
		int counter4 = 0;
		int Printcounter2 = 1;
		
		//loop to print circles
		while(counter4 < CircleArray.length) {
			
			//call to string on each circle
			System.out.println("Circle " + Printcounter2 + ": " + CircleArray[counter4]);
			
			//increase counters
			counter4 ++;
			Printcounter2 ++;
			
		}
		
		//line space
		System.out.println();
		
		
		//create instances of Cylinder
		MyPoint point = PointArray[3];
		MyCircle circle = CircleArray[3];
		int radius = circle.getRadius();
		Cylinder cylinder = new Cylinder(point, radius, 6);
		
		//call my circle methods through cylinder
		System.out.println(cylinder.getArea());
		System.out.println(cylinder.getCenterX());
		System.out.println(cylinder.getCircumference());
		
		//Polymorphism Foreshadowing
		
		//create instances of cylinder
		Cylinder cy1 = new Cylinder(PointArray[1], 1, 1);
		Cylinder cy2 = new Cylinder(PointArray[2], 2, 2);
		Cylinder cy3 = new Cylinder(PointArray[3], 3, 3);
		Cylinder cy4 = new Cylinder(PointArray[4], 4, 4);
		Cylinder cy5 = new Cylinder(PointArray[5], 5, 5);
		
		
		MyCircle[] PolyArray = new MyCircle[]
				{CircleArray[1], CircleArray[2], CircleArray[3], CircleArray[4], CircleArray[5],
				 cy1, cy2, cy3, cy4, cy5};
		
		// line space
		System.out.println();
		
		//toString loop
		int cylCounter = 0;
		
		while(cylCounter < PolyArray.length) {
			
			//call toString on each
			System.out.println(PolyArray[cylCounter]);
			
			//increase counter
			cylCounter ++;
		}
		
		// I got confused at the end of the foreshadowing assigments.
		

	} //end of main

} //end of class
