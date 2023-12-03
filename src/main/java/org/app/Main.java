package org.app;

import java.util.List;
import org.application.service.StorageService;
import org.application.service.impl.StorageServiceImpl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    private static final String FORM_URL =
            "https://docs.google.com/forms/d/e/"
                    + "1FAIpQLSdHH2iHchOMqTD6-um_oZN9VTSeZzL2BRNFot0_LmlArBJMbw/viewform";
    private static final String INPUT_FORM_PATH = "//input[@jsname='YPqjbf']";
    private static final String SEND_BUTTON_CLASS = ".uArJ5e.UQuaGc.Y5sE8d.VkkpIf.QvWxOd";
    private static final String REQUIRED_INPUT = "default@input.data";

    public static void main(String[] args) {
        StorageService service = new StorageServiceImpl();
        service.addNewMarker(".T5pZmf");

        System.setProperty("webdriver.chrome.driver",
                "drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(FORM_URL);

        WebElement inputForm = driver.findElement(By.xpath(INPUT_FORM_PATH));
        inputForm.sendKeys(REQUIRED_INPUT);

        List<WebElement> elements = driver.findElements(By.cssSelector(".Qr7Oae"));
        markCaseFromOneToTen(elements.get(0));
        markCaseFromOneToTen(elements.get(1));
        markCaseFromOneToTen(elements.get(2));
        markMaxTime(elements.get(3));
        markCaseFromOneToTen(elements.get(4));
        markAllIsOk(elements.get(8));
        markAllIsOk(elements.get(9));
        markAllIsOk(elements.get(10));
        markAllIsOk(elements.get(11));
//        WebElement sendButton = driver.findElement(By.cssSelector(SEND_BUTTON_CLASS));
//        sendButton.click();
//        driver.close();
    }

    private static void markAllIsOk(WebElement webElement) {
        List<WebElement> markersSec = webElement.findElements(By.cssSelector(".nWQGrd.zwllIb"));
        WebElement marker = markersSec.get(0);
        marker.click();
    }

    private static void markCaseFromOneToTen(WebElement webElement) {
        List<WebElement> points = webElement.findElements(By.cssSelector(".T5pZmf"));
        WebElement highestPoint = points.get(points.size() - 1);
        highestPoint.click();
    }

    private static void markMaxTime(WebElement webElement) {
        List<WebElement> markers = webElement.findElements(By.cssSelector(".nWQGrd.zwllIb"));
        WebElement marker = markers.get(markers.size() - 1);
        marker.click();
    }
}