/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author enzot224
 */
import java.util.Scanner;
public class RockPaperScissors {

    public static void main(String[] args) {
        Move rock = new Move("Rock");
	Move paper = new Move("Paper");
	Move scissors = new Move("Scissors");
	rock.setStrongAgainst(scissors);
	paper.setStrongAgainst(rock);
	scissors.setStrongAgainst(paper);
        
        int userWins = 0, computerWins = 0;
        Scanner sc = new Scanner(System.in);
        String choice = "0";
        String choiceMoveinput = "0";
		
	int roundsToWin = 2;
        
        while(!choice.equals("1")){
            System.out.println("1. Start Game");
            System.out.println("2. Change number of rounds");
            System.out.println("3. Exit application");
            choice = sc.nextLine();
        
            if(choice.equals("2")) {
                System.out.println("How many wins are needed to win a match?");
                roundsToWin = sc.nextInt();
                choice = "0";
            } if(choice.equals("3")){
                System.out.println("Thank you for playing.");
                break;
            } if(choice.equals("1")){
                boolean done = false;
            
            System.out.println("\nThis match will be first to " + roundsToWin + " wins.");
            
            while(!done) {
                         
                int random = (int) Math.floor(Math.random()*3) + 1;
            
                Move compChoice = rock;
            
                switch(random) {
                    case 1:
                        compChoice = rock;
                    break;
                    case 2:
                        compChoice = paper;
                    break;
                    case 3:
                        compChoice = scissors;
                }
             
                System.out.println("\nThe computer has selected its move.\nPlease enter your move");
                System.out.println("1. rock");
                System.out.println("2. paper");
                System.out.println("3. scissors");
                choiceMoveinput = sc.nextLine();
            
                Move userMove = rock;
                switch(choiceMoveinput) {
                    case "1":
                    case "rock":
                        userMove = rock;
                        break;
                    case "2":
                    case "paper" :  
                        userMove = paper;
                        break;
                    case "3":
                    case "scissors":
                        userMove = scissors;
                        break;
                }
                System.out.println("\nComputer chose " + compChoice.getName() + " and you chose " + userMove.getName());
                switch(Move.compareMoves(compChoice, userMove)){
                    case 0:
                        computerWins++;
                        System.out.println("Computer wins the round!");
                        break;
                    case 1:
                        userWins++;
                        System.out.println("You won the round!");
                        break;
                    case 2:
                        System.out.println("It's a tie!");
                        break;
                }
                
                if(computerWins == roundsToWin){
                    System.out.println("Computer wins the game!\n");
                    choice = "0";
                    done = true;
                }
                
                else if(userWins == roundsToWin){
                    System.out.println("User wins the game!\n");
                    choice = "0";
                    done = true;
                }
            }    
        }
    } 
}
}