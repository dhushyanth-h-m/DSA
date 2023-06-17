
import java.util.ArrayList;

class AreaCode{ 
    static int dallas = 214; //attribute

    public static void getAreaCode(){ //method
        System.out.println("AreaCode for dallas: "+dallas);
    }
}

interface Temperature{ 
    public abstract void cityTemperature(); //abstract method
}

public class DataTypes extends AreaCode implements Temperature{ //main class
    public static void main(String[] args){
        //primitve data types
        System.out.println("\nPrimitive Data types section.");
        byte a = 23;
        short b = 54;
        int c = 12;
        long d = 456;
        float e = 43.4f;
        double f = 43.45d;
        char g = 'a';
        boolean h = true;

        System.out.println("\"Byte\" data type: "+a);
        System.out.println("\"Short\" data type: "+b);
        System.out.println("\"int\" data type: "+c);
        System.out.println("\"long\" data type: "+d);
        System.out.println("\"float\" data type: "+e);
        System.out.println("\"double\" data type: "+f);
        System.out.println("\"char\" data type: "+g);
        System.out.println("\"boolean\" data type: "+h);


        //Non-primitive data types
        String city = new String("Arlington");
        ArrayList<String> array = new ArrayList<String>();

        array.add("Texas");
        array.add("Florida");
        array.add("Iowa");
        array.add("California");
        
        System.out.println("\nNon-primitive Data types section.");
        System.out.println("City Name: "+city);
        
        
        System.out.println(array);
        
        AreaCode object = new AreaCode();
        object.getAreaCode();
        
        DataTypes object2 = new DataTypes();
        object2.cityTemperature();
        
        //Wrapper classes
        System.out.println("\nWrapper Class section.");
        Integer number = 51; //object number of type Integer will store value 51 as int
        System.out.println(number);
        
        String stringObject = number.toString(); //converting an integer to a string wrapper class object
        System.out.println(stringObject.length());

        Float floatObject = Float.valueOf("234.25"); //Use of static valueOf method to create an object
        System.out.println(floatObject);


    }
    public void cityTemperature(){
            System.out.println("Current Temperature: "+90+" degrees");
        }

}