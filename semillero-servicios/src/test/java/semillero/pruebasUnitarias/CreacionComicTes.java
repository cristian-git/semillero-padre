package semillero.pruebasUnitarias;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeTest;

public class CreacionComicTes {

    /**
     * Constante que contendra el log de la clase AritmeticaTest
     */
    private final static Logger log = Logger.getLogger(OperacionesAritmeticasTest.class);


    @BeforeTest
    public void inicializar() {
        BasicConfigurator.configure();//Inicializar el logger con una configuracion basica
        log.info(":::::::::::::: INICIAR PRUEBAS UNITARIAS ::::::::::::::::");
    }

    

}
