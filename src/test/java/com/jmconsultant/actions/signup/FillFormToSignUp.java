package com.jmconsultant.actions.signup;

import com.jmconsultant.models.User;
import com.jmconsultant.ui.SignUpPage2;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class FillFormToSignUp extends UIInteractionSteps {

    private String actor;

    @Step("#actor enters first name {0}")
    public void entersFirsName(String firstName) {
        $(SignUpPage2.NAME).clear();
        $(SignUpPage2.NAME)
                .sendKeys(firstName);
    }

    @Step("#actor enters user information {0}")
    public void withInfo(User user) {
        $(SignUpPage2.NAME).clear();
        $(SignUpPage2.NAME)
                .sendKeys(user.getName());

        $(SignUpPage2.PHONE).clear();
        $(SignUpPage2.PHONE).sendKeys(user.getPhone());
    }
}
