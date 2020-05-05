import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TesteCarro {

    Carro fusca = new Carro("vermelho", "gol", 100.0, 70.0);

    @Test
    public void testeLigaedesliga(){
        Assertions.assertEquals("O carro foi desligado", fusca.ligaedesliga());
        Assertions.assertEquals("O carro foi ligado", fusca.ligaedesliga());
    }
}