package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RSS_Feed_Testing {
    WebDriver driver = new ChromeDriver();

    // Open the webpage


    // Execute JavaScript to find all link elements with no attributes
   @Test
    public void Test00001(){

       List<String> list = new ArrayList<>(Arrays.asList("https://oncweekly.com/feed/custom-rss/?category_id=23","https://oncweekly.com/feed/custom-rss/?category_id=16","https://oncweekly.com/feed/custom-rss/?category_id=121","https://oncweekly.com/feed/custom-rss/?category_id=120","https://oncweekly.com/feed/custom-rss/?category_id=122","https://oncweekly.com/feed/custom-rss/?category_id=24","https://oncweekly.com/feed/custom-rss/?category_id=136","https://oncweekly.com/feed/custom-rss/?category_id=130","https://oncweekly.com/feed/custom-rss/?category_id=134","https://oncweekly.com/feed/custom-rss/?category_id=54","https://oncweekly.com/feed/custom-rss/?category_id=135","https://oncweekly.com/feed/custom-rss/?category_id=25","https://oncweekly.com/feed/custom-rss/?category_id=116","https://oncweekly.com/feed/custom-rss/?category_id=277","https://oncweekly.com/feed/custom-rss/?category_id=232","https://oncweekly.com/feed/custom-rss/?category_id=26","https://oncweekly.com/feed/custom-rss/?category_id=238","https://oncweekly.com/feed/custom-rss/?category_id=239","https://oncweekly.com/feed/custom-rss/?category_id=249","https://oncweekly.com/feed/custom-rss/?category_id=27","https://oncweekly.com/feed/custom-rss/?category_id=3475","https://oncweekly.com/feed/custom-rss/?category_id=28","https://oncweekly.com/feed/custom-rss/?category_id=285","https://oncweekly.com/feed/custom-rss/?category_id=55","https://oncweekly.com/feed/custom-rss/?category_id=1766","https://oncweekly.com/feed/custom-rss/?category_id=286","https://oncweekly.com/feed/custom-rss/?category_id=12","https://oncweekly.com/feed/custom-rss/?category_id=13","https://oncweekly.com/feed/custom-rss/?category_id=51","https://oncweekly.com/feed/custom-rss/?category_id=30","https://oncweekly.com/feed/custom-rss/?category_id=52","https://oncweekly.com/feed/custom-rss/?category_id=53","https://oncweekly.com/feed/custom-rss/?category_id=103","https://oncweekly.com/feed/custom-rss/?category_id=102","https://oncweekly.com/feed/custom-rss/?category_id=302","https://oncweekly.com/feed/custom-rss/?category_id=31","https://oncweekly.com/feed/custom-rss/?category_id=386","https://oncweekly.com/feed/custom-rss/?category_id=17","https://oncweekly.com/feed/custom-rss/?category_id=117","https://oncweekly.com/feed/custom-rss/?latest=stories-to-watch","https://oncweekly.com/feed/custom-rss/?post_type=fda","https://oncweekly.com/feed/custom-rss/?post_type=trials","https://oncweekly.com/feed/custom-rss/?latest=meeting-coverage","https://oncweekly.com/feed/custom-rss/?latest=research"));
       for(int i=0; i<list.size();i++) {
           // Navigate to the XML page
           driver.get(list.get(i));

           // Find the item tag using XPath
           List<WebElement> itemTag = driver.findElements(By.tagName("item"));
           if (itemTag.size() != 0) {
               System.out.println(i+1+")Data Available");
           } else {
               System.out.println(i+1+")Empty");
           }
       }

       // Close the browser
       driver.quit();
       }

   }

