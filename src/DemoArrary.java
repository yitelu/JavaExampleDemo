

/*
* example of 2D array and jagged array (*length of the array is not fixed)
* example of use enhance for loop
 */

public class DemoArrary {

    public static void main(String[] args) 
    {

        //example of 1D array
        int nums[] = new int[4];
        nums[2] = 5;
        System.out.println("value of num[2] equal: " + nums[2]);


        int myArray [][] = {
                {0, 3, 4, 5},
                {1, 2, 3},
                {3, 7, 9}
        };

        for (int i=0; i < myArray.length; i++){

            for(int j=0; j<myArray[i].length; j++){

                System.out.print(" " + myArray[i][j]);
            }

            System.out.println();
        }
        System.out.println();


        int myFixArray [][] = new int[3][4];

//        myFixArray=
//                {
//                        {0, 3, 4, 5},
//                        {1, 2, 3, 8},
//                        {3, 7, 9, 9}
//                };

        for (int i=0; i < 3; i++){

            for(int j=0; j<4; j++){

                myFixArray[i][j]= j;
                System.out.print(" " + myFixArray[i][j]);
            }

            System.out.println();
        }
        System.out.println();


        //following is the example of enhance for loop for double array, which no need to worry about array length
        int d[][] = {
                {8,7,6,5},
                {1,3,5,7},
                {2,4,6,8}
        };

        for(int j[] : d){
            for(int k : j){
                System.out.print(" " + k);
            }
            System.out.println();
        }











        
    }
}
