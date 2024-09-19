package co.sofka.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/buy_golden_retriever_dog.feature", glue = "co.sofka", snippets = SnippetType.CAMELCASE)
public class BuyGoldenDogRunner {
}
