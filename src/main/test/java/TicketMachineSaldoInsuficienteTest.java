import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TicketMachineSaldoInsuficienteTest {

    private TicketMachine ticketMachine;

    @Before
    public void setUp() {
        ticketMachine = new TicketMachine(5);
    }

    @Test(expected = SaldoInsuficienteException.class)
    public void testCompraComSaldoInsuficiente() throws SaldoInsuficienteException {
        ticketMachine.inserir(2);

        ticketMachine.imprimir();
    }
}
