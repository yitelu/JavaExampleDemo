/*
* "abstract class " means that can't create object from that class
*
* when there's "abstract method" and class must be "abstract"
 */


abstract class Human{

    public abstract void eat();

    public void walk(){
        System.out.println("walking");
    }
}

class Man extends Human  //concrete class
{

    //@Override
    public void eat(){
        System.out.println("Man eating");
    }

}


public class Demo68Abstract {

    public static void main(String[] args) {
        Human obj = new Human() {
            @Override
            public void eat() {

            }
        };

        obj.walk();
        //obj.eat();

    }

}
