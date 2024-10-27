import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

       /* 1.Write a Java program to test if the first and the last element of an array of integers are same.
        The length of the array must be greater than or equal to 2 Test Data:
          array = 50, -20, 0, 30, 40, 60, 10
        */


//        int [] array = {50, -20, 0, 30, 40, 60,10};
//          if (array.length >= 2){
//            int first =array[0];
//            int last =array[array.length -1];
//
//            if (first == last){
//                System.out.println("true");
//            }else System.out.println("false");
//          }



        /* 2.Write a Java program to find the numbers greater than the average of the numbers of a given array.
            Original Array: [1, 4, 17, 7, 25, 3, 100]
         */



//        int [] number = {1, 4, 17, 7, 25, 3, 100};
//
//        int sum = 0;
//        for (int num : number) {
//            sum = sum+num;
//        }
//        double average = (double) sum / number.length;
//        System.out.println("The average of the said array is: " + average);
//        System.out.print("The numbers in the said array that are greater than the average are:  ");
//        for (int num : number) {
//            if (num > average) {
//                System.out.print(num + " ");
//            }
//               }




        /* 3.Write a Java program to get the larger value between first and last element of an array of integers.
          Original Array: [20, 30, 40]
         */


//
//        int[] array = {20, 30, 40};
//
//        if (array.length>0){
//            int first = array [0];
//            int last = array[array.length - 1];
//           int largervalue= Math.max(first,last);
//            System.out.println("Larger value between first and last element: "+largervalue);
//        }else System.out.println();







        /* 4.Write a Java program to swap the first and last elements of an array and create a new array.
          Original Array:
           [20, 30, 40]
         */


        ArrayList<Integer> number = new ArrayList();

        number.add(20);
        number.add(30);
        number.add(40);

        System.out.println("Original Array: "+number);
int temp=number.get(0);
        number.set(0,number.get(number.size()-1));
        number.set(number.size()-1,temp);

        System.out.println("New array after swapping the first and last elements: "+number);



        /* 5. Write a program that places the odd elements of an array before the even elements.
         Original Array: [2,3,40,1,5,9,4,10,7]
         */




//        ArrayList<Integer> number = new ArrayList();
//
//        number.add(2);
//        number.add(3);
//        number.add(40);
//        number.add(1);
//        number.add(5);
//        number.add(9);
//        number.add(4);
//        number.add(10);
//        number.add(7);
//        System.out.println("the array is: "+number);
//
//        ArrayList <Integer> oddNeven =new ArrayList();
//
//        for (int num : number) {
//            if (num % 2 != 0) {
//                oddNeven.add(num);
//            }
//        }
//        for (int num : number) {
//            if (num % 2 == 0) {
//                oddNeven.add(num);
//            }
//        }
//        System.out.println("the array from odds to evens"+oddNeven);






        // 6. Write a program that test the equality of two arrays. [2,3,6,6,4] [2,3,6,6,4]

       int [] equality1 = {2,3,6,6,4};
       int [] equality2 = {2,3,6,6,4};

        boolean areEqual = Arrays.equals(equality1, equality2);

        System.out.println(areEqual);





    }
}
