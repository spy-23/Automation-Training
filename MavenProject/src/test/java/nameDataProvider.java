import org.testng.annotations.DataProvider;

public class nameDataProvider {
    @DataProvider(name = "nameTestData")
    Object[][] getData(){
        String[][] nameValue = {{"Mahesh"},{"Abhijit"},{"Saurabh"}};
        return nameValue;
    }
}
