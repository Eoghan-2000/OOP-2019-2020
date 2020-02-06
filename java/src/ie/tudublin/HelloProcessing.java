package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{	
	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
	}

	public void draw()
	{
		background(55,0,0);//rgb value for background colour
		noStroke();//no outline of shapes
		stroke(0,0,255);//outline of shapes
		line(10,10,100,100);//x1,y1,x2,y2
		point(50,50);//x,y, a dot 
		fill(2444,6,54);// filling the colour of all shapes after this call
		ellipse(100, 200, 100, 50);//cx,cy, w, h circle 
		rect(70, 150, 90, 10);//tlx,tly,w,h rectangle
		triangle(150, 90, 200, 100, 100, 250);//x,y x,y x,y co-ordinates for each vertices 
	}
	/*
	public void draw() {
		background(0, 0, 255);
		stroke(255, 0, 0);
		fill(255, 255, 0);
		line(10, 10, 100, 100);		// x1, y1, x2, y2
		point(50, 50); // x, y
		ellipse(100, 200, 50, 150); // cx, cy, w, h
		fill(0, 255, 0);
		rect(50, 10, 100, 200); // tlx, tly, w, h
		triangle(10, 10, 100, 90, 200, 200); // vertices	
	}	
	*/

	int x = 0; // 4 bytes
	
	/*public void draw()
	{	
		
		background(0);
		noStroke();
		fill(255);
		ellipse(x, mouseY, 50, 50);		
		x ++;
	}*/
}
