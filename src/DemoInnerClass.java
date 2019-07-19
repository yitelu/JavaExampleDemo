
/*
* Inner class
*  member class
*  Static class
*  Anonymous
*
 */

class Outer{

    int a; //member variable

    //member method
    public void show(){

    }

    //member class
    class Inner // Outer$Inner.class
    {

        private int anInt;

        public Inner(){

        }
        public Inner(int a){
            anInt = a;
        }

        public void display(){
            System.out.println("none-static inner display");
            System.out.println("the a = "+ anInt);
        }

    }

    //static inner class
    static class staticInnerClass{

        public void printMe(){
            System.out.println("here's static inner class");
        }
    }

}


public class DemoInnerClass {

    //variable , method

    public static void main(String[] args) {

        Outer obj = new Outer();
        obj.show();

        //demo this is how to create an object for the inner class //member class
        //use the external object and new the none-static inner class.
        Outer.Inner obj1 = obj.new Inner(8);
        obj1.display();


        //demo how to create the static inner class
        Outer.staticInnerClass obj2 = new Outer.staticInnerClass();
        obj2.printMe();




    }

}
