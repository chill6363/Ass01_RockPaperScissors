import java.util.Scanner;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String playerA = "";
        String playerB = "";
        boolean playAgain = true;
        boolean input1;
        boolean input2;
        String trash;

        do{
            input1 = false;
            input2 = false;
            System.out.println("Battle Start!");
            do{
                System.out.print("Input Player A's move (R, P, or S): ");
                if(in.hasNext("R") || in.hasNext("r") || in.hasNext("P") || in.hasNext("p") || in.hasNext("S") || in.hasNext("s")){
                    playerA = in.nextLine();
                    //in.nextLine();
                    input1 = true;
                }
                else{
                    trash = in.nextLine();
                    System.out.println("Invalid input of: " + trash);
                }
            } while(!input1);
            System.out.println("Here");
            do{
                System.out.print("Input Player B's move (R, P, or S): ");
                if(in.hasNext("R") || in.hasNext("r") || in.hasNext("P") || in.hasNext("p") || in.hasNext("S") || in.hasNext("s")){
                    playerB = in.nextLine();
                    //in.nextLine();
                    input2 = true;
                }
                else{
                    trash = in.nextLine();
                    System.out.println("Invalid input of: " + trash);
                }
            } while(!input2);

            if(playerA.equalsIgnoreCase("R")){
                if(playerB.equalsIgnoreCase("R")){
                    System.out.println("Player A chose Rock! Player B chose Rock! Begin!");
                    System.out.println("Both players chose Rock. Its a tie!");
                }
                else if(playerB.equalsIgnoreCase("P")){
                    System.out.println("Player A chose Rock! Player B chose Paper! Begin!");
                    System.out.println("Player B beats Player A with Paper!");
                }
                else if(playerB.equalsIgnoreCase("S")){
                    System.out.println("Player A chose Rock! Player B chose Scissors! Begin!");
                    System.out.println("Player A beats Player B with Rock!");
                }
            }
            else if(playerA.equalsIgnoreCase("P")){
                if(playerB.equalsIgnoreCase("R")){
                    System.out.println("Player A chose Paper! Player B chose Rock! Begin!");
                    System.out.println("Player A beats Player B with Paper!");
                }
                else if(playerB.equalsIgnoreCase("P")){
                    System.out.println("Player A chose Paper! Player B chose Paper! Begin!");
                    System.out.println("Both players chose Paper. Its a tie!");
                }
                else if(playerB.equalsIgnoreCase("S")){
                    System.out.println("Player A chose Paper! Player B chose Scissors! Begin!");
                    System.out.println("Player B beats Player A with Scissors!");
                }
            }
            else if(playerA.equalsIgnoreCase("S")){
                if(playerB.equalsIgnoreCase("R")){
                    System.out.println("Player A chose Scissors! Player B chose Rock! Begin!");
                    System.out.println("Player B beats Player A with Rock!");
                }
                else if(playerB.equalsIgnoreCase("P")){
                    System.out.println("Player A chose Scissors! Player B chose Paper! Begin!");
                    System.out.println("Player A beats Player B with Scissors!");
                }
                else if(playerB.equalsIgnoreCase("S")){
                    System.out.println("Player A chose Scissors! Player B chose Scissors! Begin!");
                    System.out.println("Both players chose Scissors. Its a tie!");
                }
            }
            System.out.println("Would you like to play again?");
            if(in.hasNext("y") || in.hasNext("Y")){
                playAgain = false;
            }
            else if(in.hasNext("n") || in.hasNext("N")){
                System.out.println("Thank you for playing!");
                playAgain = true;
            }
            else{
                System.out.println("I will take that as a 'no'");
            }
            in.nextLine();
        } while(!playAgain);
    }
}