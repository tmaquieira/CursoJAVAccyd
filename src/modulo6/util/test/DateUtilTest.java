package modulo6.util.test;
import static org.junit.jupiter.api.Assertions.*; 
import java.util.Calendar;
import java.util.Date;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modulo6.util.DateUtil;

class DateUtilTest {
	//lote de prueba 
	Date fechaCumple;
	@BeforeEach
	void setUp() throws Exception {
		//se ejecuta antes de cada prueba
		//creo mi lote de prueba 
		Calendar cal = Calendar.getInstance();
		cal.set(1989, Calendar.JANUARY, 29);
		fechaCumple = cal.getTime();
	}

	@AfterEach
	void tearDown() throws Exception {
		//se ejecuta despu�s de cada prueba
		fechaCumple = null;
	}

	@Test
	void test() {
		assertEquals(1989, DateUtil.getAnio(fechaCumple));
		assertEquals(1, DateUtil.getMes(fechaCumple));
		assertEquals(29, DateUtil.getDia(fechaCumple));
		assertEquals(true, DateUtil.isFinDeSemana(fechaCumple));
		assertEquals(false, DateUtil.isDiaDeSemana(fechaCumple));
		assertEquals(Calendar.SUNDAY, DateUtil.getDiaDeSemana(fechaCumple));


		//fail("Not yet implemented");
	}

}
