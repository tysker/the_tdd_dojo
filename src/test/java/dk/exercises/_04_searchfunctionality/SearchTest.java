package dk.exercises._04_searchfunctionality;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SearchTest {

    @Test
    void returnsEmptyListWhenNoMatches() {
        Search search = new Search();
        List<String> result = search.find("hello", List.of());
        assertThat(result).isEmpty();
    }

    @Test
    void returnsMatchingItems() {
        // TODO
    }

    @Test
    void matchesIgnoreCase() {
        // TODO
    }
}

