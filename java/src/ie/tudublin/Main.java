package ie.tudublin;

public class Main
{

    public void helloProcessing()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new HelloProcessing());
	}
    public static void main(String[] arg)
    {
        System.out.println("Hello world!");

        Animal misty = new Dog(); // Polymorphism
        misty.setName("Misty");
        System.out.println(misty.getName());  
        misty.speak();  
        Cat topcat = new Cat();
        topcat.speak();
<<<<<<< HEAD
        int i;

        for(i=topcat.getNumLives();i>-1;i--)
        {
            topcat.kill();
        }

=======

        Main main = new Main();
		main.helloProcessing();
        
>>>>>>> ac14bafdf3526db59073db63023180ff9ca4d9f0
    }
}