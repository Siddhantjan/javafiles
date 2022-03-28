import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        /*
        Arrays
         */
        //id
//        int [] a ={33,3,4,5};
//        System.out.println(Arrays.toString(a));//[33, 3, 4, 5]
// the string representation of arr
/*
        deepToString
        Returns a string representation of the “deep contents” of the specified array.
        If the array contains other arrays as elements, the string representation contains their contents
        and so on. This method is designed for converting multidimensional arrays to strings.
        The simple toString() method works well for simple arrays, but doesn’t work for multidimensional arrays.
        This method is designed for converting multi-dimensional arrays to strings.
         */
        //jagged array
//        int arr1 [][] = new int[3][];
//        arr1[0]= new int[]{};
//        arr1[1]= new int[]{4,5,6,7};
//        arr1[2]= new int[]{8, 9, 10, 11, 12};
//        System.out.println(Arrays.deepToString(arr1)); //[[], [4, 5, 6, 7], [8, 9, 10, 11, 12]]
       /*
       String Methods
        */
//        char [] ch ={'s','i','d','d','h','a','n','t'};
//        String s= new String(ch);
//        System.out.println(s); //siddhant

  //      String s = new String("Siddhant");
//        System.out.println(s.charAt(0)); //s
//        System.out.println(s.length()); //8
//        System.out.println(s.substring(3)); //dhant
//        System.out.println(s.substring(0,7)); //Siddhan
//        System.out.println(s.replace('S','s')); //siddhant
//        System.out.println(s.intern()); //Siddhant
//        System.out.println(s.indexOf('d')); //2
//        System.out.println(s.toUpperCase()); //SIDDHANT
//        System.out.println(s.trim()); //Siddhant //remove space begin and end
//        System.out.println(Arrays.toString(s.split(""))); //[S, i, d, d, h, a, n, t]

 //      StringBuffer sb = new StringBuffer(" Siddhant ");
//        sb.append(" Jain");
//        System.out.println(sb); // Siddhant  Jain
//        sb.insert(sb.length()," is good");
//        System.out.println(sb); //  Siddhant  Jain is good
//         sb.replace(10,15,"");
//        System.out.println(sb); //Siddhant  is good
//        sb.reverse();
//        System.out.println(sb); //doog si  tnahddiS
 //      System.out.println(sb.capacity()); //26

//        StringBuilder sb = new StringBuilder("Siddhatn");
//        System.out.println(sb);
//        sb.setLength(0);
//        System.out.println(sb+" ,,");
//        System.out.println(sb.length());




    }
}
