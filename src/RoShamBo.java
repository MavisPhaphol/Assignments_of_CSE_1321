//Class: CSE 1321L
//Section: J52
//Term: Spring 2023
//Instructor: Chandana Avadhani
//Name: Mavis Phaphol
//Assignment#: 7A
import java.util.Scanner;
import java.util.Random;
class RoshamboPlayer{
    String PlayerName;
    int RoLimit;
    int ShamBoLimit;
    RoshamboPlayer(String pn, int rl, int sbl){
        PlayerName=pn;
        RoLimit=rl;
        ShamBoLimit=sbl;
    }
    public String getPlayerName() {
        return PlayerName;
    }

    public void setPlayerName(String playerName) {
        PlayerName = playerName;
    }

    public static boolean playRound(String userAttack, String opponentAttack){
        boolean isWinner=false;
        if (userAttack.equals("Ro")){
            if (opponentAttack.equals("Sham")){
                isWinner=true;
            }
        }
        if (userAttack.equals("Sham")){
            if (opponentAttack.equals("Bo")){
                isWinner=true;
            }
        }
        if (userAttack.equals("Bo")){
            if (opponentAttack.equals("Ro")){
                isWinner=true;
            }
        }
        return isWinner;
    }
}
public class Assignment7A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        RoshamboPlayer p1 = new RoshamboPlayer("R. Dorothy", 30, 60);
        RoshamboPlayer p2 = new RoshamboPlayer("Johnny 5", 40, 85);
        int userChoice = 0;
        System.out.println("[Ro-Sham-Bo Player]");
        System.out.println("Who do you want to face?\n1) R. Dorothy\n2) Johnny 5");
        System.out.print("Opponent: ");
        int opponent = sc.nextInt();
        if (opponent == 1) {
            System.out.println("Your opponent is " + p1.PlayerName);
            do {
                System.out.println("1) Play a round?\n2) Quit? ");
                System.out.print("Choice: ");
                userChoice = sc.nextInt();
                if (userChoice == 1) {
                    String opponentAttacks = "";
                    String userAttack = "";
                    int ranNum = random.nextInt(100);
                    do {
                        RoshamboPlayer.playRound(userAttack, opponentAttacks);
                        System.out.print("Enter an attack: ");
                        userAttack = sc.next();
                        if (userAttack.equals("Ro") || userAttack.equals("Sham") || userAttack.equals("Bo")) {
                            if (ranNum < p1.RoLimit) {
                                opponentAttacks = "Ro";
                            } else if (ranNum > p1.RoLimit && ranNum < p1.ShamBoLimit) {
                                opponentAttacks = "Sham";
                            } else {
                                opponentAttacks = "Bo";
                            }
                        } else {
                            System.out.println("Invalid attack!");
                        }
                        if (RoshamboPlayer.playRound(userAttack, opponentAttacks)) {
                            System.out.println(p1.PlayerName + " chose " + opponentAttacks + "! You win!");
                            break;
                        } else {
                            System.out.println(p1.PlayerName + " chose " + opponentAttacks + "! You lose!");
                            break;
                        }
                    } while (!userAttack.equals("Ro") || !userAttack.equals("Sham") || !userAttack.equals("Bo"));
                }
            } while (userChoice != 2);
            System.out.println("Game Over");
        } else if (opponent == 2) {
            System.out.println("Your opponent is " + p2.PlayerName);
            do {
                System.out.println("1) Play a round?\n2) Quit? ");
                System.out.print("Choice: ");
                userChoice = sc.nextInt();
                if (userChoice == 1) {
                    String opponentAttacks = "";
                    String userAttack = "";
                    int ranNum = random.nextInt(100);
                    do {
                        RoshamboPlayer.playRound(userAttack, opponentAttacks);
                        System.out.print("Enter an attack: ");
                        userAttack = sc.next();
                        if (userAttack.equals("Ro") || userAttack.equals("Sham") || userAttack.equals("Bo")) {
                            if (ranNum < p2.RoLimit) {
                                opponentAttacks = "Ro";
                            } else if (ranNum > p2.RoLimit && ranNum < p2.ShamBoLimit) {
                                opponentAttacks = "Sham";
                            } else {
                                opponentAttacks = "Bo";
                            }
                        } else {
                            System.out.println("Invalid attack!");
                        }
                        if (RoshamboPlayer.playRound(userAttack, opponentAttacks)) {
                            System.out.println(p2.PlayerName + " chose " + opponentAttacks + "! You win!");
                            break;
                        } else {
                            System.out.println(p2.PlayerName + " chose " + opponentAttacks + "! You lose!");
                            break;
                        }
                    } while (!userAttack.equals("Ro") || !userAttack.equals("Sham") || !userAttack.equals("Bo"));
                }
            } while (userChoice != 2);
            System.out.println("Game Over");
        }
    }
}
