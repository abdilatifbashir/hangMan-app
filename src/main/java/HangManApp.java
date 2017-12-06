
import java.io.Console;

public class HangManApp{


  public static void main(String[] args){
      HangMan hangman = new HangMan();
      String[] guesse=hangman.getGuesses();
      String userWord=hangman.getUserWord();
      int counter=hangman.GetCounter();
       while (counter<7 && !userWord.equals(rightGuesses)){
         System.out.println("enter your guessLetter?");
         String guessedLetter= myConsole.readLine();
       }



  }
}
