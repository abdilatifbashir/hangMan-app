
import java.io.Console;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Hangman{
  Random randomNum=new Random();
  private static String[] guesses={"computer","program","moringa"}
  private static String userWord=guesses[randomNum.nextInt(guesses.length)];
  private String asterisk=new String(new char[userWord.length()]).replace("\0","*");
  private int counter=0;

  public String[] getGuesses(){
    return guesses;
  }

  public String geUserWord(){
    return userWord;
  }
  public String getAsterisk(){
    return asterisk;
  }
  public int GetCounter(){
    return counter;
  }

}
