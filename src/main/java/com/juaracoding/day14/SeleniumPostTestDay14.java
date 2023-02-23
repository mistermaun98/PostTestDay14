package com.juaracoding.day14;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class SeleniumPostTestDay14 {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("Biodata form testing has started");
        System.out.println("========================================");

        System.setProperty("webdriver.chrome.driver", "C:\\juaracoding\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        driver.get("https://formy-project.herokuapp.com/form");
        driver.manage().window().maximize();
        System.out.println("Window maximized");
        String title = driver.findElement(By.xpath("/html/body/div/h1")).getText();
        System.out.println("Title : "+title);
        System.out.println();

        //STAGE 1 : First Name textfield testing
        System.out.println("========================================");
        System.out.println("First name data input test");
        System.out.println("========================================");
        driver.findElement(By.id("first-name")).sendKeys("Emily");
        System.out.println("Result : Form First Name berhasil diisi data");
        System.out.println("Data yang diinput : " + driver.findElement(By.id("first-name")).getAttribute("value"));
        System.out.println("========================================");

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println();

        //STAGE 2 : Last Name textfield testing
        System.out.println("========================================");
        System.out.println("Last name data input test");
        System.out.println("========================================");
        driver.findElement(By.id("last-name")).sendKeys("Hawthorne");
        System.out.println("Result : Form Last Name berhasil diisi data");
        System.out.println("Data yang diinput : " + driver.findElement(By.id("last-name")).getAttribute("value"));
        System.out.println("========================================");

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println();

        //STAGE 3 : Job Title textfield testing
        System.out.println("========================================");
        System.out.println("Job Title data input test");
        System.out.println("========================================");
        driver.findElement(By.id("job-title")).sendKeys("My Significant Others <3");
        System.out.println("Result : Form Last Name berhasil diisi data");
        System.out.println("Data yang diinput : " + driver.findElement(By.id("job-title")).getAttribute("value"));
        System.out.println("========================================");

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println();

        //STAGE 4 : Radio Button testing
        System.out.println("========================================");
        System.out.println("Radio button input test");
        System.out.println("========================================");
        driver.findElement(By.id("radio-button-2")).click();
        System.out.println("Result : Radio Button College berhasil diklik");
        System.out.println("========================================");

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println();

        //STAGE 5 : Checkbox testing
        System.out.println("========================================");
        System.out.println("Checkbox input test");
        System.out.println("========================================");
        driver.findElement(By.id("checkbox-2")).click();
        driver.findElement(By.id("checkbox-3")).click();
        System.out.println("Result : Checkbox 'Female' dan 'Prefer Not To Say' berhasil diklik");
        System.out.println("========================================");

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println();

        //Stage 6 : Scroll page testing
        System.out.println("========================================");
        System.out.println("Scroll down page test");
        System.out.println("========================================");
        js.executeScript("scrollBy(0, 500)");
        System.out.println("Scrolling down success !");
        System.out.println("========================================");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println();

        //STAGE 7 : Dropdown menu testing
        System.out.println("========================================");
        System.out.println("Dropdown input test");
        System.out.println("========================================");
        WebElement selectyears = driver.findElement(By.id("select-menu"));
        Select dropdown = new Select(selectyears);
        dropdown.selectByIndex(2);
        System.out.println("Result : Opsi '2-4' berhasil dipilih");
        System.out.println("========================================");

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println();

        //STAGE 8 : Date input testing
        System.out.println("========================================");
        System.out.println("Date input test");
        System.out.println("========================================");
        driver.findElement(By.id("datepicker")).sendKeys("06/15/1997");
        System.out.println("Data berhasil diinput !");
        System.out.println("Data yang diinput : " + driver.findElement(By.id("datepicker")).getAttribute("value"));
        System.out.println("========================================");

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println();

        //Stage 9 : Submit button click test
        System.out.println("========================================");
        System.out.println("Submit button click test");
        System.out.println("========================================");
        driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a")).click();
        System.out.println("Submit button working as intended");
        System.out.println("========================================");

        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("All testing stages passed !");
        System.out.println("Closing program");
        driver.quit();
    }
}
