/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.main;

import java.util.Scanner;
import src.controller.Controller;

/**
 *
 * @author kayos
 */
public class CapgeminiChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controller c = new Controller();
        Scanner sc = new Scanner(System.in);
        String choice = "";
        String read = "";
        int n = 0;
        do{
            System.out.println("[1] - Challenge 1");
            System.out.println("[2] - Challenge 2");
            System.out.println("[3] - Challenge 3");
            System.out.println("[4] - Exit");
            System.out.println("Choice: ");
            choice = sc.nextLine();
            switch(choice){
                case "1":
                    System.out.println("Type size of the stair (n:integer): ");
                    read = sc.nextLine();
                    try{
                        n = Integer.parseInt(read);
                        System.out.println("C01 - Output");
                        System.out.println(c.challege01(n));
                    }catch(Exception e){
                        System.out.println("Wrong type of input, try again!");
                    }
                    break;
                case "2":
                    System.out.println("Type your password (string): ");
                    read = sc.nextLine();
                    System.out.println("C02 - Output");
                    System.out.println("You have to insert at least "+c.challege02(read)+" charcters to get a Strong password!" );
                    break;
                case "3":
                    System.out.println("Type the word to check for anagrams (string): ");
                    read = sc.nextLine();
                    System.out.println("C03 - Output");
                    System.out.println("There are "+c.challege03(read)+ " anagrams" );
                    break;
                case "4":
                    System.out.println("Exiting...");
                    break;
                default: 
                    System.out.println("Chose a valid choice!");
                    break;
            }
        }while(!choice.equals("4"));
        
    }
    
}
