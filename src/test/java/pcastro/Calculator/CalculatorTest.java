package pcastro.Calculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith (JUnitParamsRunner.class)
public class CalculatorTest {
	@Test
	@Parameters ({"1+2+3, 6", "1-1+1, 1", "-2-2-2, -4", "3, 3", "-3, -3", "5-5, 0"})
	//Arrumar testes parametrizados
	public CalculatorTest(String val, int resp) {
		Calculator c = new Calculator();
		int observed = c.evaluate(val);
		assertEquals(observed, resp);
	}
}
