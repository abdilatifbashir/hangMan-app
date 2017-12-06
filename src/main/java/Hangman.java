
import java.io.Console;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Hangman{
  Random randomNum=new Random();
  private List<String> alphabet=new ArrayList<String>();
  private static String[] guesses={"computer","program","moringa"}
  private static String userWord=guesses[randomNum.nextInt(guesses.length)];
  private String asterisk=new String(new char[userWord.length()]).replace("\0","*");
  private int counter=0;
  private int falseGuesses;

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
public void gamer(String trial){
  if(userWord.indexOf(trial.charAt(0)==-1)){
    falseGuesses+=1;
  }
  else{
    alphabet.add(trial);
  }
  Sring rightGuesses="";
  for(i=0;i<userWord.length(); i++){
    if(userWord.charAt(i)==trial.charAt(0)){
      rightGuesses+=trial.charAt(0);
    }
    elseif(asterisk.charAt(i)!='*'){
      rightGuesses+=charAt(i);
    }
    else{
      rightGuesses+="*"
    }
  }
if(asterisk.equals(rightGuesses)){
  counter++;
}
if(asterisk.equals(userWord)){
  System.out.println("cheers you won the game",userWord);
}
}

}
