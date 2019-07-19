
/*
* static variable could use both the object name or the class name:
* static method doesn't need to create object to call it, like main method PSVM.
*
* the constructor would be call every time you create an object
* static block would only call once when you load a class
*
* static variables are same for all the objects
* Non-static variables are different for all the objects
* Cannot use none-static variable in static block
*
*
 */


class Emp
{
    int eid;
    int salary;
    static String ceo; //if it's static variable and the value of that variable would be same for all object.
    static String founder;

    //static block would only call once when you load a class
    static {
        ceo = "Larry";

        System.out.println("in Static block");
    }

    public Emp() //the constructor would be call every time you create an object
    {
        //initial default value
        eid = 1;
        salary = 3000;
        ceo = "Larry";

        System.out.println("in default constructor");
    }


    public void show(){
        System.out.println(eid +" : "+ salary + " : " + ceo + " : " + founder);
    }

}


public class DemoStatic {

    //here is a example of "Cannot use non-static variable in static block
    //if the variable a is not static and it can't be access in static main method...
    static int a;

    public static void main(String[] args)
    {
        a= 10;

        Emp navin = new Emp();
        navin.eid = 8;
        navin.salary = 4000;

        //static variable could use both the object name or the class name:
        navin.ceo = "Mahesh"; //object name for static variable
        Emp.founder = "Richard"; //class name for static variable


        Emp rahul = new Emp();
        rahul.eid = 9;
        rahul.salary = 5000;
        rahul.ceo = "John";

        //since Emp class's static variable CEO is change and it would be same, which is "John" for all object.

        navin.show();
        rahul.show();
    }

}
