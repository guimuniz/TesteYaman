import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TesteCarro {

    Carro Armindo = new Carro("vermelho", "gol_bolinha", 100.0, 70.0);

    @Test
    public void testeModelo(){
        Assertions.assertEquals("gol_bolinha",Armindo.getModelo());
    }

    @Test
    public void testeCor(){
        Assertions.assertEquals("vermelho",Armindo.getCor());
    }

    @Test
    public void testeVelocidadeMaxima(){
        Assertions.assertEquals(100.0,Armindo.getVelocidadeMaxima());
    }
}