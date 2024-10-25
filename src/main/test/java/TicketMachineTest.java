import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TicketMachineTest {

    private TicketMachine ticketMachine;

    @Before
    public void setUp() {
        ticketMachine = new TicketMachine(5);
    }

    @Test
    public void testInserirValorCorretamente() {
        ticketMachine.inserir(5);
        assertEquals(5, ticketMachine.getSaldo());
    }

    @Test(expected = PapelMoedaInvalidaException.class)
    public void testInserirValorInvalido() throws PapelMoedaInvalidaException {
        ticketMachine.inserir(3);
    }
}
