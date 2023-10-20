package Guessergame;
import java.util.Scanner;

class Guesser {
  int guessNum;

  public int guessingNumber() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Guesser!kindly guess the num: ");
    guessNum = sc.nextInt();
    return guessNum;
  }
}

class Player {
  int guessNum;

  int guessingNumber() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Player!kindly guess the num: ");
    guessNum = sc.nextInt();
    return guessNum;
  }

}

class Umpire {
  int numfromGuesser;
  int numfromPlayer1;
  int numfromPlayer2;
  int numfromPlayer3;

  public void collectnumfromGuesser() {
    Guesser g = new Guesser();
    numfromGuesser = g.guessingNumber();
  }

  public void collectnumfromPlayers() {
    Player p1 = new Player();
    Player p2 = new Player();
    Player p3 = new Player();
    numfromPlayer1 = p1.guessingNumber();
    numfromPlayer2 = p2.guessingNumber();
    numfromPlayer3 = p3.guessingNumber();
  }

  void compare() {
    if (numfromGuesser == numfromPlayer1) {
      System.out.println("Player 1 won the game");
    }
    else if (numfromGuesser == numfromPlayer2) {
      System.out.println("Player 2 won the game");
    }
    else if (numfromGuesser == numfromPlayer3) {
      System.out.println("Player 3 won the game");
    }
    else {
      System.out.println("no one won the game");
    }
  }
}

public class Launchgame {
  public static void main(String[] args) {
    Umpire u = new Umpire();
    u.collectnumfromGuesser();
    u.collectnumfromPlayers();
    u.compare();
    
  }
}