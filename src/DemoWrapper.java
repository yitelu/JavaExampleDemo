// int, float, double
//Integer (it's class)

/*
Primitive data type     Wrapper Class
char                    Character
byte                    Byte
short                   Short
int                     Integer
long                    Long
float                   Float
double                  Double
boolean                 Boolean

*/

public class DemoWrapper {

    public static void main(String[] args) {

        int i = 5; //primitive data type
        Integer ii = new Integer(i); // call Boxing or Wrapper class

        int j = ii.intValue(); //unboxing or unwrapping

        Integer value = i; //Auto Boxing or Auto wrapping

        int k = value; //auto-unboxing or auto-unwrapping


        //example of using Integer class
        String str = "123";
        int IntNum = Integer.parseInt(str);
        System.out.println(IntNum);


    }
}
