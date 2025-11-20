package dk.exercises._07_greeting;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GreetingTest {

    @Test
    void greetSingleNameNormally() {
        Greeting g = new Greeting();
        String result = g.greet("Jörg");
        assertThat(result).isEqualTo("Hello, Jörg.");
    }

    @Test
    void greetNullReturnsGenericGreeting() {
        // TODO
    }

    @Test
    void greetUppercaseNameReturnsShoutGreeting() {
        // TODO
    }
}

