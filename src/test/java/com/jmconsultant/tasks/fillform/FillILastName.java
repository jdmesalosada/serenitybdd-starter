package com.jmconsultant.tasks.fillform;

import com.jmconsultant.ui.SignUpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Enter;

public class FillILastName implements Task {

    private final String lastName;

    public FillILastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Clear.field(SignUpPage.LAST_NAME),
                Enter.theValue(lastName).into(SignUpPage.LAST_NAME));
    }
}
