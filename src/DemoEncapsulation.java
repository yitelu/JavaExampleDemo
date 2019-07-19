/*
** Encapsulation => Binding data with method
**
 */


class student{

    private int rollNum;
    private String name;


    //getter and setter

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}



public class DemoEncapsulation {
    public static void main(String[] args) {

        student s1 = new student();
        s1.setRollNum(888);
        s1.setName("Richard");

        System.out.println(s1.getRollNum());
        System.out.println(s1.getName());

    }
}
