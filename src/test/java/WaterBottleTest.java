import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    private WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle(100, 100, 10);
    }


    @Test
    public void getVolume(){
        assertEquals(100, waterBottle.getVolume());
    }


    @Test
    public void drinkWaterPossible(){
        assertEquals(90, waterBottle.drinkWater(100));
    }

    @Test
    public void drinkWaterNotPossible(){
        waterBottle = new WaterBottle(7, 7, 10);
        assertEquals(100, waterBottle.drinkWater(7));
    }


    @Test
    public void emptyWaterBottle(){
        assertEquals(0, waterBottle.emptyWaterBottle(100), 0.001);
    }


    @Test
    public void fillWaterBottle(){
        waterBottle = new WaterBottle(7, 7, 10);
        assertEquals(100, waterBottle.fillWaterBottle(0), 0.001);
    }
}

