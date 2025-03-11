package Abstraction;

public class Test {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.makeSound();
        myCat.getName();

        CatWithIntferace myCat2 = new CatWithIntferace();
        myCat2.poop();
        myCat2.getName();

    }
}
