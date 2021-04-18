
package pepsico.servicos;

import javax.ejb.embeddable.EJBContainer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class RelatorioGestaoRiscoTest {
    
    public RelatorioGestaoRiscoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of geraRelatorio method, of class RelatorioGestaoRisco.
     */
    @Test
    public void testGeraRelatorio() throws Exception {
        System.out.println("geraRelatorio");
        String tipo = "";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        RelatorioGestaoRiscoLocal instance = (RelatorioGestaoRiscoLocal)container.getContext().lookup("java:global/classes/RelatorioGestaoRisco");
        int expResult = 0;
        int result = instance.geraRelatorio(tipo);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
