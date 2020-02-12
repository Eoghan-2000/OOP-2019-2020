package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet
{	
	public void settings()
	{
		size(1000, 1000);
	}

	public void setup() 
	{
		
	}

	
	public void keyPressed()
	{

	}	


	public void draw()
	{	
		// background(255);
		
		// int i =0; 
		// while(i<10)
		// {
		// 	i++;
		// }
		// stroke(0);
		// for(int x=0;x<1000;x += 10)
		// {
		// 	line(x,0,500,500);
		// }
		// for(int y=0;y<1000;y += 10)
		// {
		// 	line(1000,y,500,500);
		// }
		// for(int x2=1000;x2>0;x2 -= 10)
		// {
		// 	line(x2,1000,500,500);
		// }
		// for(int y2=1000;y2>0;y2 -= 10)
		// {
		// 	line(0,y2,500,500);
		// }
			int y;
			int x;
			int h=40;
		for(x=20;x<1000;x+=40)
		{
			for(y=20;y<1000;y+=40)
			{
				ellipse(x,y,h,h);
			}
		}
	}
}
