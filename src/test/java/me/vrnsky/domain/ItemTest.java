package me.vrnsky.domain;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ItemTest {

    /**
     * System under test.
     */
    private Item item;

    /**
     * Before each test cases create a new item.
     */
    @Before
    public void setUp() {
        this.item = new Item(1, "Create a new page");
    }

    /**
     * When call get method should check that correct id.
     */
    @Test
    public void whenGetIdShouldCheckThatIdCorrect() {
        assertThat(this.item.getId(), is(1));
    }

    /**
     * When update id should check that updated.
     */
    @Test
    public void whenUpdateIdShouldCheckThatIdSafe() {
        this.item.setId(2);
        assertThat(this.item.getId(), is(2));
    }

    /**
     * When get description should check that is correct.
     */
    @Test
    public void whenGetDescriptionShouldCheckThatIsCorrect() {
        assertThat(this.item.getDescription(), is("Create a new page"));
    }

    /**
     * When update description should check that updated.
     */
    @Test
    public void whenUpdateDescriptionShouldCheckThatSafeIt() {
        this.item.setDescription("Write code");
        assertThat(this.item.getDescription(), is("Write code"));
    }

}