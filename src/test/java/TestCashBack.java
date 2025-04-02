import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.mirea.CashBack;

public class TestCashBack {

    @Test
    public void shouldCheckSubscribedUnderLimit () {
        CashBack cashBack = new CashBack();

        int actual = cashBack.cashBackCalculation(1000,true);
        int expected = 100;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldCheckUnsubscribedUnderLimit () {
        CashBack cashBack = new CashBack();

        int actual = cashBack.cashBackCalculation(1000,false);
        int expected = 50;//50 right value

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldCheckUnsubscribedBoundaryTest () {
        CashBack cashBack = new CashBack();

        int actual = cashBack.cashBackCalculation(20000,false);
        int expected = 1000;

        Assertions.assertEquals(expected,actual);
    }


    //тесты: подписанные выше лимита, неподписанные выше лимита
    //тесты: подписанные граничные условия - бонус = 499, 500, 501
    //тесты: неподписанные граничные условия - бонус = 499, 500, 501
    //тесты итого: 10 тестов.

}
