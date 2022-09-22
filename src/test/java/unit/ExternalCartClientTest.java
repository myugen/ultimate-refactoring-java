package unit;

import implementationChange.ExternalCartClient;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ExternalCartClientTest {

    @Test
    public void format_total_price_message() {
        ExternalCartClient client = new ExternalCartClient();
        assertThat(client.formattedTotalPrice(50)).isEqualTo("Total price is 50 euro");
    }
}
