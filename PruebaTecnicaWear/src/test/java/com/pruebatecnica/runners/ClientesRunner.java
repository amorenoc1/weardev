package com.pruebatecnica.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/clientes.feature",
        glue = "com.pruebatecnica.stepsdefinitions",
        plugin = {"pretty"},
        snippets =CucumberOptions.SnippetType.CAMELCASE,
        tags ="",
        dryRun = false
)
public class ClientesRunner {
}
