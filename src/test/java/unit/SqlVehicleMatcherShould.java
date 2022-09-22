package unit;

import org.junit.jupiter.api.Test;
import replaceType.OldVehicleQuery;
import replaceType.SqlVehicleMatcher;

import static org.assertj.core.api.Assertions.assertThat;

public class SqlVehicleMatcherShould {
    @Test
    public void find_vehicles() {
        SqlVehicleMatcher matcher = new SqlVehicleMatcher();
        OldVehicleQuery query = new OldVehicleQuery();
        query.brandDescription = "VW Polo";

        assertThat(matcher.countVehicles(query)).isEqualTo(1);
    }
}
