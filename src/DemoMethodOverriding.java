
/*
* demo that B1 has the same method of show() as A1, and use @Override to override the method
 */

class A1{

    void show(){
        System.out.println("in A1");
    }
}

class B1 extends A1{

    @Override
    void show(){

        super.show(); //call the A1's show()

        System.out.println("in B1");
    }

}

public class DemoMethodOverriding {
    public static void main(String[] args) {

        B1 obj = new B1();
        obj.show(); //call the B1's show

    }
}
