package ie.tudublin;

public class Follow {

    private String word;
    private int count;

    public String getWord() {
        return this.word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getCount() {
        return this.count;
    }

    public void setCount(int count) {
        this.count = count;
    }   

    public void incrementCount() {
        this.count++;
    }

    public Follow(String word) {
        this.word = word;
        this.count = 1;
    }


    public String toString() {
        return word + "(" + count + ")";
    }    
    
}
