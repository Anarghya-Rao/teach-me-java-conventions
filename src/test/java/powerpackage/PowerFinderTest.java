package powerpackage;


import org.junit.Test;

public class PowerFinderTest {
    @Test
    public void oneRaisedToPowerOneIsOne() {
        assert PowerFinder.power(1,1) == 1;
    }

    @Test
    public void twoRaisedToPowerOneIsTwo() {
        assert PowerFinder.power(2,1) == 2;
    }

    @Test
    public void twoRaisedToPowerTwoIsFour() {
        assert PowerFinder.power(2, 2) == 4;
    }

    @Test
    public void threeRaisedToPowerTwoIsNine() {
        assert PowerFinder.power(3, 2) == 9;
    }
}
