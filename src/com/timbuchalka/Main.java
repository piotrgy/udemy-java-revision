package com.timbuchalka;

import com.timbuchalka.billburgers.Hamburger;
import com.timbuchalka.billburgers.HealthyHamburger;
import com.timbuchalka.composition.Chair;
import com.timbuchalka.composition.Door;
import com.timbuchalka.composition.LightSource;
import com.timbuchalka.composition.Room;
import com.timbuchalka.encapsulation.Printer;

public class Main {

    public static void main(String[] args) {
        //double amount = 10000;

        /*for (int interestRate = 2; interestRate < 9; interestRate++){
            System.out.println(amount+ " at "+interestRate+"% interest = "+calculateInterest(amount, interestRate));
        }

        for (int interestRate = 8; interestRate > 1; interestRate--){
            System.out.println(amount+ " at "+interestRate+"% interest = "+calculateInterest(amount, interestRate));
        }*/

        /*final int MIN = 100;
        final int MAX = 328;
        int primeCounter = 0;

        for (int i = MIN; i < MAX; i++){
            if (isPrime(i)){
                System.out.println(i+" is a prime number!");
                primeCounter++;
            }
        }
        if (primeCounter == 0){
            System.out.println("There is no prime number in the range :-(");
        }
        else {
            System.out.println("There is a: "+primeCounter+" prime number/s!");
        }*/

        /*int number = 13;
        final int FINISH_NUMBER = 35;
        int counter = 0;

        while (number <= FINISH_NUMBER) {
            if (!isEven(number)) {
                number++;
                continue;
            }
            System.out.println("Even number "+number);
            number++;
            counter++;
            if (counter == 5) {
                break;
            }

        }
        System.out.println("There is "+counter+" even number(s) in the range!");


        if(isEven(number)){
            System.out.println(number+" is Even!");
        }
        else {
            System.out.println(number+" is Odd!");
        }*/

        /*BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(124.89);
        bankAccount.withdraw(34);
        bankAccount.withdraw(120);*/

        /*System.out.println("Creating object with default constructor.");
        VipCustomer customer1 = new VipCustomer();
        customer1.printFields();

        System.out.println("Creating object with 2 argument constructor.");
        VipCustomer customer2 = new VipCustomer("John Doe", 500.0);
        customer2.printFields();

        System.out.println("Creating object with 3 argument constructor.");
        VipCustomer customer3 = new VipCustomer("Anna Dark", 1500.0, "anna@gmail.com");
        customer3.printFields();*/

/*

        Room room = new Room(new LightSource("red"), new Door(true), new Chair(3));

        System.out.println("Legs of chair: "+room.getChair().getLegs());
        room.allFields();
*/
//Encapsulation
        /*Printer printer = new Printer();

        printer.fillUpTheToner(135);
        System.out.println("Filled the toner and now the toner level is: "+printer.getTonerLevel());

        printer.printPage(110);
        System.out.println("A pages was printed and now there is a: "+printer.getPagesPrinted()+" pages printed.");

        if (printer.isDuplex()) {
            System.out.println("This printer has a duplex.");
        }else System.out.println("Thie printer has no duplex.");*/

//BillBurger
        Hamburger hamburger = new Hamburger("White", "Chicken", 4.70);
        System.out.println("Basic Hamburger with "+hamburger.getBreadRollType()+" and "+hamburger.getMeat()+" costs "+hamburger.getPrice()+" PLN.");
        hamburger.addLettuce(1.80);
        hamburger.addTomato(0.80);
        System.out.println("Added lettuce and tomato.");
        System.out.println("Now hamburger costs "+hamburger.getPrice()+" PLN.");


        HealthyHamburger healthyHamburger = new HealthyHamburger("Brown", "Bacon", 5.70);
        System.out.println("Healthy Hamburger with "+healthyHamburger.getBreadRollType()+" and "+healthyHamburger.getMeat()+" costs "+healthyHamburger.getPrice()+" PLN.");
        healthyHamburger.addLettuce(1.80);
        healthyHamburger.addRadish(2.56);
        System.out.println("Added lettuce and radish.");
        System.out.println("Now Healthy Hamburger costs "+healthyHamburger.getPrice()+" PLN.");
    }






    public static boolean isEven (int number){
        if (number % 2 == 0){
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isPrime (int n){
        if (n == 1){
            return false;
        }

        for (int i = 2; i <= n/2; i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest (double amount, double interestRate){
        final int PERCENTAGE = 100;
        return (amount * (interestRate/PERCENTAGE));


    }

    public static double calcFeetAndInchesToCentimetres (double feet, double inches){

        if((feet >= 0) && (inches >=0 && inches <= 12)){
            inches += feet * 12;
            return calcFeetAndInchesToCentimetres(inches);
        }
        else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimetres (double inches){

        if(inches >=0){
            return inches * 2.54;
        }
        else {
            return -1;
        }
    }

    static public void displayHighScorePosition (String name, int position){
        System.out.println(name + " managed to get into position "+position+" on the high score table.");
    }

    static public int calculateHighScorePosition (int score){

        if(score >1000){
            return 1;
        }
        else if(score > 500 && score < 1000){
            return 2;
        }
        else if(score > 100 && score < 500){
            return 3;
        }
        else
        return 4;
    }
}
