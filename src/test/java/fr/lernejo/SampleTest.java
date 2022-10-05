package fr.lernejo;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


// import org.junit.jupiter.params.provider.CsvSource;

// import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    @Test
    void affiche_result_Op(){
        Sample operation = new Sample();
        Integer result1 = operation.op(Sample.Operation.ADD,2,3);
        Assertions.assertThat(result1).isEqualTo(5);
        Integer result2 = operation.op(Sample.Operation.MULT,2,3);
        Assertions.assertThat(result2).isEqualTo(6);

    }

    @Test
    void affiche_result_fact(){
        Sample operation1 = new Sample();
        Integer resultfloat1 = operation1.fact(7);
        Assertions.assertThat(resultfloat1).isEqualTo(5040);
        Sample operation2 = new Sample();
        Assertions.assertThatException().isThrownBy(() -> operation2.fact(-7)).withMessage("N should be positive");

    }
}
