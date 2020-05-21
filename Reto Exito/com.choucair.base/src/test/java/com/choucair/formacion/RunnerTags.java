package com.choucair.formacion;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
//@CucumberOptions (features = "src/test/resources/features/", tags = "@SmokeTest")
//@CucumberOptions (features = "src/test/resources/features/exito.feature", tags = "@registrarDemo")
//@CucumberOptions (features = "src/test/resources/features/exito.feature", tags = "@ErrorNombre")
@CucumberOptions (features = "src/test/resources/features/exito.feature", tags = "@CasoExito")
public class RunnerTags {

}
