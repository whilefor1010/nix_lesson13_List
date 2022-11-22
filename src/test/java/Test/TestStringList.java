package Test;

import app.WordUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class TestStringList {
    @Test
    public void isShortestWord () {

        List<String> words = new ArrayList<>();

        words.add("Batareya");
        words.add("Minus20");
        words.add("brrr");
        words.add("TeplotaVDusheKota");

        assertEquals("brrr",WordUtils.getShortestWord(words));

    }

    @Test
    public void isIllegalArgsExcp () {

        List<String> words = new ArrayList<>();

        try{
            String s = WordUtils.getShortestWord(words);
            fail("ooops, exception doesn't work");
        }catch (Exception e){
            assertTrue(e instanceof IllegalArgumentException);
        }

    }

    @Test
    public void shouldCountTheWords() {

        String text = "Walking on water and developing software from a specification are easy if both are frozen Edward V Berard";

        Map<String,Integer> map = WordUtils.getCountWords(text);

        assertEquals(2, (int) map.get("are"));
        assertEquals(1, (int) map.get("software"));

    }

}
