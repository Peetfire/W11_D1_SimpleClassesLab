import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(30, 30);
    }

    @Test
    public void canAddPaper(){
        printer.addPaper(10);
        assertEquals(40, printer.getSheetsLeft());
    }

    @Test
    public void canAddToner(){
        printer.addToner(10);
        assertEquals(40, printer.getToner());
    }

    @Test
    public void isAbleToPrint(){
        printer.print(3, 10);
        assertEquals(0, printer.getSheetsLeft());
        assertEquals(0, printer.getToner());
    }

    @Test
    public void isNotAbleToPrintPaperLow(){
        printer.addToner(10);
        printer.print(3, 11);
        assertEquals(40, printer.getToner());
        assertEquals(30, printer.getSheetsLeft());
    }

    @Test
    public void isNotAbleToPrintTonerLow(){
        printer.addPaper(10);
        printer.print(3, 11);
        assertEquals(40, printer.getSheetsLeft());
        assertEquals(30, printer.getToner());
    }




}
