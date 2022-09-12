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
  double poolArea = poolLength * poolWidth;
  poolLength = poolLength + 12;
  poolWidth = poolWidth + 12;
  double concreteArea = poolWidth * poolWidth - poolArea ;
  concreteArea = concreteArea * 0.5;
  System.out.println(concreteArea);
  System.out.println(poolArea);
  
    
  

    
  }
}