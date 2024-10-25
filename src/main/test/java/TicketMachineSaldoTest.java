import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TicketMachineSaldoTest {

    private TicketMachine ticketMachine;

    @Before
    public void setUp() {
        ticketMachine = new TicketMachine(5);
    }

    @Test
    public void testInserirMultiplosValores() {
        ticketMachine.inserir(5);
        ticketMachine.inserir(10);

        assertEquals(15, ticketMachine.getSaldo());
    }
}
