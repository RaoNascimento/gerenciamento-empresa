package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import utilitarios.Funcoes;

import java.io.IOException;
import java.util.Properties;

import static org.junit.Assert.assertEquals;

public class HealthCheckStepDef {
    Properties properties;
    String environment;

    String baseUrl;
    Response response;

    public HealthCheckStepDef() throws IOException {
        properties = Funcoes.getProperties();
        environment = Funcoes.getEnvironment();
    }

    @Given("^que eu quero executar um servico no ambiente$")
    public void que_eu_quero_executar_um_servico_no_ambiente() {
        baseUrl = properties.getProperty("prop.server.host." + environment);
    }

    @When("^envio a solicitacao GET$")
    public void envio_a_solicitacao_GET() {
        String url = baseUrl + "/health";
        System.out.printf("GET %s%n", url);
        response = RestAssured.given().when().relaxedHTTPSValidation().get(url);
    }

    @Then("^valido o codigo de status (\\d+)$")
    public void valido_o_codigo_de_status(int statuscode) {
        assertEquals(statuscode, response.getStatusCode());
    }
}
