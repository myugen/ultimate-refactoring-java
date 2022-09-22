package unit;

import org.junit.jupiter.api.Test;
import replacePrimitiveConstantsWithType.Quality;
import replacePrimitiveConstantsWithType.QualityCalculator;

import static org.assertj.core.api.Assertions.assertThat;

public class QualityCalculatorShould {

    @Test
    public void calculate_score() {
        QualityCalculator calculator = new QualityCalculator();
        calculator.rateFacilities(Quality.Excellent);
        calculator.rateLocation(Quality.Excellent);

        assertThat(calculator.getScore()).isEqualTo(12);
    }
}
