package pages;

import browser.StartBrowser;
import dataprovider.AllData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import java.util.List;

public class HomePage {

    List<WebElement> topNavs = StartBrowser.driver.findElements(
            By.xpath("//a[@class=' top-nav']"));

    public void seeAllLinks(String linkName){
        for(WebElement element: topNavs ){
            System.out.println(element.getText());
        }

        topNavs.stream().filter(element-> element.getText().equals(linkName))
                .findFirst().get().click();
<<<<<<< HEAD
        System.out.println("this is a test");
        System.out.println("this is second test");
        System.out.println("this is third test");
        System.out.println("this is forth test");
        System.out.println("for test prozect is working");
=======
>>>>>>> fcf13a4bd7b5ee3320d0bae48d20083b8b32c1d2


        /*for(WebElement element: topNavs){
            if(element.getText().equals(linkName)) {
                element.click();
                break;
            }
        }*/

    }

    public void verifyLinkNamesPresent(){

        Assert.assertEquals(topNavs.size(), 6);

        for(WebElement element : topNavs){
            String str = element.getText();
            Assert.assertTrue(AllData.getAllData().contains(str), str+" was not found");
        }
    }
}
