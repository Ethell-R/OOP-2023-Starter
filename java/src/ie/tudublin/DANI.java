package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet {

	ArrayList<Word> model = new ArrayList<Word>();

	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

	public void setup() {
		colorMode(HSB);
		loadFile("shakespere.txt");
		printModel();       
	}

	public void loadFile(String filename)
	{
		String[] lines = loadStrings("shakespere.txt"); // Load a text file into a String array
 		for (String line : lines) {
			String[] words = split(line, ' '); // Split a string into an array of words
 			for (int i = 0; i < words.length; i++)
			{
				String w = words[i].replaceAll("[^\\w\\s]","").toLowerCase(); // Remove punction characters; to lower case
				if (w.length() == 0) {
					continue;
				}
				Word word = findWord(w);
				if (word == null) {
					word = new Word(w);
					model.add(word);
				}				
				if (i < words.length - 1) {
                    String nextW = words[i + 1].replaceAll("[^\\w\\s]", "").toLowerCase();
                    if (nextW.length() == 0) {
                        continue;
                    }
                    word.addFollow(nextW);
				}
			}
		}		
	}	
	
	public Word findWord(String str) {
        for (Word word : model) {
            if (word.getWord().equals(str)) {
                return word;
            }
        }
        return null;
    }
	public void printModel() {
        for (Word word : model) {
            System.out.print(word.getWord() + ": ");
            for (Follow follow : word.getFollow()) {
                System.out.print(follow.getWord() + "(" + follow.getCount() + ") ");
            }
            System.out.println();
        }
    }

    public String[] writeSonnet() {
        String[] sonnet = new String[14];
        for (int i = 0; i < sonnet.length; i++) {
            String line = "";
            Word currentWord = model.get((int) random(model.size()));
            line += currentWord.getWord();
            for (int j = 0; j < 7; j++) {
                ArrayList<Follow> follows = currentWord.getFollow();
                if (follows.size() == 0) {
                    break;
                }
                Follow follow = follows.get((int) random(follows.size()));
                line += " " + follow.getWord();
                currentWord = findWord(follow.getWord());
            }
            sonnet[i] = line;
        }
        return sonnet;
    }

    String[] sonnet;

  
	public void keyPressed() {
		if (key == ' ') {
			sonnet = writeSonnet();
			for (int i = 0; i < sonnet.length; i++)
			{
				System.out.println(sonnet[i]);
			}
		}
	}

	float off = 0;

	public void draw() 
    {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);
        
	}
}
