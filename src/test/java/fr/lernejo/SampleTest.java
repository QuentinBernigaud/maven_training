package fr.lernejo;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class SampleTest {


    @Test
    void add_behaves_as_expected() {
        int result = new Sample().op(Sample.Operation.ADD,3,3);

        Assertions.assertThat(result).isEqualTo(6);
    }

    @Test
    void mul_behaves_as_expected() {
        int result = new Sample().op(Sample.Operation.MULT,3, 3);

        Assertions.assertThat(result).isEqualTo(9);
    }

    @Test
    void div_behaves_as_expected() {
        int result = new Sample().op(Sample.Operation.DIV,3, 3);

        Assertions.assertThat(result).isEqualTo(1);
    }
}
