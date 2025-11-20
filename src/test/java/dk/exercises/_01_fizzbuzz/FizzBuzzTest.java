package dk.exercises._01_fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzTest {

    @Test
    void returnsNumberAsStringWhenNotFizzOrBuzz() {
        // arrange
        FizzBuzz fizzBuzz = new FizzBuzz();

        // act
        String result = fizzBuzz.convert(1);

        // assert
        assertThat(result).isEqualTo("1");
    }

    @Test
    void returnsFizzForMultiplesOfThree() {
        // TODO your test here
    }

    @Test
    void returnsBuzzForMultiplesOfFive() {
        // TODO
    }

    @Test
    void returnsFizzBuzzForMultiplesOfBothThreeAndFive() {
        // TODO
    }
}

