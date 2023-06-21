package com.sophossolutions.stepdefinitions;

import com.sophossolutions.apis.GoRestApi;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;

public class PutGoRestStepDefinitions {

    @When("se envia la informacion del usuario a modificar a traves del endpoint {string} por id {string}")
    public void seEnviaLaInformacionDelUsuarioAModificarATravesDelEndpointPorId(String endpoint, String id, DataTable userInformation) {
        GoRestApi.editInformation(endpoint, id, userInformation);
    }
    @Then("se valida que el id {string} contenga el nombre {string} y el email {string}")
    public void seValidaQueElIdContengaElNombreYElEmail(String id, String name, String email) {
        GoRestApi.validateInformationModificated(id,name,email);
    }
}
