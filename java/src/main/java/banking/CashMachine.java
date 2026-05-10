package banking;

import java.math.BigDecimal;

class CashMachine {
    private final AccountAccess accountAccess = new AccountAccess();

    public boolean withdraw(String town, String customerName, BigDecimal cashAmount) {
        return accountAccess.withdraw(town, customerName, cashAmount);
    }

}
