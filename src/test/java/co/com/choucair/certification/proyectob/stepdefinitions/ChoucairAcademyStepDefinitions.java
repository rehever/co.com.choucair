package co.com.choucair.certification.proyectob.stepdefinitions;

import co.com.choucair.certification.proyectob.model.DataModel;
import co.com.choucair.certification.proyectob.questions.AnswerCheckout;
import co.com.choucair.certification.proyectob.questions.AnswerPayment;
import co.com.choucair.certification.proyectob.tasks.*;
import co.com.choucair.certification.proyectob.userinterface.FillUserData;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Michael wants to shop in New Experience$")
    public void thanMichaelWantsToShopInNewExperience() {
        OnStage.theActorCalled("Michael").wasAbleTo(OpenThe.shopPage());
    }

    @When("^he search for new clothes for him$")
    public void heSearchForNewClothesForHim() {
        OnStage.theActorInTheSpotlight().attemptsTo(LooksFor.shirtsClothes(),
                AddToCart.shirtsCart(),
                ModifyTShirt.shirtsModify());
    }

    @When("^he buys products at two sections and registers to do the full checkout$")
    public void heBuysProductsAtTwoSectionsAndRegistersToDoTheFullCheckout(List<DataModel> dataModel ) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(LooksFor.shirtsClothes(),
                AddToCart.shirtsCart(),
                ModifyTShirt.shirtsModify(),
                WomenSection.womenClothes(),
                LooksForClothes.womenBlouse(),
                ModifyWomenClothes.womenModify(),
                DeleteProduct.andCheckout(),
                FillEmailUser.toRegisterUser(),
                FillUserData.inFields(dataModel.get(0).getStrName(),
                        dataModel.get(0).getStrLastName(),
                        dataModel.get(0).getStrPassword(),
                        dataModel.get(0).getStrAddress(),
                        dataModel.get(0).getStrCity(),
                        dataModel.get(0).getStrState(),
                        dataModel.get(0).getStrZIP(),
                        dataModel.get(0).getStrPhone()),
                ConfirmAddress.GoToCheckout(),
                ConfirmShipping.goToShipping(),
                ConfirmPay.payByCheck(),
                FinalPay.confirmOrder());
    }

    @Then("^he successfully add a new product at the checkout$")
    public void heSuccessfullyAddANewProductAtTheCheckout(List<DataModel> dataModel ) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerCheckout.
                answerCheckout(dataModel.get(0).getStrAnswer())));
    }

    @Then("^he does a successfully payment$")
    public void heDoesASuccessfullyPayment(List<DataModel> dataModel ) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerPayment.
                answerPayment(dataModel.get(0).getStrAnswer2())));
    }
}
