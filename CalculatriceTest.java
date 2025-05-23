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
}
