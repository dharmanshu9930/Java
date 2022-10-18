class fahrenheittocelsius {
   
    public static void main(String[] args)
    {
        // temperature in fahrenheit
        double fahrenheit = 50.0, celsius = 0.0;
 
        // calculate celsius temperature
        celsius = (fahrenheit - 32) / 1.8;
 
        // print the celsius temperature
        System.out.println(
            "value of temperature in celsius:" + celsius);
    }
}
