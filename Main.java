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
  double poolArea = poolLength * poolWidth / 3; //Multiply pool length by pool width and then divide by 3 in order to convert to yards
  double poolPlusConcrete = poolLength+12  * poolWidth+12 ;
    

  double concreteArea = poolPlusConcrete - poolArea;
  
  double pricePerYard = 419.95; //Set up constant PPY variable
  double concreteCost = pricePerYard * concreteArea; 
  double tax = 0.055 * concreteCost;
  double totalCost = 1200+ concreteCost + tax;
  System.out.println("Your bill is:" + totalCost);
    
  

    
  }
}