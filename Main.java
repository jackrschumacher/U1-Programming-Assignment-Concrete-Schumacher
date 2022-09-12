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
  double poolPlusConcrete = poolLength + 1 * poolWidth +1 *0.166667;
  double concreteArea = poolPlusConcrete - poolArea;
  System.out.println(concreteArea);
  double pricePerYard = 419.95; //Set up constant PPY variable
  double bill = 1200+ 419.95 * concreteArea ;
    
  

    
  }
}