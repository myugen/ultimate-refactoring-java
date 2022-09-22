package unit;

import implementationChange.ShoppingCart;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ShoppingCartShould {
    @Test
    public void count_number_of_products() {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(10);

        assertThat(shoppingCart.numberOfProducts()).isEqualTo(1);
    }

    @Test
    public void calculate_total_price() {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(10);

        assertThat(shoppingCart.calculateTotalPrice()).isEqualTo(10);
    }

    @Test
    public void know_when_is_discount_applicable() {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(100);

        assertThat(shoppingCart.hasDiscount()).isTrue();
    }

    @Test
    public void know_when_is_not_possible_to_apply_discount() {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(99);

        assertThat(shoppingCart.hasDiscount()).isFalse();
    }

}
