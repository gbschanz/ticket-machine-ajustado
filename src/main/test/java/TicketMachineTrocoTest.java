import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TicketMachineTrocoTest {

    private TicketMachine ticketMachine;

    @Before
    public void setUp() {
        ticketMachine = new TicketMachine(5);
    }

    @Test
    public void testTrocoAposCompra() throws SaldoInsuficienteException {
        ticketMachine.inserir(20);

        ticketMachine.imprimir();

        int troco = ticketMachine.getTroco();

        assertEquals(15, troco);
    }
}
