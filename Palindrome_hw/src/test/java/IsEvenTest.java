import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class IsEvenTest {
    @Test
    void basicTest (){
        assumeTrue((IsEven.isEven(8)));
    }
        @Test
        void notEvenTest (){
            assumeFalse((IsEven.isEven(7)));
    }
        @Test
        void negativeValueTest (){
            assumeTrue((IsEven.isEven(-10)));
        }
    @Test
    void negativeNotEvenValueTest (){
        assumeFalse((IsEven.isEven(-3)));
    }
    @Test
    void zeroValueTest (){
        assumeFalse((IsEven.isEven(0)));
    }
}
