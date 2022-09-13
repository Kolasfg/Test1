import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Simple {
    @Test
    public void example(){
        Assertions.assertFalse(0<=0);
    }
    @Test
    public void example1(){
        Assertions.assertTrue(1<4);
    }
}
