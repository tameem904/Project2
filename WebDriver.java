package project02;

public interface WebDriver {
    void open();
    void close();
    String getTitle();
}
interface TakeScreenShot{
    void getScreenShot();
}
interface RemoteWebDriver extends WebDriver,TakeScreenShot{
    void navigate();
}
class ChromeDriver implements RemoteWebDriver{
    @Override
   public void open(){
        System.out.println("ChromeDriver open method");
    }
    @Override
   public void close(){
        System.out.println("ChromeDriver close method");
    }
    @Override
    public String getTitle(){
        return "ChromeDriver";
    }
    @Override
    public void getScreenShot(){
        System.out.println("ChromeDriver ScreenShot");
    }
    @Override
    public void navigate(){
        System.out.println("navigate ChromeDriver");
    }
}
class FireFoxDriver implements RemoteWebDriver{
    @Override
    public void open(){
        System.out.println("FireFoxDriver open method");
    }
    @Override
    public void close(){
        System.out.println("FireFoxDriver close method");
    }
    @Override
    public String getTitle(){
        return "FireFoxDriver";
    }
    @Override
    public void getScreenShot(){
        System.out.println("FireFoxDriver ScreenShot");
    }
    @Override
    public void navigate(){
        System.out.println("navigate FireFoxDriver");
    }
}
class SafariDriver implements RemoteWebDriver{
    @Override
    public void open(){
        System.out.println("SafariDriver open method");
    }
    @Override
    public void close(){
        System.out.println("SafariDriver close method");
    }
    @Override
    public String getTitle(){
        return "SafariDriver";
    }
    @Override
    public void getScreenShot(){
        System.out.println("SafariDriver ScreenShot");
    }
    @Override
    public void navigate(){
        System.out.println("navigate SafariDriver");
    }
}
class WebDriverTester{
    public static void main(String[] args) {

        RemoteWebDriver r1 []={new ChromeDriver(),new FireFoxDriver(),new SafariDriver()};
        for(RemoteWebDriver r2:r1){
            r2.open();
            r2.close();
            r2.getScreenShot();
            r2.navigate();
            String result=r2.getTitle();
            System.out.println(result);
        }
    }
}
