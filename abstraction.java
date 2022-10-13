package OOPS;

abstract class Animal
{
    public abstract void eats();

}

class Cat extends Animal
{
    public void eats()
    {
        System.out.println("Cat eats fish");
    }
}

class abstraction{
    public static void main(String[] args) {
        Cat c = new Cat();

        c.eats();
    }
}