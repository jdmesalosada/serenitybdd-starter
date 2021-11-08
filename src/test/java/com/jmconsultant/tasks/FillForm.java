package com.jmconsultant.tasks;

import com.jmconsultant.ui.SignUpPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Enter;

public class FillForm {

    public static Performable name(String name) {
        return Task.where("{0} enters name '" + name + "'",
                Clear.field(SignUpPage.NAME),
                Enter.theValue(name).into(SignUpPage.NAME));
    }

    public static Performable lastName(String lastName) {
        return Task.where("{0} enters last name '" + lastName + "'",
                Clear.field(SignUpPage.LAST_NAME),
                Enter.theValue(lastName).into(SignUpPage.LAST_NAME));
    }

    public static Performable address(String address) {
        return Task.where("{0} enters address '" + address + "'",
                Clear.field(SignUpPage.ADDRESS),
                Enter.theValue(address).into(SignUpPage.ADDRESS));
    }

    public static Performable emailAddress(String emailAddress) {
        return Task.where("{0} enters email address '" + emailAddress + "'",
                Clear.field(SignUpPage.EMAIL_ADDRESS),
                Enter.theValue(emailAddress).into(SignUpPage.EMAIL_ADDRESS));
    }

    public static Performable phone(String phone) {
        return Task.where("{0} enters phone '" + phone +  "'",
                Clear.field(SignUpPage.PHONE),
                Enter.theValue(phone).into(SignUpPage.PHONE));
    }
}
