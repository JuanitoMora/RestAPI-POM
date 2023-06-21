package com.sophossolutions.stepdefinitions;

import com.sophossolutions.apis.GoRestApi;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GetGoRestStepDefinitions {

    @Given("se establece la base url {string}")
    public void seEstableceLaBaseUrl(String baseURL) {
        GoRestApi.setBaseUrl(baseURL);
    }

    @When("se consulta en el endpoint {string} por id {string}")
    public void seConsultaEnElEndpointPorId(String endpoint, String idUser) {
        GoRestApi.executionGetToken(endpoint, idUser);
    }

    @Then("se valida que el status code sea {int} y contenga el nombre {string}")
    public void seValidaQueElStatusCodeSeaYContengaElNombre(Integer statusCode, String name) {
        GoRestApi.validateResponse(statusCode, name);
    }
}
