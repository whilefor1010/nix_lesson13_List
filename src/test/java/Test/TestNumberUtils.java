package Test;

import static org.junit.Assert.*;

import app.NumberUtils;
import org.junit.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;


public class TestNumberUtils {

    @Test
    public void shouldSummarize () {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(110);
        numbers.add(33);
        numbers.add(27);

        assertEquals(170, NumberUtils.getSum(numbers));

    }

    @Test
    public void shouldMultiplyOddNumber() {

        int[] arr = {14,34};

        List<Integer> numbers = new ArrayList<>();

        numbers.add(110);
        numbers.add(7);
        numbers.add(77);

        List<Integer> list = NumberUtils.multiplyOddNumber(numbers);

        int[] arr2 = new int[list.size()];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = list.get(i);
        }

        assertArrayEquals(arr,arr2);

    }

}
