import java.util.Arrays;
import java.util.Comparator;

/*
Почитать в инете про медиану выборки
*/

public class Solution {

    public static void main(String[] args) {

    }

//    public static Integer getMedian (Integer[] array) {
//        Arrays.sort(array);
//        double median;
//        if (array.length % 2 == 0)
//            median = ((double)array[array.length/2] + (double)array[array.length/2 - 1])/2;
//        else
//            median = (double) array[array.length/2];
//
//        return (int) median;
//    }
//
//    public static Integer[] sort(Integer[] array) {
//        //implement logic here
//        int median = Solution.getMedian(array);
//        Comparator<Integer> comp = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return (int) (median - o1) + (median - o2);
//            }
//        };
//
//        Arrays.sort(array, comp);
//
//        return array;
//    }
//


    public static Integer[] sort(Integer[] array) {
        final double mediana = getMediana(array);

        Arrays.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                double v1 = o1.intValue() - mediana;
                double v2 = o2.intValue() - mediana;
                return (int) ((v1 * v1 - v2 * v2) * 100);
            }
        });

        return array;
    }

    private static double getMediana(Integer[] array) {
        Arrays.sort(array);
        double res;
        int length = array.length;

        if (length % 2 == 1) {
            res = array[length / 2];
        } else {
            res = (array[length / 2 - 1] + array[length / 2]) / 2.;
        }
        return res;
    }
}