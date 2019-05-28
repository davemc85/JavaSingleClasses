import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    private WaterBottle waterBottle;

    @Before
    public void before() {
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void hasVolume(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void volumeDecreasesAsDrinkTaken(){
        waterBottle.takeDrink();
        assertEquals(90, waterBottle.getVolume());
    }

    @Test
    public void volumeDecreasesLotsAsMoreDrinkTaken(){
        waterBottle.takeDrink();
        waterBottle.takeDrink();
        waterBottle.takeDrink();
        waterBottle.takeDrink();
        assertEquals(60, waterBottle.getVolume());
    }

    @Test
    public void volumeZeroWhenItsEmpty(){
        waterBottle.emptyBottle();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void volumeFullWhenItsFilled(){
        waterBottle.emptyBottle();
        waterBottle.fillBottle();
        assertEquals(100, waterBottle.getVolume());
    }
}
