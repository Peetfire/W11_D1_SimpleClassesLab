import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle myBottle;

    @Before
    public void before(){
        myBottle = new WaterBottle();
    }

    @Test
    public void hasStartVolume(){
        assertEquals(100, myBottle.getVolume());
    }

    @Test
    public void hasDrink(){
        myBottle.drink();
        myBottle.drink();
        myBottle.drink();
        myBottle.drink();
        assertEquals(60, myBottle.getVolume());
    }
}
