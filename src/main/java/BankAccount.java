import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>s
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */


    public enum BankAccountType {
        /**
         *
         */
        CHECKINGS,
        /**
         *
         */
        SAVINGS,

        /**
         *
         */
        STUDENT,
        /**
         *
         */
        WORKPLACE
    }

    /**
     *
     */
    private int accountNumber;
    /**
     *
     */
    private BankAccountType accountType;
    /**
     *
     */
    private double accountBalance;
    /**
     *
     */
    private String ownerName;
    /**
     *
     */
    private double interestRate;
    /**
     *
     */
    private double interestEarned;

    /**
     *
     * @param name owner.
     * @param accountCategory part of account.
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        if (name != null) {
            this.ownerName = name;
        }
        this.accountType = accountCategory;
    }

    /**
     *
     * @param setAccountNumber account number.
     */
    public void setAccountNumber(final int setAccountNumber) {
        this.accountNumber = setAccountNumber;
    }

    /**
     *
     * @return account number
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     *
     * @param setBankAccountType set bank account final.
     */
    public void setAccountType(final BankAccountType setBankAccountType) {
        this.accountType = setBankAccountType;
    }

    /**
     *
     * @return bank account type.
     */
    public BankAccountType getAccountType() {
        return accountType;
    }

    /**
     *
     * @param setAccountBalance current balance.
     */
    public void setAccountBalance(final double setAccountBalance) {
        this.accountBalance = setAccountBalance;
    }

    /**
     *
     * @return account balance.
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     *
     * @param setInterestEarned interest earned.
     */
    public void setInterestEarned(final double setInterestEarned) {
        this.interestEarned = setInterestEarned;
    }

    /**
     *
      * @return interest earned.
     */
    public double getInterestEarned() {
        return interestEarned;
    }

    /**
     *
     * @param setInterestRate interest rate.
     */
    public void setInterestRate(final double setInterestRate) {
        this.interestRate = setInterestRate;
    }

    /**
     * @return interest rate.
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     *
     * @param setOwnerName owner name.
     */
    public void setOwnerName(final String setOwnerName) {
        this.ownerName = setOwnerName;
    }

    /**
     *
     * @return owner name.
     */
    public String getOwnerName() {
        return ownerName;
    }
}