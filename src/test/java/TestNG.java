import org.testng.annotations.*;

public class TestNG {


    @BeforeTest
    public void bt(){
        System.out.println("Before test");
    }
    @AfterTest
    public void at(){
        System.out.println("After test");
    }
    @BeforeSuite
    public void bs(){
        System.out.println("Before suite");
    }
    @AfterSuite
    public void as(){
        System.out.println("After suite");
    }

    @BeforeMethod
    public void setUp(){
        System.out.println("Before method");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("After method");
    }

    @Test
    public void test01(){
        System.out.println("Test 01");
    }
    @Test
    public void test02(){
        System.out.println("Test 02");
    }
    @Test
    public void test03(){
        System.out.println("Test 03");
    }

    @BeforeClass
    public void bc(){
        System.out.println("Before class");
    }
    @AfterClass
    public void ac(){
        System.out.println("After class");
    }

}
//Siralama nasil olursa olsun once suit, sonra test sonra grup en sonda class calisir.
// her methoddan once ve sonra before method ile aftermethod calisir.