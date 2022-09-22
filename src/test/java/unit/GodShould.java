package unit;

import moveResponsibility.God;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GodShould {
    @Test
    public void add_numbers() {
        God god = new God();
        assertThat(god.add(2, 2)).isEqualTo(4);
    }

    @Test
    public void substract_numbers() {
        God god = new God();
        assertThat(god.substract(2, 2)).isEqualTo(0);
    }

    @Test
    public void say_hello() {
        God god = new God();
        god.sayHello();
    }

    @Test
    public void say_bye() {
        God god = new God();
        god.sayBye();
    }
}
