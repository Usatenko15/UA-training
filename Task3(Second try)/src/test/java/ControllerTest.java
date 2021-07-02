import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import javax.jws.WebParam;
import java.util.Scanner;

@ExtendWith(MockitoExtension.class)
public class ControllerTest {
    @Mock
    private Scanner scanner;

    @Test
    public void testInputIntValueWithScannerHappy() {
        Mockito.when(scanner.hasNextInt()).thenReturn(true);
        Mockito.when(scanner.nextInt()).thenReturn(5);
        Controller controller = new Controller(new Model(), new View());
        Assertions.assertEquals(5,controller.inputIntValueWithScanner(scanner));
    }

    @Test
    public void testInputIntValueWithScannerSad() {
        Mockito.when(scanner.hasNextInt()).thenReturn(false, true);
        Mockito.when(scanner.next()).thenReturn("fdfsd");
        Controller controller = new Controller(new Model(), new View());
        controller.inputIntValueWithScanner(scanner);
        Mockito.verify(scanner, Mockito.times(1)).next();
    }

    @Test
    public void testisInRangeHappy() {
        Controller controller = new Controller(new Model(), new View());
        Assertions.assertEquals(5,controller.isInRange(5));
    }

    @Test
    public void testCheckValueEqual() {
        Model model = new Model();
        Assertions.assertFalse(model.checkValue(model.getRand()));
    }

    @Test
    public void testCheckValueBigger() {
        Model model = new Model();
        Assertions.assertTrue(model.checkValue(model.getRand()+1));
    }

    @Test
    public void testCheckValueLower() {
        Model model = new Model();
        Assertions.assertTrue(model.checkValue(model.getRand()-1));
    }



}