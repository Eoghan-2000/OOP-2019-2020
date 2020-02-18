package ie.tudublin;

import processing.core.PApplet;

public class Project extends PApplet
{	
	public void settings()
	{
		size(300, 400);
	}

	public void setup() 
	{
		colorMode(HSB,130);
	}

	
	public void keyPressed()
	{

	}	


	public void draw()
	{
    fill(0,130,mouseX);
    stroke(0);
    ellipse(120,100,60,50);
    ellipse(150,100,50,50);
    quad(110,100,105,140,165,140,160,100);	
    ellipse(135,100,50,30);
    ellipse(135,100,40,20);
    ellipse(135,100,30,10);
    noStroke();
    triangle(138,215,150,148,175,205);	
    stroke(0);
    ellipse(120,170,70,100);
    noStroke();
    triangle(135,125,87,150,90,90);
    fill(0,130,mouseX);
    stroke(0);
    triangle(90,90,150,148,155,140);
    triangle(150,148,156,140,156,160);
    noStroke();
    fill(0,130,mouseX);
    quad(156,140,156,160,175,205,175,140);
    triangle(156,140,175,140,175,100);
    fill(0,130,mouseX);
    stroke(0);
    quad(150,135,156,140,175,100,175,90);
    line(175,100,175,205);
    line(175,205,138,215);
    line(87,150,90,90);
    fill(30,130,100);
    rect(120,245,20,150);
    triangle(120,245,85,200,140,245);
    triangle(120,245,180,198,140,245);
    triangle(120,245,115,190,140,245);
    triangle(120,245,135,195,140,245);
    triangle(120,245,100,198,140,245);
    triangle(120,245,165,198,140,245);
    triangle(120,245,155,198,140,245);
    

    
		int numCircles  = (int) (20 * (mouseX / (float) width)) ;
		
		float w = width / (float) numCircles;
		float radius = w / 2.0f;
		colorMode(HSB);
		float cGap = 255 / (float) (numCircles * numCircles);
		noStroke();

		for(int j = 0 ; j < numCircles ; j ++)
		{		
			for(int i = 0 ; i < numCircles ; i ++)
			{
				float x = radius + (i * w);
				float y = radius + (j * w);
				float c = (cGap * i * j + offset) % 255; 
				fill(c, 255, 255);
				ellipse(x, y, w, w);
			}
		}
		offset += mouseY / 250.0f;

    // fill(0,130,20);
    // stroke(0);
    // ellipse(120,100,60,50);
    // ellipse(150,100,50,50);
    // quad(110,100,105,140,165,140,160,100);	
    // ellipse(135,100,50,30);
    // ellipse(135,100,40,20);
    // ellipse(135,100,30,10);
    // noStroke();
    // triangle(138,215,150,148,175,205);	
    // stroke(0);
    // ellipse(120,170,70,100);
    // noStroke();
    // triangle(135,125,87,150,90,90);
    // fill(0,130,0);
    // stroke(0);
    // triangle(90,90,150,148,155,140);
    // triangle(150,148,156,140,156,160);
    // noStroke();
    // fill(0,130,20);
    // quad(156,140,156,160,175,205,175,140);
    // triangle(156,140,175,140,175,100);
    // fill(0,130,0);
    // stroke(0);
    // quad(150,135,156,140,175,100,175,90);
    // line(175,100,175,205);
    // line(175,205,138,215);
    // line(87,150,90,90);
    // fill(30,130,100);
    // rect(120,245,20,150);
    // triangle(120,245,85,200,140,245);
    // triangle(120,245,180,198,140,245);
    // triangle(120,245,115,190,140,245);
    // triangle(120,245,135,195,140,245);
    // triangle(120,245,100,198,140,245);
    // triangle(120,245,165,198,140,245);
    // triangle(120,245,155,198,140,245);
	}
}
