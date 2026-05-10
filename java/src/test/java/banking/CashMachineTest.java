package banking;


import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CashMachineTest {
    CashMachine cashMachine = new CashMachine();

    @Test
    void withdraw_succeeds_when_amount_within_balance() {
        boolean result = cashMachine.withdraw("London", "Arthur", BigDecimal.valueOf(100));
        assertTrue(result);
    }

    @Test
    void withdraw_fails_when_amount_exceeds_balance() {
        boolean result = cashMachine.withdraw("London", "Arthur", BigDecimal.valueOf(1000));
        assertFalse(result);
    }

}
