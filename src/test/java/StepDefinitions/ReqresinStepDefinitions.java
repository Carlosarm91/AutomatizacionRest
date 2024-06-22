package StepDefinitions;

import interactions.GetRest;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import questions.CodigoEstado;

public class ReqresinStepDefinitions {

  @Before
  public void before() {
    OnStage.setTheStage(new OnlineCast());
  }

  @Given("que me encuentro con la URI de reqres")
  public void queMeEncuentroConLaURIDeReqres() {
    OnStage.theActorCalled("").whoCan(CallAnApi.at("https://reqres.in/"));
  }

  @When("realice el GET del servicio")
  public void realiceElGETDelServicio() {
    OnStage.theActorInTheSpotlight()
            .attemptsTo(
                    GetRest.on()
            );
  }

  @Then("validare que el codigo del estado del servicio final sea {int}")
  public void validareQueElCodigoDelEstadoDelServicioFinalSea(Integer estado) {
    OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CodigoEstado.delServicio(estado)));
  }
}
