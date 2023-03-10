import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HotelTest {

    @Test
    void crearCategoriasPorDefecto() {
        List<Object> inputs = List.of(20, 100, 300);

            Assertions.assertAll(() -> assertEquals(20, inputs.get(0)),
                                 () -> assertEquals(100, inputs.get(1)),
                                 () -> assertEquals(300, inputs.get(2)));
            }

}