package unit;

import org.junit.jupiter.api.Test;
import signatureChange.AuthenticationService;

import static org.assertj.core.api.Assertions.assertThat;

public class AuthenticationServiceShould {

    @Test
    public void distinguish_administrator_role() {
        AuthenticationService service = new AuthenticationService();
        int adminId = 12345;
        assertThat(service.isAuthenticated(adminId)).isTrue();
    }

    @Test
    public void distinguish_non_admin_role() {
        AuthenticationService service = new AuthenticationService();
        int normalUserId = 11111;
        assertThat(service.isAuthenticated(normalUserId)).isFalse();
    }
}
