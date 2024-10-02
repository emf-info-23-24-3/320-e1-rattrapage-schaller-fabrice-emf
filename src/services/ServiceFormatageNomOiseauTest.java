package services;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ServiceFormatageNomOiseauTest {
    ServiceFormatageNomOiseau sfno = new ServiceFormatageNomOiseau();

    @Test
    public void testFormatterNomOiseau() {
        assertEquals("entrée incorrecte", sfno.formatterNomOiseau(null));
        assertEquals("entrée incorrecte", sfno.formatterNomOiseau(""));
        assertEquals("entrée incorrecte", sfno.formatterNomOiseau("OiseauTest"));
        assertEquals("entrée incorrecte", sfno.formatterNomOiseau("Oiseau_Test"));
        assertEquals("oiseau_test".toLowerCase(), sfno.formatterNomOiseau("Oiseau Test"));

    }
}
