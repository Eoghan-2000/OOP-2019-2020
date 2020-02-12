package ie.tudublin;

public class Cat extends Animal
{
    private int numLives;

    public Cat(String name)
    {
        // Constructor chaining to the superclass
        super(name);
        setNumLives(9);        
    }

<<<<<<< HEAD
    public int getNumLives()
    {
=======
    // Accessor method for reading the private field
    public int getNumLives() {
>>>>>>> 8f0bb789dfdaf47f8a4e396dbaa9d71e7a1127d7
        return numLives;
    }

    // Accessor method for writing to the private field
    public void setNumLives(int numLives) {
        this.numLives = numLives;
    }

    // Virtual function
    // Dynamic function binding
    public void speak()
    {
        System.out.println("Meow!");
    }

    
    public void kill()
    {
        if (this.numLives>0)
        {
            this.numLives--;
            System.out.println("Ouch!");
        }
        else if (this.numLives==0)
        {
            System.out.println("Dead");
        }
    }
}