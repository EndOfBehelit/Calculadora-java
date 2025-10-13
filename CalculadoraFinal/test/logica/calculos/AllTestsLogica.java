package logica.calculos;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("Suite para todas las pruebas de lógica.")
@SelectClasses({ 
	PulsarIgualTest.class,
	PulsarNumeroTest.class,
	PulsarOperacionTest.class,
	PulsarPuntoTest.class 
})

public class AllTestsLogica {

}
