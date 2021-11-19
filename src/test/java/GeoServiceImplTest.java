import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;
import ru.netology.geo.GeoServiceImpl;

public class GeoServiceImplTest {

    @BeforeEach
    public void init() {
        System.out.println("Начало теста");
    }

    @AfterEach
    public void finished() {
        System.out.println("Конец теста");
    }

    @Test
    void testByIp() {
        GeoServiceImpl geoService = new GeoServiceImpl();
        Location expected = new Location(("New York"), Country.USA, null, 0);
        Location actual = geoService.byIp("96. ");
        Assertions.assertEquals(expected.getCity(), actual.getCity());
        Assertions.assertEquals(expected.getCountry(), actual.getCountry());
    }
}
