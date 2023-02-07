package technostudyB7.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        //1- browser driver set up
        WebDriverManager.chromedriver().setup();
        //2- create object of ChromeDriver to open the browser
        WebDriver driver= new ChromeDriver();
        //3- go to google page
        driver.get("https://www.google.com");
        System.out.println("Title Of google.com =" + driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.navigate().to("https://www.techno.study");
        String expectedTitle = "Join the best coding bootcamps online and get IT training in the US";
        String actualTitle = driver.getTitle();
        if (expectedTitle.equals(actualTitle)) {
            System.out.println("verification is done : PASS");
            System.out.println("actual title =" + actualTitle);
        }else {
                System.out.println("verification is FAILED");
                System.out.println("actual title =" + actualTitle);
            }
        }



}
