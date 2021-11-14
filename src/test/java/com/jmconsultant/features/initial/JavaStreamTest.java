package com.jmconsultant.features.initial;

import com.jmconsultant.models.Datum;
import com.jmconsultant.models.UsersResponse;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

@RunWith(SerenityRunner.class)
public class JavaStreamTest extends PageObject {

    static Predicate<Datum> lastNameStartsWithF = user -> user.getLastName().startsWith("F");

    private static Predicate<Datum> lastNameStartsWith(String letter) {
        return user -> user.getLastName().startsWith(letter);
    }

    @Test
    public void lambdaTest() {
        UsersResponse usersResponse = SerenityRest
                .given()
                .get("https://reqres.in/api/users?page=2")
                .as(UsersResponse.class);

        List<String> usersTrasnformed = new ArrayList<>();

        usersResponse.getData()
                .forEach(user -> usersTrasnformed.add(user.getLastName()));

        for (Datum user : usersResponse.getData()) {
            System.out.println(user.getLastName());
        }
    }

    @Test
    public void streamFilterTest() {
        UsersResponse usersResponse = SerenityRest
                .given()
                .get("https://reqres.in/api/users?page=2")
                .as(UsersResponse.class);

        List<Datum> usersFiltered = usersResponse.getData()
                .stream()
                .filter(user -> user.getId() >= 10)
                .collect(Collectors.toList());

        usersFiltered.forEach(user -> System.out.println(user.getId()));

    }

    @Test
    public void streamPredicateTest() {

        UsersResponse usersResponse = SerenityRest
                .given()
                .get("https://reqres.in/api/users?page=2")
                .as(UsersResponse.class);

        List<Datum> usersFiltered = usersResponse.getData()
                .stream()
                .filter(lastNameStartsWith("E"))
                .collect(Collectors.toList());

        usersFiltered.forEach(user -> System.out.println(user.getLastName()));
    }

    @Managed
    WebDriver browser;

    @Test
    public void streamMapTest(){

        OnStage.setTheStage(new OnlineCast());
        Actor actor = theActorCalled("John Wick");
        actor.can(BrowseTheWeb.with(browser));

        By elementContainer = By.xpath("//div[contains(@class, 'payment-data-group payment-data-group-normal')]//div[@class='payment-data-title']");

        actor.attemptsTo(
                Open.url("https://www.mercadolibre.com.co/")
        );

        List<String> textFromElements = findAll(elementContainer)
                .stream()
                .map(WebElementFacade::getText)
                .collect(Collectors.toList());

        textFromElements.forEach(System.out::println);

    }

}
