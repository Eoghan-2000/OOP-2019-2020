package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet
{	
	public void settings()
	{
		size(400, 400);
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
		// background(255);
		
		// int i =0; 
		// while(i<10)
		// {
		// 	i++;
		// }
		// stroke(0);
		// for(int x=0;x<440;x += 10)
		// {
		// 	line(x,0,220,220);
		// }
		// for(int y=0;y<440;y += 10)
		// {
		// 	line(440,y,220,220);
		// }
		// for(int x2=440;x2>0;x2 -= 10)
		// {
		// 	line(x2,440,220,220);
		// }
		// for(int y2=440;y2>0;y2 -= 10)
		// {
		// 	line(0,y2,220,220);
		// }



		noStroke();
			int y;
			int x;
			int w=40;
			float h=0;
		for(x=20;x<400;x+=40)
		{
			
			for(y=20;y<400;y+=40)
			{
				// if(h==100)
				// {
				// 	h=0;
				// }
				fill(h,130,130);
				ellipse(x,y,w,w);
				h+=5;
			}
			h-=45;
		}
		// int m=0;
		// for(x=0;x<440;x+=40)
		// {
		// 	for(y=0;y<440;y+=40)
		// 	{
		// 		if(m==0)
		// 		{
		// 			fill(0,0,153);
		// 			rect(x, y, h, h);
		// 			m=1;
		// 		}
		// 		else if(m==1)
		// 		{
		// 			fill(0,102,204);
		// 			rect(x, y, h, h);
		// 			m=0;
		// 		}
		// 	}
		// }
		
	}
}
