    /*
     * Sample of code:
     * 1. Encapsulation: that create an object and use its getter and setter.
     * 2. Method & Constructor Overloading: that create object and call different constructor.
     *
     */
    public class DemoEncapsulationOverloading {

        public static void main(String args[]) {

            //Example of Encapsulation that create an object and use its getter and setter
            myCal cal_num1 = new myCal();
            cal_num1.setA(10);
            System.out.println(cal_num1.getA());

            //Example of Constructor Overflow that create object and call different constructor.
            myCal cal_num2 = new myCal(3, 8);
            System.out.println(cal_num2.getSum());

            //More example of Constructor Overflow
            myCal cal_num3 = new myCal(3);
            myCal cal_num4 = new myCal(3.0);
            myCal cal_num5 = new myCal("Test String");

            //Example of Object method overloading
            myCal cal_num6 = new myCal();
            cal_num6.add(8,7); //print 15
            cal_num6.add(1.1,1.3); //print 2.4
        }
    }

    class myCal{

        private int a;
        private int b;
        private int sum;
        private double multiple;
        private int subtraction;
        int i;
        int j;

        public myCal() {

        }

        public myCal(int i, int j) {
            this.i = i; //example of "this" for the "instance variable"
            this.j = j;
        }

        public myCal(String a) {
            System.out.println("from String method Constructor: " + a);

        }

        public myCal(double d) {
            System.out.println("from double method Constructor: " + d);

        }

        public myCal(int k) {
            System.out.println("from int method Constructor: " + k);
        }


        public int getA() {
            return a;
        }
        public void setA(int a) {
            this.a = a;
        }
        public int getB() {
            return b;
        }
        public void setB(int b) {
            this.b = b;
        }
        public int getSum() {
            sum = i + j;
            return sum;
        }
        public void setSum(int sum) {
            this.sum = sum;
        }
        public double getMultiple() {
            return multiple;
        }
        public void setMultiple(double multiple) {
            this.multiple = multiple;
        }
        public int getSubtraction() {
            return subtraction;
        }
        public void setSubtraction(int subtraction) {
            this.subtraction = subtraction;
        }

        public void add(int i, int j) {
            int sum = i+j;
            System.out.println("Print sum of 2 interger: "+ sum);
        }

        public void add(double i, double j) {
            double sum = i+j;
            System.out.println("Print sum of 2 double: "+ sum);
        }
    }