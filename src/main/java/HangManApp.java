
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
       }

       public static void hangmanImage() {
   if (count == 1) {
     System.out.println("Wrong guess, try again");
     System.out.println();
     System.out.println();
     System.out.println();
     System.out.println();
     System.out.println("___|___");
     System.out.println();
   }
   if (count == 2) {
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
   if (count == 3) {
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
   if (count == 4) {
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
   if (count == 5) {
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
   if (count == 6) {
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
   if (count == 7) {
     System.out.println("GAME OVER!");
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
     System.out.println("GAME OVER! The word was " + word);
   }
 }



  }
}
