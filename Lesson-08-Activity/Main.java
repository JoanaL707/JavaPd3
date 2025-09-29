//Challenge 1:
//Write a function "print" which takes in a string and displays it to the console. Test the function to make sure it works.



/*public class Main {

	public static void main(String[] args) {
    
		String msag = "iugdjv";
		print(msag);

}
static void print(String msag){
System.out.println("name "+msag);

	}

}
*/


//Challenge 2:
//Write a function "FtoC" that converts temperature in degrees Fahrenheit to Celsius. The function will take in temperature in Fahrenheit and return the temperature in Celcius. 
//Google the formula.



/*
public class Main{
	public static void main(String[] args){
	double cel = FtoC(72.5);
	System.out.println("temperature in celsius: "+cel);
	
	}
public static double FtoC(double F){
double C =(F-32)*5/9;
return C;
}

}
*/



//Challenge 3:
//Write a function "sphereVolume" that calculate the volume of a sphere. The function will take in the radius and return the volume of a sphere.
//Google the formula.




/*
public class Main{
	public static void main(String[] args){
double radius =5;
double volume = sphereVolume(radius);
System.out.println("The volume of the sphere with radius "+radius+" is "+volume);

	}
public static double sphereVolume(double radius){
return(4.0/3.0)*Math.PI*Math.pow(radius,3);

}
}
*/



/*
Challenge 4:
Write a function "coneVolume" that calculate the volume of a cone. The function will take in the radius and a height and return the volume of a cone.
Google the formula.
*/



/*
public class Main{
public static void main(String[] args){
double radius = 5;
double height =7;
double volume = coneVolume(radius,height);
System.out.println("The calculation of the volume of the cone is "+ volume );
}
public static double coneVolume(double radius, double height){
return(1.0/3.0)*Math.PI*Math.pow(radius,2)*height;

}

}
*/


//Challenge 5:

//Write a function "distance" that calculate the distance between two points (x1,y1) and (x2,y2). The function will need to take paramaters that represents two points.
//Google the formula.


public class Main{
	public static void main(String[] args){

double x1=3.0,y1=4.0,x2=7.0,y2=1.0;
System.out.println("The distance is "+ distance(x1,y1,x2,y2));


	}
public static double distance(double x1,double y1, double x2, double y2 ){

double diffX = x2-x1;
double diffY =y2-y1;

return Math.sqrt(Math.pow(diffX,2)+Math.pow(diffY,2));

}

}