class Mobile
{
    String brand;
    int price;
    String network;
    static String name;

    public void show()
    {
        System.out.println(brand+" "+price+" ");
    }
    public static void show1()
    {
        System.out.println("In static method");
        System.out.println(brand+" "+price+" ");
    }
}
public class second 
{
    public static void main(String[] args)  
    {
        // String name = new String("Swetha");
        // name = name+" Nagarajan";
        // System.out.println(name);
        // System .out.println(name.charAt(2));

        // StringBuffer bf = new StringBuffer("Swetha");
        // System.out.println(bf.capacity());
        // System.out.println(bf.length());
        // bf.append("Nagarajan");
        // System.out.println(bf);

        // String sb = bf.toString();
        // System.out.println(sb);
        // bf.deleteCharAt(3);
        // System.out.println(bf);

        // bf.insert(3,"t" );
        // System.out.println(bf);

        // bf.setLength(20);
        // bf.ensureCapacity(100);

        // Mobile obj1 = new Mobile();
        // obj1.brand="Samsung";
        // obj1.price= 50000;
        // Mobile.name = "Galaxy M32";
        // obj1.network="JIO";

        // Mobile obj2 = new Mobile();
        // obj2.brand="VIVO";
        // obj2.price= 20000;
        // Mobile.name = "SmartPhone";
        // obj2.network="Airtel";

        // Mobile.name="Smart/Phone";

        // obj1.show();
        // obj2.show();
        // Class.forName("Mobile"); //Instantiate the class

        Mobile.show1();









        
    }
    
}
