package day20_forEach;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {


        int[] n1 = {10,20,30,40,50};


//        |Traditional For Loop|

        for (int i = 0; i < n1.length; i++) {
            System.out.println(Arrays.toString(n1));
        }
        /*[10, 20, 30, 40, 50]
          [10, 20, 30, 40, 50]
          [10, 20, 30, 40, 50]
          [10, 20, 30, 40, 50]
          [10, 20, 30, 40, 50]*/

        System.out.println("-------------------------");

//        |For Each Loop |

//      for (dataType variableName : dataStructure)
        for (int each : n1){
            System.out.println(each); // forEach loop ---> no index # & no increment
        }
        /* 10
           20
           30
           40
           50 */


    }


}
