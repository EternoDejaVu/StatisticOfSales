import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test
    public void ShouldFindMinSale() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 9;
        int actualDay = service.MinSales(sales);
        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void ShouldFindMaxSale() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 8;
        int actualDay = service.MaxSales(sales);
        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void ShouldFindSumOfSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.sumOfSales(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void ShouldFindMiddleSumOfSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 15;
        int actualSum = service.middleSumOfSales(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void ShouldFindUnderTheMiddleOfSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAmount = 5;
        int actualAmount = service.UnderTheMidOfSales(sales);
        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void ShouldFindOverTheMiddleOfSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAmount = 5;
        int actualAmount = service.OverTheMidOfSales(sales);
        Assertions.assertEquals(expectedAmount, actualAmount);
    }
}
