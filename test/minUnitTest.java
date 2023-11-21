import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import min.Min;


public class minUnitTest {
    
    public minUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Before class");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("After class");
    }
    
    @Before
    public void setUp() {
        System.out.println("Before");
    }
    
    @After
    public void tearDown() {
        System.out.println("After");
    }

    @Test
    public void Min() {
    assertEquals(1,Min.findmin(new int[]{1,5,5,2}));
    assertEquals(-12,Min.findmin(new int[]{-12,1,-3,-4,-2}));
}
}