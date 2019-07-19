
/*
* demo how to use "Dynamic Method Dispatch"
 */

class A2{

    public void show(){
        System.out.println("in A2");
    }

}

class B2 extends A2{

    public void show(){
        System.out.println("in B2");
    }

}

class C2 extends A2{

    public void show(){
        System.out.println("in C2");
    }

}


public class DemoDynamicMethodDispatch {

    //compile time and runtime
    public static void main(String[] args) {

        A2 obj1 = new B2(); //runtime polymorphism
        obj1.show();

        obj1 = new C2();
        obj1.show(); //Dynamic Method Dispatch
    }
}
