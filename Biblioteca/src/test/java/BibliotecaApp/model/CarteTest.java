package BibliotecaApp.model;

import org.junit.jupiter.api.*;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.*;

class CarteTest {
    Carte carte1, carte2, carte3;

    @BeforeEach
    public void setUp() {
        carte1 = new Carte();

        carte3 = new Carte();
        carte3.setTitlu("Deathless");
    }

    @AfterEach
    void tearDown() {
        carte1 = null;
        carte2 = null;
        carte3 = null;
    }

    @Test
    void getNonEmptyTitluShouldReturnNonEmptyString() {
        assertEquals("Deathless", carte3.getTitlu());
    }

    @Test
    void checkInitialStateShouldReturnOneNullBook() {
        assertAll(
                () -> assertNull(carte2),
                () -> assertNotNull(carte1),
                () -> assertNotNull(carte3)
        );
    }

    @Test
    @Disabled
    void disabledTestShouldNotExecute() {
        System.out.println("This shouldn't happen.");
    }

    @Test
    void getTitleOnNullBookShouldThrowException() {
        assertThrows(NullPointerException.class, () -> { carte2.getTitlu(); });
    }

    @Test
    void timeoutExceeded() {
        assertTimeout(ofMillis(10), () -> {
            Thread.sleep(5);
        });
    }

}