
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
public class StatistiqueTest {
    @MockBean
    Statistique Statistique;

    public void avecMokito()throws Exception{
        Statistique stat = new Statistique();
        Calculatrice calculatrice = mock(Calculatrice.class);
        when(calculatrice.add()).thenReturn(20);
        when(calculatrice.div()).thenReturn(10);
        float resultat = stat.moyenne(10,10);
        assertEquals(10, resultat);
    }
}
