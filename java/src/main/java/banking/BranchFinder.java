package banking;

import java.math.BigDecimal;

class BranchFinder {
    public Branch findBranchForTown(String town) {
        // in a real system it would look in a database for this information
        return new Branch(town);
    }

    public boolean withdraw(String town, String customerName, BigDecimal cashAmount) {
        return findBranchForTown(town)
                .getPersonalAccounts()
                .getAccountForCustomer(customerName)
                .withdraw(cashAmount);
    }
}
