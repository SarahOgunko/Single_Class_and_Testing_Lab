import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    @Test
    void getFirstName() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setFirstName("Sarah");

        String result = bankAccount.getFirstName();
        String expected = "Sarah";
        assertThat(result).isEqualTo(expected);

    }

    @Test
    void getLastName() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setLastName("Smith");

        String result = bankAccount.getLastName();
        String expected = "Smith";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void getDateOfBirth() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setDateOfBirth("1st of January 2000");

        String result = bankAccount.getDateOfBirth();
        String expected = "1st of January 2000";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void getAccountNumber() {
        BankAccount bankaccount = new BankAccount();
        bankaccount.setAccountNumber(123456789);

        int result = bankaccount.getAccountNumber();
        int expected = 123456789;
        assertThat(result).isEqualTo(expected);

    }

    @Test
    void getBalance() {
        BankAccount bankAccount = new BankAccount();
        int result = bankAccount.getBalance();
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    // added money in balance to test deposit and withdrawal method
    @Test
    void getUpdatesBalance() {
        BankAccount bankAccount = new BankAccount();
        int depositAmount = 1000;
        bankAccount.deposit(depositAmount);
        int result = bankAccount.getBalance();
        int expected = 1000;
        assertThat(result).isEqualTo(expected);

    }

    @Test
    void getWithdrawal() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(1000);
        int withdrawalAmount = 100;
        bankAccount.withdrawal(withdrawalAmount);
        int result = bankAccount.getBalance();
        int expected = 900;
        assertThat(result).isEqualTo(expected);

    }

    @Test
    void getInterest() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(1000);
        int interestAmount = 10;
        bankAccount.payInterest(interestAmount);
        int result = bankAccount.getBalance();
        int expected = 10000;
        assertThat(result).isEqualTo(expected);

    }
}