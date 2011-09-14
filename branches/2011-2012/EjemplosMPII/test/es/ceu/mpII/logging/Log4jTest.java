package es.ceu.mpII.logging;

import org.apache.log4j.Logger;
import org.junit.Test;

public class Log4jTest {


    @Test
    public void testDeLogging() {
        Logger logger = Logger.getLogger("com.foo");
        Logger barlogger = Logger.getLogger("com.foo.Bar");


        logger.debug("mensaje de debug");
        barlogger.info("mensaje info");
        logger.warn("mensaje warning");
        barlogger.error("mensaje error");
    }
}