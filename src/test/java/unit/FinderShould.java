package unit;

import dependencyChange.Finder;
import dependencyChange.SpecificFinder;
import dependencyChange.UserRepository;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FinderShould {

    @Test
    public void find_users_by_querying_profile() {
        UserRepository repository = new UserRepository();
        Finder finder = new Finder(repository);

        assertThat(finder.find("programmer")).hasSize(1);
    }

    @Test
    public void get_users_with_empty_profile() {
        UserRepository repository = new UserRepository();
        Finder finder = new Finder(repository);

        assertThat(finder.find("")).hasSize(1);
    }

    @Test
    public void avoid_duplicates() {
        UserRepository repository = new UserRepository();
        SpecificFinder finder = new SpecificFinder(repository);

        assertThat(finder.findUnique("")).hasSize(1);
    }
}
