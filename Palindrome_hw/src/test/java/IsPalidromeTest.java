import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class IsPalidromeTest {
    @Test
    void evenTest (){
        assumeTrue(IsPalindrome.isPalindrome("abba"));
    }
    @Test
    void oddTest (){
        assumeTrue(IsPalindrome.isPalindrome("aba"));
    }
    @Test
    void spacerTest (){
        assumeTrue(IsPalindrome.isPalindrome("a aab a aa"));
    }
    @Test
    void notPalindromeSpacerTest (){
        assumeFalse(IsPalindrome.isPalindrome("a aab a a"));
    }
    @Test
    void notPalindromeBasicTest (){
        assumeFalse(IsPalindrome.isPalindrome("abc"));
    }
    @Test
    void uppercaseTest (){
        assumeTrue(IsPalindrome.isPalindrome("aBbA"));
    }
}
