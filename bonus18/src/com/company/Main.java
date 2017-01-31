package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userInput = "yes";
        int choice = 0;
        int option;
        String name = "";
        String weapon = "";
        String dragonName = "";
        do {
            System.out.println("Whats your name?");
            name = scnr.next();
            System.out.println("Hello " + name + ", would you like to play a game? (1.y/2.n)");
            choice = scnr.nextInt();

            switch (choice) {

                case 1: {
                    System.out.println("Excellent! You are walking across a field and you encounter a fire breathing dragon!");
                    System.out.println(" what would you do? (1.face the beast /2.run)");
                    option = scnr.nextInt();
                    switch (option){
                        case 1: {
                            System.out.println("You approach the dragon. You see that he has __ heads.");
                            System.out.println("How many heads does the dragon have?");
                            option = scnr.nextInt();
                            System.out.println("No one has ever faced a " + option + "-headed dragon before! Choose your weapon. (1.slingshot, 2.sword, 3.bow and arrow)");
                            option = scnr.nextInt();
                            switch (option) {
                                case 1: {
                                    weapon = "slingshot";
                                    break;
                                }
                                case 2: {
                                    weapon = "sword";
                                    break;
                                }
                                case 3: {
                                    weapon = "bow and arrow";
                                    break;
                                }
                                default:
                                    weapon = "fists";
                            }
                            System.out.println("armed with your " + weapon + ", you approach the dragon. you can feel its fiery breath as you get closer. it stares at you with its __ eyes");
                            System.out.println("What color are the dragons eyes? (1.red, 2.blue)");
                            option = scnr.nextInt();
                            switch (option){
                                case 1: {
                                    System.out.println("Oh thank goodness! Red-eyed dragons are friendly. You pet it and become friends. You name the dragon __.");
                                    System.out.println("Enter  a name.");
                                    dragonName = scnr.next();

                                    System.out.println(name + " and " + dragonName + " live happily ever after.");
                                    break;
                                }
                                case 2:{
                                    System.out.println("The dragon killed you, you were to close.");
                                    break;
                                }
                            }
                            break;
                        }
                        default:{
                            System.out.println("Goodbye");
                        }
                    }
                    break;

                }
                case 2: {
                    System.out.println("Goodbye");
                    userInput = "no";

                    break;
                }


            }
            System.out.println("Would you like to play again? y/n");
            String answer = scnr.next();
            if (answer.charAt(0) == 'n') {
                userInput = "no";
            }

        } while (userInput.equalsIgnoreCase("yes"));
    }
}
