package dk.exercises._05_barcodes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BarCodesTest {

    @Test
    void validBarcodeReturnsTrue() {
        BarCodes bc = new BarCodes();
        boolean result = bc.isValid("123456789012");
        assertThat(result).isTrue();
    }

    @Test
    void invalidBarcodeReturnsFalse() {
        // TODO
    }

    @Test
    void barcodeWithWrongLengthReturnsFalse() {
        // TODO
    }
}

