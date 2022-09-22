package unit;

import org.junit.jupiter.api.Test;
import valueAndReference.SomeType;

public class YouShouldUnderstandValuesAndReferences {
    @Test
    public void because_its_fundamental() {
        SomeType instance = new SomeType();

        String arg1 = "bar";
        instance.firstMethod(arg1);
        //assertThat(arg1).isEqualTo("???");

        SomeType other = new SomeType();
        other.numbers[0] = 100;
        instance.secondMethod(other);
        //assertThat(other.numbers[0]).isEqualTo(-1000);
        //assertThat(other.someField).isEqualTo("???");

        SomeType another = new SomeType();
        another.numbers[0] = 200;
        instance.thirdMethod(another);
        //assertThat(another.numbers[0]).isEqualTo(-1000);
        //assertThat(another.someField).isEqualTo("???");
        //assertThat(another.child).isNull();

        SomeType yetAnother = new SomeType();
        yetAnother.numbers[0] = 200;
        instance.fourthMethod(yetAnother.numbers);
        //assertThat(yetAnother.numbers[0]).isEqualTo(-1000);
    }
}
