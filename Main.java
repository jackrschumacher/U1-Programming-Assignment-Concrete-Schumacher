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
  double concreteArea = poolWidth * poolWidth;
  concreteArea = concreteArea - poolArea;
  concreteArea = concreteArea * 0.5;
  double pricePerYard = 419.95;
  concreteArea = concreteArea / 27; //Divide by 3 in order to convert to yards and then divide by 9, which gets you 27
  double bill = 1200 + (0.055*concreteArea*pricePerYard) + (pricePerYard * concreteArea);
  System.out.println("----------Your Bill-------------");
  System.out.println("Name: "+ username);
  System.out.println("Address: "+ address);
  System.out.println("Your total bill is: $"+bill);
  
    
  
    
  

    
  }
}