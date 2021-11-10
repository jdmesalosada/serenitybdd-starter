package com.jmconsultant.actions.navigate;

import com.jmconsultant.ui.SignUpPage2;
import net.thucydides.core.annotations.Step;

public class NavigateToPage {

    private String actor;
    SignUpPage2 signUpPage2;

    @Step("#actor navigates to signup page")
    public void signUp(){
        signUpPage2.open();
    }
}
