package com.jmconsultant.ui;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

public class SignUpPage2 extends PageObject {

    public static By NAME = By.xpath("//input[@ng-model='FirstName']");

    public static By LAST_NAME = By.xpath("//input[@ng-model='LastName']");

    public static By ADDRESS = By.xpath("//textarea[@ng-model='Adress']");

    public static By EMAIL_ADDRESS = By.xpath("//input[@ng-model='EmailAdress']");

    public static By PHONE = By.xpath("//input[@ng-model='Phone']");
}
