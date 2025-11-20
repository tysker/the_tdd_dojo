package dk.exercises._06_banking;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BankingTest {

    @Test
    void newAccountStartsAtZero() {
        BankAccount acc = new BankAccount();
        assertThat(acc.getBalance()).isEqualTo(0);
    }

    @Test
    void depositIncreasesBalance() {
        // TODO
    }

    @Test
    void cannotWithdrawMoreThanBalance() {
        // TODO
    }
}

