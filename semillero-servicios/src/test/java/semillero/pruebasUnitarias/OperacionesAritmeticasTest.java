package semillero.pruebasUnitarias;



import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import junit.framework.Assert;
import org.junit.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class OperacionesAritmeticasTest {

    /**
     * Constante que contendra el log de la clase AritmeticaTest
     */
   private final static Logger log = Logger.getLogger(OperacionesAritmeticasTest.class);


   @BeforeTest
   public void inicializar() {
        BasicConfigurator.configure();//Inicializar el logger con una configuracion basica
        log.info(":::::::::::::: INICIAR PRUEBAS UNITARIAS ::::::::::::::::");
   }

   @Test
   public void validarResultadoSumaExitoso(){
       log.info("Inicia ejecuacion del metodo validarResultadoSumaExitoso()");

       int numero1 = 300;
       int numero2 = 150;
       int resultado =450;

      // Assert.assertFalse(condition);
      // Assert.assertTrue(condition);
       Assert.assertEquals(resultado, numero1+numero2);
       log.info("Finaliza**  ejecuacion del metodo validarResultadoSumaExitoso()");


   }




}
