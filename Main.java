import java.util.Scanner;


class Main {
  public static void main(String[] args) {

  Scanner input = new Scanner(System.in);
  System.out.println("What is your name?:"); //Input, name, address and the dimensions of your pool 
  String username = input.nextLine();
  System.out.println("Ok! Your name is " +  username); //Print out what was inputed from the user
  System.out.println("What is your address?");
  String address = input.nextLine();
  System.out.println("Ok! Your address is "+ address);
  System.out.println("What is the length of your pool? (in feet)");
  double poolLength = input.nextDouble();
  System.out.println("Ok! The length of your pool is " + poolLength + " feet.");
  System.out.println("What is the width of your pool (in feet)");
  double poolWidth = input.nextDouble();
  System.out.println("Ok! The length of your pool is:" + poolWidth + " feet.");
  double poolArea = poolLength * poolWidth; //Calculate the total pool area by Multiplying length * width
  poolLength = poolLength + 12;
  poolWidth = poolWidth + 12; //add twelve because you are adding 6 in length and width on each side
  double concreteArea = poolWidth * poolLength; //Multiply pool width by pool length
  concreteArea = concreteArea - poolArea; //Subtract the total area of both the pool and the concrete by the area of just the pool, leaving just the concrete
  concreteArea = concreteArea * 0.5; //Multiply just the concrete area by 0.5 because the concrete is poured to half a foot
  double pricePerYard = 419.95; //Set up pricePerYard Constant
  concreteArea = concreteArea / 27; //Divide by 3 in order to convert to yards and then divide by 9, which gets you 27
  double bill = 1200 + (0.055*concreteArea*pricePerYard) + (pricePerYard * concreteArea); //Flat fee of $1200 + tax times the concrete area times the pricePerYard of concrete plus price per yard times the concrete area to get the total bill
  System.out.println("----------Your Bill-------------"); //Print out the bill to the console using values input in the beginning of the program and calculated later
  System.out.println("Name: "+ username);
  System.out.println("Address: "+ address);
  System.out.println("Your total bill is: $"+bill);
  
  
    
  }
}