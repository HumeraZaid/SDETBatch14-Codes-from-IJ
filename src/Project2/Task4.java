package Project2;

public interface Task4 {

    /* Provide Implementation for the diagram below. Then create a test class in which you need
       to create Objects of ChromeDriver, FirefoxDrive and SafariDriver classes and
       see which methods available to them.
     */

    public static void main(String[] args) {
        IRemoteWebDriver[] webDriver = { new ChromeDriver(),new FirefoxDriver(),new SafariDriver()};


        for(IRemoteWebDriver webdriver : webDriver){

            System.out.println(webdriver.getTitle());
            webdriver.open();
            webdriver.navigate();
            webdriver.getScreenshot();
            webdriver.close();
            System.out.println();
        }
    }
}

interface IWebDriver{

    String getTitle();

    void open();

    void close();

}

interface ITakesScreenshot {

    void getScreenshot();
}

interface IRemoteWebDriver extends ITakesScreenshot, IWebDriver{

    void navigate();
}



class ChromeDriver implements IRemoteWebDriver{

    public String getTitle()
    {
        return "Google Chrome";
    }

    public void open()
    {
        System.out.println("Opening the Chrome browser...");
    }

    public void navigate()
    {
        System.out.println("Navigating to the google.com page...");
    }
    public void getScreenshot()
    {
        System.out.println("Taking a screenshot on Google Chrome...");
    }

    public void close()
    {
        System.out.println("CLosing the Chrome browser...");
    }
}

class FirefoxDriver implements IRemoteWebDriver{

    public String getTitle()
    {
        return "Firefox";
    }

    public void open()
    {
        System.out.println("Opening the Firefox browser...");
    }


    public void navigate()
    {
        System.out.println("Navigating to the Firefox home page...");
    }
    public void getScreenshot()
    {
        System.out.println("Taking a screenshot on Firefox...");
    }

    public void close()
    {
        System.out.println("Closing the Firefox browser...");
    }
}


class SafariDriver implements IRemoteWebDriver{

    public String getTitle()
    {
        return "Safari";
    }

    public void open()
    {
        System.out.println("Opening the Safari browser...");
    }
    public void navigate()
    {
        System.out.println("Navigating to the Safari home page...");
    }
    public void getScreenshot()
    {
        System.out.println("Taking a screenshot on Safari...");
    }

    public void close()
    {
        System.out.println("Closing the Safari browser...");
    }
}

