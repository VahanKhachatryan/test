
import com.example.test.Cache;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CacheTest {

    @Test
    void checkException() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            new Cache<>(Cache.Algorithm.LRU, 0);
        });
        assertEquals(Cache.MAX_SIZE_ERROR, exception.getMessage());
    }

}