package app;

import java.util.ArrayList;
import java.util.List;

public class NumberUtils {

    public static int getSum(List<Integer> numbers){

        int res = 0;

        for (int i : numbers) {
            res = res + i;
        }

        return res;

    }

    public static List<Integer> multiplyOddNumber(List<Integer> numbers){

        List<Integer> listRes = new ArrayList<>();

        for (int i : numbers) {
            if(i%2 != 0 ){
                listRes.add(i*2);
            }
        }

        return listRes;

    }

}
