import java.util.SimpleTimeZone;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // creation of Double objects via valuesOf();
        Double doubleVar1 = Double.valueOf(17);
        Double doubleVar2 = Double.valueOf(100);
        Double doubleVar3 = Double.valueOf(200);

        //String to double via Double.parseDouble()
        String stringVar = "44";
        double doubleVar = Double.parseDouble(stringVar);

        //Double to all value types
        byte byteVar = doubleVar1.byteValue();
        short shortVar = doubleVar1.shortValue();
        int intVar = doubleVar1.intValue();
        long longVar = doubleVar1.longValue();
        float floatVar = doubleVar1.floatValue();
        String strValue = doubleVar1.toString();
        char charValue = (char)doubleVar2.intValue();
        boolean boolVar = (doubleVar1 != 0);

        //print Double var to console
        System.out.println(doubleVar3);

        //double to String
        double doubleVar4 = 88;
        String d = Double.toString(doubleVar4);
    }
}