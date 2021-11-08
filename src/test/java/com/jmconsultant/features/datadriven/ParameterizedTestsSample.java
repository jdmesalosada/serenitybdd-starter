package com.jmconsultant.features.datadriven;

import com.jmconsultant.models.User;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Narrative;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTagValuesOf;

import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "testdata/users.csv")
@Narrative(text = {"In order to ....",
        "As a ....",
        "I want to be able to ...."})
@WithTag("login")
public class ParameterizedTestsSample {

    private String name;
    private String lastName;
    private String address;
    private String phone;
    private String emailAddress;

    @Test
    @WithTagValuesOf({"smoke"})
    public void fillForm() {

        System.out.println(name);
        System.out.println(lastName);

    }
}
