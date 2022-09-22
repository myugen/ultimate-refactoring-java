package unit;

import org.junit.jupiter.api.Test;
import pipelines.Author;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class AuthorShould {
    @Test
    public void collect_twitter_handles() {
        Author author1 = new Author();
        author1.company = "Target";
        author1.twitterHandle = "@bob";
        Author author2 = new Author();
        author2.company = "Other";
        author2.twitterHandle = "@other";
        List<Author> authors = new ArrayList<>();
        authors.add(author1);
        authors.add(author2);

        assertThat(Author.twitterHandles(authors, "Target")).hasSize(1);
    }
}
