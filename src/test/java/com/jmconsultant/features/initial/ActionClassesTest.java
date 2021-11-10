package com.jmconsultant.features.initial;

import com.jmconsultant.actions.navigate.NavigateToPage;
import com.jmconsultant.actions.signup.FillFormToSignUp;
import com.jmconsultant.models.User;
import com.jmconsultant.tasks.NavigateTo;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class ActionClassesTest {

    @Managed
    WebDriver driver;

    @Steps(actor = "juliancho")
    FillFormToSignUp fillFormToSignUp;

    @Steps(actor = "john wick")
    NavigateToPage navigateToPage;

    @Test
    public void fillSignUpFormTest(){
        navigateToPage.signUp();
        fillFormToSignUp
                .entersFirsName("juliancho");
    }

    @Test
    public void fillSignUpFormTest2(){

        User user = new User();
        user.setPhone("435435");
        user.setName("pepito");

        navigateToPage.signUp();
        fillFormToSignUp
                .withInfo(user);
    }
}
