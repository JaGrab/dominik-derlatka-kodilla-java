package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_SELECT_DAY = "//span[contains(@data-name, \"birthday_wrapper\")]/span/select[1]";
    public static final String XPATH_SELECT_MONTH = "//span[contains(@data-name, \"birthday_wrapper\")]/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "//span[contains(@data-name, \"birthday_wrapper\")]/span/select[3]";
    public static final String XPATH_WAIT_FOR = "//span[contains(@data-name, \"birthday_wrapper\")]/span";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com");
        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR)).isDisplayed());
        WebElement selectComboDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectDay = new Select(selectComboDay);
        selectDay.selectByIndex(1);
        WebElement selectComboMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectMonth = new Select(selectComboMonth);
        selectMonth.selectByIndex(1);
        WebElement selectComboYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectYear = new Select(selectComboYear);
        selectYear.selectByValue("1970");
    }
}
