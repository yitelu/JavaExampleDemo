
/*
* Varargs stands for variable arguments
*
*
 */

class Calc{

    //variable arguments
    public int add(int ... n) // {4, 5, 6, 7, 8, 8, 4}  //Variable length Arguments
    {
        int sum = 0;
        for (int i : n){
            sum += i;
        }
        return sum;
    }
}


public class DemoVarargs {

    public static void main(String[] args) {

        Calc obj = new Calc();
        System.out.println(obj.add(4, 5, 6, 7, 8, 8, 4));
        //print 42, and doesn't matter how many parameters pass into the method

    }
}
