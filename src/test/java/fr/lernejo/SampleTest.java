package fr.lernejo;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class SampleTest {

    private final Sample sample = new Sample();

    @ParameterizedTest
    @CsvSource({
        "3, 7, 10",
        "0, 3, 3",
    })
    void add_behaves_as_expected(int a, int b, int expectedResult) {
        int result = sample.op(Sample.Operation.ADD, a, b);

        assertThat(result).isEqualTo(expectedResult);
    }


    @Test
    void opp_throws_is_operation_is_null() {
        assertThatExceptionOfType(NullPointerException.class)
            .isThrownBy(() -> sample.op(null, 1, 3));
    }
}
