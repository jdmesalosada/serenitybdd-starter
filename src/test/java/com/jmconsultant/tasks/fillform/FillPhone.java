package com.jmconsultant.tasks.fillform;

import com.jmconsultant.ui.SignUpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Enter;

public class FillPhone implements Task {

    private final String phone;

    public FillPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Clear.field(SignUpPage.PHONE),
                Enter.theValue(phone).into(SignUpPage.PHONE));
    }

}
