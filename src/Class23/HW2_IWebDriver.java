package Class23;

public interface HW2_IWebDriver {

    /* Create a WebDriver Interface that will have the following unimplemented behaviour:
       openBrowser(), closeBrowser(), maximizeWindow(), findElement().
       Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
     */

    public static void main(String[] args) {
        IWebDriver iWebDriver = new ChromeDriver();
        iWebDriver.openBrowser();
        iWebDriver.closeBrowser();
        iWebDriver.maximizeWindow();
        iWebDriver.findElement();

        System.out.println();

        IWebDriver iWebDriver1 = new FireFoxDriver();
        iWebDriver1.openBrowser();
        iWebDriver1.closeBrowser();
        iWebDriver1.maximizeWindow();
        iWebDriver1.findElement();
    }
}

interface IWebDriver{

    void openBrowser();

    void closeBrowser();

    void maximizeWindow();

    void findElement();

}

class ChromeDriver implements IWebDriver {

    @Override
    public void openBrowser()
    {
        System.out.println("Opening Google Chrome...");
    }

    @Override
    public void closeBrowser()
    {
        System.out.println("Closing Google Chrome...");
    }

    @Override
    public void maximizeWindow()
    {
        System.out.println("Maximizing the Google Chrome window...");
    }

    @Override
    public void findElement()
    {
        System.out.println("Searching for an element on Google Chrome...");
    }
}


class FireFoxDriver implements IWebDriver {

    @Override
    public void openBrowser()
    {
        System.out.println("Opening FireFox...");
    }

    @Override
    public void closeBrowser()
    {
        System.out.println("Closing FireFox...");
    }

    @Override
    public void maximizeWindow()
    {
        System.out.println("Maximizing the FireFox window...");
    }

    @Override
    public void findElement()
    {
        System.out.println("Searching for an element on FireFox...");
    }
}

