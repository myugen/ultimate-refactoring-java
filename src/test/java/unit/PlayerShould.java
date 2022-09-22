package unit;

import org.junit.jupiter.api.Test;
import signatureChange.Player;
import signatureChange.Role;

import static org.assertj.core.api.Assertions.assertThat;

public class PlayerShould {
    @Test
    public void increase_score_when_dragon_plays() {
        Player player = new Player(Role.Dragon, "WhiteDragon", 5);

        player.play();

        assertThat(player.getScore()).isEqualTo(25);
    }

    @Test
    public void sets_the_initial_score() {
        Player player = new Player(Role.Dragon, "WhiteDragon", 3);

        assertThat(player.getScore()).isEqualTo(3);
    }
}
