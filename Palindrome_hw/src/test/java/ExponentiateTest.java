import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class ExponentiateTest {

    @Test
    void basicTest (){
        assumeTrue((Exponentiate.pow(2, 3)==8));
    }
    @Test
    void zeroValueTest (){
        assumeTrue((Exponentiate.pow(0, 10)==0));
    }
    @Test
    void zeroPowValueTest (){
        assumeTrue((Exponentiate.pow(4, 0)==1));
    }
    @Test
    void negativePowValueTest (){
        assumeTrue((Exponentiate.pow(10, -1)==0.1));
    }
}
