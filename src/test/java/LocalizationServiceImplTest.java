import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.i18n.LocalizationService;
import ru.netology.i18n.LocalizationServiceImpl;

public class LocalizationServiceImplTest {

    @BeforeEach
    public void init() {
        System.out.println("Начало теста");
    }

    @AfterEach
    public void finished() {
        System.out.println("Конец теста");
    }

    @Test
    void testLocale() {
        LocalizationService localizationService = new LocalizationServiceImpl();
        String actual = localizationService.locale(Country.RUSSIA);
        String expected = "Добро пожаловать";
        Assertions.assertEquals(expected, actual);
    }
}
