
class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

	void init(){ 

/*
		problem 1
*/
/*
double gpa = 70.6;
if(gpa > 90.0 )
System.out.println(gpa * 1.1);
else
System.out.println(gpa);
*/
/*
		problem 2

		String gradelevel = "Senior";
		int credits = 45;
		boolean isGraduating = isGraduating(gradelevel,credits);

		if(isGraduating){
			System.out.println(" is graduating");
		}else{
			System.out.println(" is not graduating");
		}
*/		

/*
problem 3 
*/
	
/*
double tweight =18.5;
double theight = 24.9;
String bm = BMI(tweight,theight);
System.out.println("For a weight of " + tweight + "pound and a height of "  +  theight + " calculated as: ");
System.out.println(bm);


*/
/*
problem 4 
*/
/*
System.out.println(blueOrViolet(650));
System.out.println(blueOrViolet(720));
System.out.println(blueOrViolet(500));
*/

/*

System.out.println("cost for 5 pound" + shippingCost(5));	
System.out.println("cost for 12 pound" + shippingCost(12));	
System.out.println("cost for 20 pound" + shippingCost(30));	
System.out.println("cost for 30 pound" + shippingCost(30));	
*/ 
/*
problem 5
*/


} 

/*
Challenge 1:
Write a function "gpa" that takes in the GPA value and returns the calcuation : if it's over 90, return gpa*1.1, otherwise return the raw gpa.
*/ 

/*
double gpa(double GPA){
	if (GPA > 90){
		return GPA * 1.1;
	}else{
		return GPA;
	}
}

*/

/*		
Challenge 2:

Write a function " isGraduating" that accepts the grade level and number of credits earned that returns the boolean value TRUE if a student is a Senior and has 44 or more credits, 
otherwise return FALSE. 
*/ 
/*
In the init function:
Display to console "Student is Graduating" or "Student is NOT Graduating" depending on the value return by the function.
  */ 

/*
boolean isGraduating(String gradelevel,int credits){
	if(gradelevel == ("Senior") && credits >= 44){	
	return true;
}else{
	return false;
}

}
*/
/*
Challenge:3
BMI
Write a function "BMI" that accepts a weight in pounds and 
height in inches. Calculate the BMI (google the formula) and 
return return the following:
    BMI 18.4 or less return Underweight
    BMI is 18.5 - 24.9	(inclusive) return Normal
    BMI is 25.0 - 39.9	(inclusive) return Overweight
    BMI is 40.0	or greater return  Obese  

*/

/*
String BMI(double weightpound, double heightinch){
	double bmi =(weightpound)/(heightinch * heightinch)*703;
if(bmi <= 18.4){
	return "UnderWeight";
}else if(bmi >= 18.5 && bmi <=24.9){
	return "Normal";
}else if (bmi >= 25.0 && bmi <= 39.9){
	return "OverWeight";
}else{
	return "Obese";
}

*/

/*
Challenge 4:

Write a function "shippingCost" that accepts a weigth
in units of pounds and returns:
- 0.00, if 10 pounds or less,
- 5.00, if more than 10 pounds but 15 pounds
or less,
- 10.00, if more than 15 pounds but 25 pounds
or less,
- 10.00 Plus 2 cents per pound over 25 pound,
if over 25 pounds.
*/

/*
double shippingCost(double weightinunits){
if(weightinunits <= 10){
  return 0.00;
}else if (weightinunits> 10 && weightinunits <=15){
  return 5.00;
}else if (weightinunits > 15 && weightinunits <= 25){
  return 10.00;
}else{

  double xpound = weightinunits - 25;
  double xcost = xpound * 0.02;
  return 10.00 + xcost;
}

}
*/

/*
Challenge 5:

Write a function "blueOrViolet" that accepts a light frequency in THz units and returns true for either blue frequence (600-670 THz) 
or violet frquence (700-750 THz), otherwise return false
*/ 
/*
boolean blueOrViolet(double lightdrequency)
 if(lightdrequency >= 600 && lightdrequency <= 670){
	return true;
 }else if(lightdrequency >= 700 && lightdrequency <= 750){
	return true;
 }else{
	return false;
 }
}
 
*/



