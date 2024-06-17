import org.testng.annotations.Test;

public class DependencyTest {
    @Test
    void launchBrowser(){
        System.out.println("Browser Launched");
    }

    @Test(dependsOnMethods = "launchBrowser")
    void OpenUrl(){
        System.out.println("Url opened.");
    }

    @Test(dependsOnMethods = "OpenUrl")
    void login(){
        System.out.println("login done");
    }

    @Test(dependsOnMethods = "login")
    void logout(){
        System.out.println("logged out");
    }
}
