package ie.tudublin;

public class Follow {

    private String word;
    private int count;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }   

    public void incrementCount() {
        this.count++;
    }

    public Follow(String word, int count) {
        this.word = word;
        this.count = 1;
    }

    @Override
    public String toString() {
        return "Follow [word=" + word + ", count=" + count + "]";
    }

    
    
}
