package testWebTablesExercises;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilites.testBase;

import java.util.List;

public class WebTestbireyselCalisma01 extends git  {
     /*   1."https://www.amazon.com" adresine gidin
          2.Sayfanin en altina inin
          3.Web table tum body’sini yazdirin
          4.Web table’daki satir sayisinin 9 oldugunu test edin.
          5.Tum satirlari yazdirin
          6. Web table’daki sutun sayisinin 13 olduğunu test edin
          7. 5.sutunu yazdirin
          8.Satir ve sutun sayisini parametre olarak alip, hucredeki bilgiyi döndüren bir method olusturun */


    @Test
    public void Test01() throws InterruptedException {
        //"https://www.amazon.com" adresine gidin
        driver.get("https://www.amazon.com");

        //Sayfanin en altina inin
        Actions action = new Actions(driver);
        action.sendKeys(Keys.END).perform();
        Thread.sleep(3000);
       // Web table tum body’sini yazdirin
        WebElement tumBodysElementi = driver.findElement(By.tagName("tbody"));
        System.out.println(tumBodysElementi.getText());

        //Web table’daki satir sayisinin 9 oldugunu test edin.
        List<WebElement> satirSayilari = driver.findElements(By.xpath("//tbody/tr"));
        int expectedResult = 9 ;
        int actualResult = satirSayilari.size();
        Assert.assertEquals(expectedResult,actualResult);

        //Tum satirlari yazdirin
        int satirNU=1;
        for (WebElement eachSatir:satirSayilari
             ) {
            System.out.println(satirNU+eachSatir.getText());
            satirNU++;
        }

        System.out.println("============================");
       // Web table’daki sutun sayisinin 13 olduğunu test edin
      List<WebElement>tableSutunSayilari = driver.findElements(By.xpath("//tbody/tr[1]/td"));
        int expectedSutunlar = 13;
        int actualSutunlar = tableSutunSayilari.size();
        Assert.assertEquals(expectedSutunlar,actualSutunlar);
        System.out.println("============================");
        // 5.sutunu yazdirin
        WebElement besNoluSutun = driver.findElement(By.xpath("//tbody/tr[1]/td[5]"));
        System.out.println(besNoluSutun.getText());

        //Satir ve sutun sayisini parametre olarak alip, hucredeki bilgiyi döndüren bir method olusturun

        System.out.println(satirVeSutunSayilari(1, 9));


    }

    private String satirVeSutunSayilari(int satir,int sutun) {

        //tbody/tr[1]/td[5]
        String dinamikPath = "//tbody/tr["+satir+"]/td["+sutun+"]";
          WebElement istenenWebelementi = driver.findElement(By.xpath(dinamikPath));
        return  istenenWebelementi.getText();
    }


}
