import org.testng.annotations.*;

public class Priority {

/*
   1. JUnit'te bir class'da bulunan test methodlarinin hangi siraya gore calisacagini belirleyemeiz
   2.  TestNG de eger hicbirsey yapmazsak methodlar Natural Order'a gore calisir.
   3. TestNG de her bir testin methoduna priority atarsak bu methodlarimizi istedigimiz siraya gore calistirabiliriz
        i.Priority'si kucuk olan once calisir
        ii.Priority'leri esit olanlar ise Natural Order'a gore calisir.
        iii.Eger methoda priority'sini belirtmezsek TestNG "priority=0" olarak kabul eder
      ve bu degere gore calistirmaya baslar
        iv.dependsOnMethods() methodu ile siralamadan bagimsiz olarak  bir test methodun calismasini diger methodun passed olmasina bagliyoruz.
        dependsOnMethods kesinlikle siralamaya mudahale etmez! Sadece sira kendisine geldiginde bagli oldugu testin calisip calismadigini
        kontrol eder ve o gecmisse calismaya baslar. Eger gecemezse bu method ignore edilir.
    4.xml dosya kullanimi:TestNG xml formatindaki dosyalarla istedigimiz testleri toplu sekilde calistirmamiza olanak verir.

 */


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
