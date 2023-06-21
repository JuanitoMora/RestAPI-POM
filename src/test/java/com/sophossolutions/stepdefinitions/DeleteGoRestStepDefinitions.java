package com.sophossolutions.stepdefinitions;

import com.sophossolutions.apis.GoRestApi;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;

public class DeleteGoRestStepDefinitions {

    @When("se consulta en el endpoint {string} el usuario a eliminar por id {string}")
    public void seConsultaEnElEndpointElUsuarioAEliminarPorId(String endpoint, String id, DataTable userID) {
        GoRestApi.deleteInformation(endpoint, id, userID);
    }
    @Then("se valida que el status code sea {int}")
    public void seValidaQueElStatusCodeSea(Integer statusCode) {
        GoRestApi.validateStatusDelete(statusCode);
    }
}
