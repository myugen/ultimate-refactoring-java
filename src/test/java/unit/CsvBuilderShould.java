package unit;

import org.junit.jupiter.api.Test;
import signatureChange.CsvBuilder;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CsvBuilderShould {
    CsvBuilder builder = new CsvBuilder();

    @Test
    public void builds_csv_lines() {
        List<String> lines = builder.aFileWithLine(builder.buildLine("a", "b"));
        assertThat(lines.get(0)).isEqualToIgnoringCase("Field1, Field2");
        assertThat(lines.get(1)).isEqualToIgnoringCase("a,b");
    }

    @Test
    public void builds_csv_lines_with_more_fields_than_headers() {
        List<String> lines = builder.aFileWithLine(builder.buildLine("a", "b", "c"));
        assertThat(lines.get(1)).isEqualToIgnoringCase("a,b,c");
    }
}
