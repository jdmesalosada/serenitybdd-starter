package com.jmconsultant.features.datadriven;

import com.jmconsultant.conf.BaseConf;
import com.jmconsultant.tasks.FillForm;
import com.jmconsultant.tasks.NavigateTo;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Narrative;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTagValuesOf;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "testdata/users.csv")
@Narrative(text = {"In order to ....",
        "As a ....",
        "I want to be able to ...."})
@WithTag("login")
public class ParameterizedTestsSample extends BaseConf {

    private String name;
    private String lastName;
    private String address;
    private String phone;
    private String emailAddress;

    @Before
    public void navigate() {
        actor.attemptsTo(
                NavigateTo.signUpPage());
    }

    @Test
    @WithTagValuesOf({"smoke"})
    public void should_UserSignUpSuccessfully_When_HeSendsCompleteInformation() {
        actor.attemptsTo(
                FillForm.name(name),
                FillForm.lastName(lastName),
                FillForm.address(address),
                FillForm.emailAddress(emailAddress),
                FillForm.phone(phone)
        );
    }
}
