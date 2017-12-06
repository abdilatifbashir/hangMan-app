
import java.io.Console;

public class HangManApp{


  public static void main(String[] args){
      HangMan hangman = new HangMan();

       while (counter<7 && !userWord.equals(rightGuesses)){
         System.out.println("enter your guessLetter?");
         String guessedLetter= myConsole.readLine();

        String userWord=hangman.getUserWord();
         String[] guesse=hangman.getGuesses();
         int counter=hangman.GetCounter();
         boolean hangOver= hangman.getHang();
          hangman.gamer(guessedLetter);
          if(hangOver){
            hangSketch()

          }

       }
       if(userWord.equals(rightGuesses)){
         System.out.println("cheers,you won the game");
       }
     }
     int counter=hangman.GetCounter();

public static void hangSketch() {
   if (counter == 1) {
     System.out.println("Wrong guess, try again");
     System.out.println();
     System.out.println();
     System.out.println();
     System.out.println();
     System.out.println("___|___");
     System.out.println();
   }
   if (counter == 2) {
     System.out.println("Wrong guess, try again");
     System.out.println("   |");
     System.out.println("   |");
     System.out.println("   |");
     System.out.println("   |");
     System.out.println("   |");
     System.out.println("   |");
     System.out.println("   |");
     System.out.println("___|___");
   }
   if (counter == 3) {
     System.out.println("Wrong guess, try again");
     System.out.println("   ____________");
     System.out.println("   |");
     System.out.println("   |");
     System.out.println("   |");
     System.out.println("   |");
     System.out.println("   |");
     System.out.println("   |");
     System.out.println("   | ");
     System.out.println("___|___");
   }
   if (counter == 4) {
     System.out.println("Wrong guess, try again");
     System.out.println("   ____________");
     System.out.println("   |          _|_");
     System.out.println("   |         /   \\");
     System.out.println("   |        |     |");
     System.out.println("   |         \\_ _/");
     System.out.println("   |");
     System.out.println("   |");
     System.out.println("   |");
     System.out.println("___|___");
   }
   if (counter == 5) {
     System.out.println("Wrong guess, try again");
     System.out.println("   ____________");
     System.out.println("   |          _|_");
     System.out.println("   |         /   \\");
     System.out.println("   |        |     |");
     System.out.println("   |         \\_ _/");
     System.out.println("   |           |");
     System.out.println("   |           |");
     System.out.println("   |");
     System.out.println("___|___");
   }
   if (counter == 6) {
     System.out.println("Wrong guess, try again");
     System.out.println("   ____________");
     System.out.println("   |          _|_");
     System.out.println("   |         /   \\");
     System.out.println("   |        |     |");
     System.out.println("   |         \\_ _/");
           System.out.println("   |          _|_");
           System.out.println("   |         / | \\");
     System.out.println("   |           |");
   }
   if (counter == 7) {
     System.out.println("GAME OVER");
     System.out.println("   ____________");
     System.out.println("   |          _|_");
     System.out.println("   |         /   \\");
     System.out.println("   |        |     |");
     System.out.println("   |         \\_ _/");
           System.out.println("   |          _|_");
           System.out.println("   |         / | \\");
           System.out.println("   |           |");
     System.out.println("   |          / \\ ");
     System.out.println("___|___      /   \\");
     System.out.println("GAME OVER right guess was:" + word);
   }
 }



  }
}
