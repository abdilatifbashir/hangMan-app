
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Hangman{
  Random randomNum=new Random();
  private List<String> alphabet=new ArrayList<String>();
  private static String[] guesses={"computer","program","moringa"};
  private String userWord=guesses[randomNum.nextInt(guesses.length)];
  private String asterisk=new String(new char[userWord.length()]).replace("\0","*");
  private int counter=0;
  private boolean hangOver = false;
  private int falseGuesses;
  public String rightGuesses="";

  public String[] getGuesses(){
    return guesses;
  }

  public String getUserWord(){
    return userWord;
  }
  public String getAsterisk(){
    return asterisk;
  }
  public boolean getHang() {
    return hangOver;
  }

  public int GetfalseGueses(){
    return falseGuesses;
  }
public void gamer(String trial){
  if(userWord.indexOf(trial.charAt(0))==-1){
    falseGuesses+=1;
  }
  else{
    alphabet.add(trial);
  }

  for(int i=0;i<userWord.length(); i++){
    if(userWord.charAt(i)==trial.charAt(0)){
      rightGuesses+=trial.charAt(0);
    }
    else if(asterisk.charAt(i)!='*'){
      rightGuesses+=trial.charAt(i);
    }
    else{
      rightGuesses+="*";
    }
  }

}

}
