import org.ProjetoMediator.Membro;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MembroTest {

    @Test
    public void testAcessoAcademia() {
        Membro membro = new Membro();
        String resultado = membro.acessarAcademia("12345");
        assertEquals("Acesso autorizado para o membro: 12345", resultado);
    }
}