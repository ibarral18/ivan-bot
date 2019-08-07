import java.io.*;
import java.util.*;
class sentenceGen {
  String noun;
  String adjective;
  public sentenceGen (){
    noun = "nouns.txt";
    adjective = "adjectives.txt";
  }

  public String getRandomWord(String wordType){
        ArrayList<String> wordStorage =  new ArrayList<>();
        try{
            File fileReader = new File(wordType);
            Scanner s = new Scanner(fileReader);
            for(int y = 0; s.hasNextLine(); y++){
                String word = s.nextLine();
                wordStorage.add(word);
              }
            }
        }

        catch(Exception e){
            System.out.println("File not found ! ");
        }
            Random r = new Random();
            int randomNumber = r.nextInt(wordStorage.size());
            return wordStorage.get(randomNumber);
    }

    public void getSentence(){
      System.out.println(getRandomWord(noun) + " is so " + getRandomWord(adjective));
    }

}
