import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.mirea.CashBack;

public class TestParameterizedCashBack {

    @ParameterizedTest
    @CsvSource(value = {"1000,true,100","1000,false,50","20000,false,1000"})
    public void shouldCheckAllConditions (int purchaseSum, boolean ifRegistered, int expected) {
        CashBack cashBack = new CashBack();
        int actual = cashBack.cashBackCalculation(purchaseSum,ifRegistered);
        Assertions.assertEquals(expected,actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "TestData.csv")
    public void shouldCheckAllConditionsFileSource (int purchaseSum, boolean ifRegistered, int expected) {
        CashBack cashBack = new CashBack();
        int actual = cashBack.cashBackCalculation(purchaseSum,ifRegistered);
        Assertions.assertEquals(expected,actual);
    }
}
/// Coma Separated Values = CSV {"d11,d12,d13","d21,d22,d23",...}

