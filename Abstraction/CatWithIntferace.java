package Abstraction;

public class CatWithIntferace implements AnimalInterface
{

    @Override
    public void poop() {
        System.out.println("Litterbox");
    }

    @Override
    public void getName() {
        System.out.println("Name: " + name);
    }


}
