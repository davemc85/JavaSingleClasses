import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer printer;

    @Before
    public void before(){
        printer = new Printer(250, 1000);
    }

    @Test
    public void hasPaper(){
        assertEquals(250, printer.getPaper());
    }

    @Test
    public void hasToner(){
        assertEquals(1000, printer.getToner());
    }

    @Test
    public void testPrintPaper(){
        printer.print(10,5);
        assertEquals(200, printer.getPaper());
    }

    @Test
    public void testPrintToner(){
        printer.print(10,5);
        assertEquals(950, printer.getToner());
    }

    @Test
    public void testNoPrint(){
        printer.print(10,100);
//        assertEquals(250, printer.getPaper());
        assertEquals("Print Job Failed", printer.print(10, 100));
    }


}
