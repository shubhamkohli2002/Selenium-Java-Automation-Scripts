package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OwPageSpeedInsightsTest {
    WebDriver driver = new ChromeDriver();
    @Test
    public void Test0001(){

        List<String> list = new ArrayList<>(Arrays.asList("https://oncweekly.com/", "https://oncweekly.com/brain-cancer/", "https://oncweekly.com/breast-cancer/", "https://oncweekly.com/gastrointestinal-cancer/", "https://oncweekly.com/gynecologic-cancer/", "https://oncweekly.com/head-neck-cancer/", "https://oncweekly.com/leukemia/", "https://oncweekly.com/lung-cancer/", "https://oncweekly.com/lymphoma/", "https://oncweekly.com/skin-cancer/", "https://oncweekly.com/clinical-trial-portal/", "https://oncweekly.com/meeting-coverage/", "https://oncweekly.com/category/latest-research/", "https://oncweekly.com/about-us/", "https://oncweekly.com/terms-of-use/", "https://oncweekly.com/privacy-policy/", "https://oncweekly.com/editorial-policy/", "https://oncweekly.com/contact-us/", "https://oncweekly.com/newsletter-signup/"));
        for(int i=0; i<list.size();i++)
        {
            driver.manage().window().maximize();
            driver.get("https://pagespeed.web.dev/");
        driver.findElement(By.xpath("//*[@id=\"i4\"]")).sendKeys(list.get(i));
        driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div[2]/div/div[2]/form/div[2]/button")).click();
          if(i==list.size()-1) {
            break;
          }
          else {
              driver.switchTo().newWindow(WindowType.TAB);
          }
        }

    }
}
