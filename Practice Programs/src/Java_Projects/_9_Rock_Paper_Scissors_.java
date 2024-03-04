package Java_Projects;

import java.util.*;

public class _9_Rock_Paper_Scissors_ {
    public static void main(String[] args) {
        while (true) {
            byte match;
            int temp, temp2, you_win = 0, comp_win = 0, i = 0;
            String comp, you = null;

            System.out.println("----------------------------------------------------");
            System.out.println("\t\t</ Rock / Paper / Scissor />");
            System.out.println("----------------------------------------------------");
            System.out.println("\n</-----------------<\\ Game Rules \\>-----------------/>\n");
            System.out.println("\t1. Rock vs Paper => Paper Wins");
            System.out.println("\t2. Scissors vs Paper => Scissors Wins");
            System.out.println("\t3. Scissors vs Rock  => Rock Wins");
            System.out.println("\n</----------------------------------------------------/>");
            System.out.println("\n\t=> Enter how many matches you want to play ");
            System.out.println("\t>> Press '1' for Single");
            System.out.println("\t>> Press '3' for Best of 3");
            System.out.println("\t>> Press '5' for Best of 5");
            System.out.print("\tEnter your choice : ");
            Scanner sc = new Scanner(System.in);
            match = sc.nextByte();

            if (match > 5) {
                match = 0;
            }
            // ______________________________________________________________________________________________________________________

            if (match == 1) {

                Random r = new Random();
                temp = r.nextInt(100);
                if (temp <= 33) {
                    comp = "Rock";
                } else if (temp <= 66) {
                    comp = "Paper";
                } else {
                    comp = "Scissors";
                }

                System.out.println("\n</----------------------------------------------------/>");
                System.out.println("\t                  Single Round");
                System.out.println("</----------------------------------------------------/>");
                System.out.println("\n\t* Enter '1' to choose 'Rock'");
                System.out.println("\n\t* Enter '2' to choose 'Paper'");
                System.out.println("\n\t* Enter '3' to choose 'Scissors'");
                System.out.print("\n\t-> Enter your choice : ");
                Scanner scan = new Scanner(System.in);
                temp2 = scan.nextInt();
                System.out.println("\n</----------------------------------------------------/>");

                if (temp2 == 1) {
                    you = "Rock";
                } else if (temp2 == 2) {
                    you = "Paper";
                } else if (temp2 == 3) {
                    you = "Scissors";
                }

                if (you == null) {
                    System.out.println("\tChoose only the mentioned option");
                } else if (you.equals(comp)) {
                    System.out.println("\tTie! |-[");
                } else if (you == "Rock" && comp == "Paper") {
                    System.out.println("\tYou Loose! Computer Wins }:-]");
                } else if (you == "Paper" && comp == "Scissors") {
                    System.out.println("\tYou Loose!... Computer Wins }:-]");
                } else if (you == "Scissors" && comp == "Rock") {
                    System.out.println("\tYou Loose!... Computer Wins }:-]");
                } else {
                    System.out.println("\tYou Win! };-}");
                }
                System.out.println("</----------------------------------------------------/>");
            }

            // ______________________________________________________________________________________________________________________

            else if (match == 3 || match == 5) {

                while (match-- > 0) {
                    i++;
                    Random rand = new Random();
                    temp = rand.nextInt(100);
                    if (temp <= 33) {
                        comp = "Rock";
                    } else if (temp <= 66) {
                        comp = "Paper";
                    } else {
                        comp = "Scissors";
                    }

                    System.out.println("\n</----------------------------------------------------/>");
                    System.out.println("\t                    Round " + i);
                    System.out.println("</----------------------------------------------------/>");

                    System.out.println("\n\t* Enter '1' to choose 'Rock'");
                    System.out.println("\n\t* Enter '2' to choose 'Paper'");
                    System.out.println("\n\t* Enter '3' to choose 'Scissors'");
                    System.out.print("\n\t-> Enter your choice : ");
                    Scanner scan = new Scanner(System.in);
                    temp2 = scan.nextInt();

                    if (temp2 == 1) {
                        you = "Rock";
                    } else if (temp2 == 2) {
                        you = "Paper";
                    } else if (temp2 == 3) {
                        you = "Scissors";
                    }

                    System.out.print("\n Round " + i + " result : ");

                    if (you == null) {
                        System.out.print("Choose only the mentioned option");
                    } else if (you == comp) {
                        System.out.print("Tie! |-[");
                    } else if (you == "Rock" && comp == "Paper") {
                        System.out.print("You Loose! Computer Wins }:-]");
                        comp_win++;
                    } else if (you == "Paper" && comp == "Scissors") {
                        System.out.print("You Loose!... Computer Wins }:-]");
                        comp_win++;
                    } else if (you == "Scissors" && comp == "Rock") {
                        System.out.print("You Loose!... Computer Wins }:-]");
                        comp_win++;
                    } else {
                        System.out.print("You Win! };-}");
                        you_win++;
                    }
                }

                if (comp_win > you_win) {
                    System.out.println("\n</----------------------------------------------------/>");
                    System.out.println("\n\t\t\tWinner of Best of " + i + " is 'Computer' |:-] ");
                    System.out.println("\n</----------------------------------------------------/>");
                } else {
                    System.out.println("\n</----------------------------------------------------/>");
                    System.out.println("\n\t\t\tWinner of Best of " + i + " is 'YOU' };-} ");
                    System.out.println("\n</----------------------------------------------------/>");
                }
            }
            // ______________________________________________________________________________________________________________________
            else {
                System.out.println("\n</----------------------------------------------------/>");
                System.out.println("\t\t\tChoose only the mentioned option");
                System.out.println("</----------------------------------------------------/>");
            }

            System.out.println("Want to play again (Y/n)");
            String str = sc.nextLine();
            str = sc.nextLine();
            if (str.equalsIgnoreCase("n")) {
                System.out.println("Thanks For Playing }:-)");
                break;
            }
        }
    }
}
