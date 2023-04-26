package ie.tudublin;

import java.util.ArrayList;

public class Word {

    private String word;
    private ArrayList<Follow> follows;

    public String getWord() {
        return this.word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public ArrayList<Follow> getFollow() {
        return this.follows;
    }

    public void setFollow(ArrayList<Follow> follows) {
        this.follows = follows;
    }

    public Word(String word) {
        this.word = word;
        this.follows = new ArrayList<Follow>();
    }

    public String toString() {
        String str = word + ": ";
        for (Follow follow : follows) {
            str += follow.toString() + " ";
        }
        return str;
    }


    public void addFollow(String word) {
        for (Follow follows : follows) {
            if (follows.getWord().equals(word)) {
                follows.incrementCount();
                return;
            }
        }
        follows.add(new Follow(word));        
    }         
    
}

