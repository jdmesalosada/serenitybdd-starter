package com.jmconsultant.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignUpPage {

    public static final Target NAME = Target
            .the("name")
            .located(By.xpath("//input[@ng-model='FirstName']"));

    public static final Target LAST_NAME = Target
            .the("last name")
            .located(By.xpath("//input[@ng-model='LastName']"));

    public static final Target ADDRESS = Target
            .the("address")
            .located(By.xpath("//textarea[@ng-model='Adress']"));

    public static final Target EMAIL_ADDRESS = Target
            .the("email address")
            .located(By.xpath("//input[@ng-model='EmailAdress']"));

    public static final Target PHONE = Target
            .the("phone")
            .located(By.xpath("//input[@ng-model='Phone']"));
}
