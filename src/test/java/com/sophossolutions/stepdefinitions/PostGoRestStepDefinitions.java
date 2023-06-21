package com.sophossolutions.stepdefinitions;

import com.sophossolutions.apis.GoRestApi;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;

public class PostGoRestStepDefinitions {
    @When("se envia la informacion del usuario a traves del endpoint {string}")
    public void seEnviaLaInformacionDelUsuarioATravesDelEndpoint(String endpoint, DataTable userInformation) {
        GoRestApi.executionPostToken(endpoint, userInformation);
    }
}
