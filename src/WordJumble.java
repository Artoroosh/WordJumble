/*
* Made by corbin nash
*/
import javax.swing.JOptionPane;
public class WordJumble {
  public static void main(String[] args) {
   //allow use to input a word
   String letters = JOptionPane.showInputDialog("Enter a word");    
    jumbleWords(letters, "");
  }
  //input parameters:
  //word - the remaining letters in the word still to jumble
  //jumbLet - the letters already used to create the jumbled word
  public static void jumbleWords(String word, String jumbLet){
    int pos;
    String remainingLetters;
    String origWord = word;
    String origJumbledLetters = jumbLet;
    if (word.length() == 1) {
        System.out.println(jumbLet + word); 
    } 
    else {
      for (pos = 0; pos < origWord.length(); pos++) {
          remainingLetters = origWord.substring(0, pos)
          + origWord.substring(pos + 1, origWord.length());
        //recursive call to jumbleWords()
          jumbleWords(remainingLetters,origJumbledLetters + origWord.charAt(pos));
      }
    }
  }
}