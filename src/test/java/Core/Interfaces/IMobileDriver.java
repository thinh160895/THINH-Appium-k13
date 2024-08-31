package Core.Interfaces;

import org.openqa.selenium.By;

public interface IMobileDriver {
    void    tapOnElement (By identification);
    void    enterText (By identification, String text);
    void    swipe (String Direction, int numberOfSwipe);
    boolean    verifyElementIsDisplayed (By identification, int waitForSeconds);
    String takeScreenShot();

}
