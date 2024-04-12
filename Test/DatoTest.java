import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;


public class DatoTest {

    @Test
    @DisplayName("Identificador objetos")
    public void referenciasObjetosSingleton(){

      Dato dato1 = Dato.getInstance();
      Dato dato2 = Dato.getInstance();
        Assert.assertSame(dato1, dato2);

   }

}
