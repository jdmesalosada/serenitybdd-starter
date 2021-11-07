package com.jmconsultant.tasks.fillform;

import com.jmconsultant.ui.SignUpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Enter;

public class FillAddress implements Task {

    private final String address;

    public FillAddress(String address) {
        this.address = address;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Clear.field(SignUpPage.ADDRESS),
                Enter.theValue(address).into(SignUpPage.ADDRESS));
    }
}
