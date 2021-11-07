package com.jmconsultant.tasks.fillform;

import com.jmconsultant.ui.SignUpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Enter;

public class FillEmailAddress implements Task {

    private final String emailAddress;

    public FillEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Clear.field(SignUpPage.EMAIL_ADDRESS),
                Enter.theValue(emailAddress).into(SignUpPage.EMAIL_ADDRESS));
    }
}
