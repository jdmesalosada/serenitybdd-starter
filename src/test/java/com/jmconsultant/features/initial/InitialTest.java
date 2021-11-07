package com.jmconsultant.features.initial;

import com.jmconsultant.conf.BaseConf;
import com.jmconsultant.tasks.FillForm;
import com.jmconsultant.tasks.NavigateTo;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Narrative;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
@Narrative(text = {"In order to ....",
        "As a ....",
        "I want to be able to ...."})
@WithTag("login")
public class InitialTest extends BaseConf {

    @Before
    public void navigate() {
        actor.attemptsTo(
                NavigateTo.signUpPage());
    }

    @Test
    @WithTagValuesOf({"smoke"})
    public void should_UserSignUpSuccessfully_When_HeSendsCompleteInformation() {

        actor.attemptsTo(
                FillForm.name("John"),
                FillForm.lastName("Wick"),
                FillForm.address("cra 89 N 45-34"),
                FillForm.emailAddress("johnwick@gmail.com"),
                FillForm.phone("5799033")
        );
    }
}











