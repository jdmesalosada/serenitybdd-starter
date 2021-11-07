package com.jmconsultant.tasks.fillform;

import com.jmconsultant.ui.SignUpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Enter;

public class FillName implements Task {

    private final String name;

    public FillName(String name) {
        this.name = name;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Clear.field(SignUpPage.NAME),
                Enter.theValue(name).into(SignUpPage.NAME));
    }

}
