package estDat.estDatLin;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ListaSETest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ListaSETest
{
    /**
     * Default constructor for test class ListaSETest
     */
    public ListaSETest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void testinsertar()
    {
        estDat.estDatLin.ListaSE<Character> listaSE1 = new estDat.estDatLin.ListaSE<Character>();
        assertEquals(true, listaSE1.vacia());
        listaSE1.insertar('A');
        listaSE1.insertar('B');
        assertEquals(true, listaSE1.vacia());
    }
}

