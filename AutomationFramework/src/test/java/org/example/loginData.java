package org.example;

import com.poiji.annotation.ExcelCell;
import com.poiji.annotation.ExcelRow;
import com.poiji.bind.Poiji;
import com.poiji.option.PoijiOptions;
import org.testng.annotations.DataProvider;
import java.io.File;
import java.util.List;

public class loginData {
    @ExcelRow
    public int rowIndex;
    @ExcelCell(0)
    public String first_name;
    @ExcelCell(1)
    public String last_name;
    @ExcelCell(2)
    public String email;
    @DataProvider(name="loginDataProvider")
    public static Object[][] readData() {
        PoijiOptions options = PoijiOptions.PoijiOptionsBuilder.settings().build();
        List<loginData> loginDataList ;
        loginDataList=Poiji.fromExcel(new File("D:\\Automation\\Automation-Training\\AutomationFramework\\resources\\MOCK_DATA.xlsx"),loginData.class,options);
        Object[][] data = new Object[loginDataList.size()][2];
        for (int i = 0; i < loginDataList.size(); i++) {
           loginData  dataItem = loginDataList.get(i);
           data[i][0]=dataItem.first_name;
           data[i][1]=dataItem.last_name;
        }
        return data;
    }



}






