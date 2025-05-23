import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatriceTest {
    private Calculatrice calculatrice;
    @BeforeEach
    void SetUp(){
        calculatrice = new Calculatrice();
    }


    @Test
    public void TestAddition(){
      float resultat = calculatrice.add(2,3);
      assertEquals(5,resultat);
    }
    @Test
    public void TestDivision(){
        float resulat = calculatrice.div(10,2);
        assertEquals(5,resulat);
    }
    @Test
    public void TestMult(){
        float resultat = calculatrice.mult(6,2);
        assertEquals(12,resultat);
    }
    @Test
    public void TestSoustraction(){
        float resultat = calculatrice.minus(5,5);
        assertEquals(0,resultat);
    }
    @Test
    public void TestSoustraction2(){
        float resultat = calculatrice.minus(5,7);
        assertEquals(-2,resultat);
    }
}
