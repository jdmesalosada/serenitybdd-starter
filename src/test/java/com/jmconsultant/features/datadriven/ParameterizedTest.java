package com.jmconsultant.features.datadriven;

import com.jmconsultant.conf.BaseConf;
import com.jmconsultant.tasks.FillForm;
import com.jmconsultant.tasks.NavigateTo;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "testdata/users.csv")
public class ParameterizedTest extends BaseConf {

    private String name;
    private String lastName;
    private String address;
    private String phone;
    private String emailAddress;

    @Before
    public void navigate() {
        actor.attemptsTo(
                NavigateTo.signUpPage()
        );
    }

    @Test
    public void should_userSignUpSuccesfully_When_She_FillTheForm() {
        actor.attemptsTo(
                FillForm.name(name),
                FillForm.phone(phone),
                FillForm.lastName(lastName),
                FillForm.emailAddress(emailAddress),
                FillForm.address(address)
        );

    }

}
