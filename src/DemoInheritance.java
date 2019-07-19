
// IS-A, HAS-A
//example of java inheritance of single level and multiple level

class Calculator{ //super class, Parent, Base, Base

    public int add(int i, int j){
        return i+j;
    }
}

class CalAdv extends Calculator{ //sub class, Child, Derived

    public int sub(int i, int j){
        return i - j;
    }
}

class CalcVeryAdv extends CalAdv{ //3rd level of inheritance

    public int multi(int i, int j){
        return i*j;
    }
}

public class DemoInheritance {

    public static void main(String[] args) {

        CalcVeryAdv c1 = new CalcVeryAdv();
        int result1 = c1.add(5,4);
        int result2 = c1.sub(10, 2);
        int result3 = c1.multi(2,9);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
