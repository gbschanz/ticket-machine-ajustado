import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TicketMachineCompraTest {

    private TicketMachine ticketMachine;

    @Before
    public void setUp() {
        ticketMachine = new TicketMachine(5);
    }

    @Test
    public void testCompraComSaldoSuficiente() throws SaldoInsuficienteException {
        ticketMachine.inserir(10);

        assertEquals(10, ticketMachine.getSaldo());

        String bilhete = ticketMachine.imprimir();

        assertNotNull(bilhete);
        assertEquals(5, ticketMachine.getSaldo());
    }
}
