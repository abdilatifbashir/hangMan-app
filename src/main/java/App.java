
import java.io.Console;

public class App{
//private int counter=0;

static Console myConsole=System.console();
//static String userWord=hangman.getUserWord();
static String userWord;
  public static void main(String[] args){
    Hangman hangman = new Hangman();
    String userWord=hangman.getUserWord();
    int counter=hangman.GetfalseGueses();
    String asteric=hangman.getAsterisk();
    //String userCore





       while (counter<7 && !userWord.equals(asteric)){

         System.out.println("enter your guessLetter?");

         String guessedLetter= myConsole.readLine();


         String[] guesse=hangman.getGuesses();
         //counter=hangman.GetCounter
         boolean hangOver= hangman.getHang();
          hangman.gamer(guessedLetter);
          if(hangOver){
            hangSketch(counter);

          }

       }
       if(userWord.equals(hangman.rightGuesses)){
         System.out.println("cheers,you won the game");
       }
     }
    // int counter=hangman.GetCounter();

public static void hangSketch(int counter) {

   if (counter== 1) {
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
     System.out.println("GAME OVER right guess was:" + userWord);
   }
 }



  }
