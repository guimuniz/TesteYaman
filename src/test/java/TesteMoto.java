import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TesteMoto {

    Moto meiota = new Moto("preto", "XXX-3030", 1000.0, 200.0, 5.0);

    @Test
    public void testeCor(){
        Assertions.assertEquals("preto",meiota.getCor());
    }

    @Test
    public void testeVelocidadeMaxima(){
        Assertions.assertEquals(200.0,meiota.getVelocidadeMaxima());
    }

    @Test
    public void testecombustivelAcabando(){
        Assertions.assertEquals(true, meiota.combustivelAcabando());
    }
}