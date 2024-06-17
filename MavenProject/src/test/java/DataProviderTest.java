import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Iterator;

public class DataProviderTest {

    @DataProvider(name = "carData")
    public String[][] getData(){
        String[][] data = {{"start"}, {"push clutch"}, {"engage gear"}, {"release clutch"}, {"accelerate"}};
        return data;
    }

    @Test(dataProvider = "carData")
    void car(String data) {
        System.out.println(data);
    }

    @Test(dataProvider = "nameTestData", dataProviderClass = nameDataProvider.class)
    void name(String name){
        System.out.println(name);
    }


}
