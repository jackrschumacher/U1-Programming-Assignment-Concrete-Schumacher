import java.util.Scanner;


class Main {
  public static void main(String[] args) {

  Scanner input = new Scanner(System.in);
  System.out.println("What is your name?:"); //Input, name, address and the dimensions of your pool 
  String username = input.nextLine();
  System.out.println("Ok! Your name is " +  username);
  System.out.println("What is your adress?");
  String adress = input.nextLine();
  System.out.println("Ok! Your adress is "+ adress);
  System.out.println("What is the length of your pool? (in feet)");
  double poolLength = input.nextDouble();
  System.out.println("Ok! The length of your pool is " + poolLength + " feet.");
  System.out.println("What is the width of your pool (in feet)");
  double poolWidth = input.nextDouble();
  System.out.println("Ok! The length of your pool is:" + poolWidth + " feet.");
  double poolArea = poolLength * poolWidth; //Calculate the total pool area by Multiplying length * width
  poolLength = poolLength + 12;
  poolWidth = poolWidth + 12; //add twelve because add 6 to each side
  double concreteArea = poolWidth * poolWidth;
  concreteArea = concreteArea - poolArea;
  concreteArea = concreteArea * 0.5;
  
  double pricePerYard = 419.95;
  concreteArea = concreteArea / 27; //Divide by 3 in order to convert to yards and then divide by 9, which gets you 27
  double bill = 1200 + (0.055*concreteArea*pricePerYard) + (pricePerYard * concreteArea);
  System.out.println("----------Your Bill-------------");
  System.out.println("Name: "+ username);
  System
    
  
    
  

    
  }
}