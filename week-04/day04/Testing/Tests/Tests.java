import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Tests {
    Apples valami = new Apples();
    String alma = valami.getApple("apple");

    @Test
    public void TestApple(){
        assertEquals(alma,"apple");
    }

    @Test
    public void TestSum(){
        Sum valami = new Sum();
        Integer sum = valami.SumOfNumbers(new ArrayList(Arrays.asList(new Integer[]{5, -4, 3})));
        assertEquals((Integer)4,sum);
    }

    @Test
    public void TestSumOneElement(){
        Sum valami = new Sum();
        Integer sum = valami.SumOfNumbers(new ArrayList(Arrays.asList(new Integer[]{3})));
        assertEquals((Integer)3,sum);
    }
    @Test
    public void TestSumEmpty(){
        Sum valami = new Sum();
        Integer sum = valami.SumOfNumbers(new ArrayList(Arrays.asList()));
        assertEquals((Integer)0,sum);
    }
    @Test (expected = NullPointerException.class)
    public void TestSumNull(){
        Sum valami = new Sum();
        Integer sum = valami.SumOfNumbers(new ArrayList(Arrays.asList(null)));
        System.out.println();
    }
    @Test
    public void TestIfAnagram(){
        Anagram ana = new Anagram();
        Boolean anagram = ana.isAnagram("12345A  ","5432A 1 ");
        assertTrue(anagram);
    }

    @Test
    public void TestIfAnagram2(){
        Anagram ana = new Anagram();
        assertFalse(ana.isAnagram("",""));
    }
    @Test (expected = NullPointerException.class)
    public void TestIfAnagramNullValue(){
        Anagram ana = new Anagram();
        Boolean anagram = ana.isAnagram(null,"a543 21 ");
    }

}
