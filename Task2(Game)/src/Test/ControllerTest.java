package Test;

import Game.Controller;
import Game.Model;
import Game.View;
import org.junit.Assert;
import org.junit.Test;


import java.util.Scanner;

import static org.junit.Assert.*;

public class ControllerTest {
    Model model = new Model();
    View view = new View();
    Controller controller = new Controller(model, view);

    @Test(expected = Exception.class)
    public void testStringInputIntValueWithScanner() {

        Scanner stringScan = new Scanner("fdfdfd");
        controller.inputIntValueWithScanner(stringScan);;

    }

    @Test
    public void testInRange() {

        Assert.assertEquals(controller.isInRange(50), 50);

    }

}