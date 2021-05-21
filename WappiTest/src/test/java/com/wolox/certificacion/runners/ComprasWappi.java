package com.wolox.certificacion.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(features = "src/test/resources/features/compras_wappi.feature",
        glue = "com.wolox.certificacion.stepsdefinitions",
        tags = "@compra_sin_cupon, @compra_con_cupon, @consulta_pedidos",
        snippets = SnippetType.CAMELCASE)

public class ComprasWappi {
}
