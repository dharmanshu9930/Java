class car
{
    int tire;
    String name;
    String color;
    void naming(String name)
    {
        System.out.println("Name:"+name);
    }
}
//Inherit property of car class
class sports extends car
{
    void tire(int tire)
    {
        System.out.println("tire is:" +tire);
    }
}
//inherit property of sports class
class Luxury extends sports
{
    void colur(String black)
    {
        System.out.println("colur:"+black);
    }
}
class showroom
{
    public static void main(String arg[])
    {
        Luxury L = new Luxury();
        L.naming("Audi");
        L.tire(4);
        L.colur("black");
    }
}