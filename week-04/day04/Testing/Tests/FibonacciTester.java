import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTester {
    Fibonacci member = new Fibonacci();
    double value = member.FibonacciMember(47);
    @Test
    public void TestFibonacci(){
        assertEquals(2971215073L, (long)value); //in case of long thers should be an "L" at the end, in case of float "F"
    }

}
