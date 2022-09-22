package unit;

import moveResponsibility.InvoiceService;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class InvoiceShould {

    @Test
    public void calculate_net_amount() {
        InvoiceService invoiceService = new InvoiceService();
        String result = invoiceService.calculateNetAmount("100", "10");

        assertThat(result).isEqualTo("90.0");
    }
}
