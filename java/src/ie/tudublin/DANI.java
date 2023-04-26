package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet {


	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

	public void loadFile()
	{
		loadStrings("shakespere.txt"); // Load a text file into a String array
 		split(line, ' '); // Split a string into an array of words
 		w.replaceAll("[^\\w\\s]",""); // Remove punction characters
 		s.toLowerCase() // Convert a string to lower case 
	
	}

	
	public void findWord()
	{

	}

	public void printModel()
	{

	}

    String[] sonnet;

    public String[] writeSonnet()
    {
        return null;
    }

	public void setup() {
		colorMode(HSB);

       
	}

	public void keyPressed() {

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
