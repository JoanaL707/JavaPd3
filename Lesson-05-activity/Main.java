class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
    

/*  
    Challenge 1:
    Create two integer variables and Assign values to them. 
    Calculate the sum of the two numbers and store the 
    calculated sum and then display it.
    
*/
   int h = 4;
   int y = 2;
   int sum = 4+2;

System.out.println("result is" + sum);


/*  
    Challenge 2:
    Create three variables to assign three grades and Assign values to each grade. 
    Calculate the sum of the three grades and store the 
    calculated sum and then display it.
    
*/
 
int f = 70;
int l = 90;
int c = 70;
int sum1 = (70+90+70)*3;

System.out.println("The result is"+sum1);

/*  
    Challenge 3:
    Calculate the average from the three grades from challenge 2,
    store the value and then display it.
    Declare and assign values to any new variables
    NOTE: Does it look correct, check with a calculator?
*/

int o = 6370;
System.out.println("The result is"+o);


/*  
    Challenge 4:
    Write the following equation in EQ1.PNG file in Java; store the result and the display it:
    Declare and assign values to any new variables
*/
  int A = 10;
  int x = 9;

int sum2 = (A/x+1);
System.out.println("The result is"+sum2);

/* 
    Challenge 5:
    Using the variables same variables from challenge4 above, write the following equation in EQ2.PNG file in Java, store the result and the display it:

    Declare and assign values to any new variables

*/
 
 int g = 10;
 int j = 9;
int sum3= (2*g*g+1*-g/2)/j;
System.out.println("The result is "+sum3);




/*  
    Challenge 6:
    Create the variables and write the equation in
    file  EQ3.PNG

    Declare and assign values to any new variables
*/
 

int m = 5;
int b = 7;

int area = (1/2)*b*m;

System.out.println("The result is"+area);


/*  
    **** Bonus Challenge ****:
    Create a variable that stores the total number of eggs 
    and assign it 100. We want to fill as many baskets with 
    eggs as we can. Each basket can hold only 12 eggs.

    1) Write the java code that will calcute how many baskets
    of 12 eggs can we fill fully.

    HINT: What do we get when we divide an integer by 
    an integer in Java

    2) Write the java code that will calculate how many eggs
    are left over after we filled as many baskets of 12 eggs.
*/

int eggs=100;
int basket = 12;

int p = (eggs/basket);

System.out.println("The product is"+p);

    // **************************************************
    // **** Don't write any code below here.  ***********
    // **************************************************
  }
}