
/*
* demo on //call the super class' default constructor super() by default
 */

class A{ //super

    public A(){
        System.out.println("in A");
    }
    public A(int i){
        System.out.println("int A int: " +i);
    }
}

class B extends A{ //sub

    public B(){

        super(8); //call the super class' default constructor super() by default
        System.out.println("in B");
    }
    public B(int i){

        super(i);
        System.out.println("int B int: "+ i);
    }

}

public class DemoSuperMethod {

    public static void main(String[] args) {

        B obj = new B();

    }
}
