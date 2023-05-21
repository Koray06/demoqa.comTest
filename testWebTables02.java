package testWebTablesExercises;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilites.testBase;

import java.util.List;

public class testWebTables02 extends testBase {
    /*
     1. “https://demoqa.com/webtables” sayfasina gidin
 2. Headers da bulunan basliklari yazdirin
 3. 3.sutunun basligini yazdirin
 4. Tablodaki tum datalari yazdirin
 5. Tabloda kac tane bos olmayan cell (data) oldugunu yazdirin
 6. Tablodaki satir sayisini yazdirin
 7. Tablodaki sutun sayisini yazdirin
 8. Tablodaki 3.kolonu yazdirin
 9. Tabloda "First Name" i Kierra olan kisinin Salary'sini yazdirin
10. Page sayfasinda bir method olusturun, Test sayfasindan satir ve sutun sayisini girdigimde bana datayi yazdirsin
    */


    @Test
    public void test01 (){
        driver.get("https://demoqa.com/webtables");
// Headers da bulunan basliklari yazdirin

    WebElement SutunBasligi = driver.findElement(By.xpath("//div[@role=\"columnheader\"]"));
    //System.out.println(SutunBasligi.getText());

     // 3.sutunun basligini yazdirin
        List<WebElement> SutunBasligiList  = driver.findElements(By.xpath("//div[@role=\"columnheader\"]"));
        System.out.println("üçüncü sutun basligi : "+ SutunBasligiList.get(3).getText());
     //  Tablodaki tum datalari yazdirin

        List<WebElement>tablodakiTumDatalar = driver.findElements(By.xpath("//div[@role=\"gridcell\"]"));
        System.out.println(tablodakiTumDatalar);
       /* for (WebElement eachDatalar: tablodakiTumDatalar
             ) {
            System.out.println(eachDatalar.getText());
        }*/
    }
}
