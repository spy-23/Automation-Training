package org.example.demo;

import com.poiji.annotation.ExcelCell;
import com.poiji.annotation.ExcelRow;
import com.poiji.annotation.ExcelSheet;
import com.poiji.bind.Poiji;
import com.poiji.option.PoijiOptions;
import lombok.Data;
import org.testng.annotations.DataProvider;
import java.io.File;
import java.util.List;

@Data
@ExcelSheet("Sheet1")
public class formDetailsDP {

    @ExcelCell(0)
    private String first_name;
    @ExcelCell(1)
    private String last_name;
    @ExcelCell(2)
    private String email;
    @ExcelCell(3)
    private String gender;
    @ExcelCell(4)
    private String  mobile_number;
    @ExcelCell(5)
    private String year;
    @ExcelCell(6)
    private String month;
    @ExcelCell(7)
    private String date;
    @ExcelCell(8)
    private String subject1;
    @ExcelCell(9)
    private String subject2;
    @ExcelCell(10)
    private String hobbies;
    @ExcelCell(11)
    private String picture;
    @ExcelCell(12)
    private String address;
    @ExcelCell(13)
    private String state;
    @ExcelCell(14)
    private String city;



    @DataProvider(name="readExcelDetails")
    public static Object[][] readDetails() {
        PoijiOptions options = PoijiOptions.PoijiOptionsBuilder.settings().build();
        List<formDetailsDP> formDetailsDPList ;
        formDetailsDPList= Poiji.fromExcel(new File("D:\\Automation\\Automation-Training\\AutomationFramework\\resources\\MOCK_DATA.xlsx"),formDetailsDP.class,options);
        Object[][] data = new Object[formDetailsDPList.size()][15];
        for (int i = 0; i < formDetailsDPList.size(); i++) {
            formDetailsDP  dataItem = formDetailsDPList.get(i);
            data[i][0]=dataItem.first_name;
            data[i][1]=dataItem.last_name;
            data[i][2]=dataItem.email;
            data[i][3]=dataItem.gender;
            data[i][4]=dataItem.mobile_number;
            data[i][5]=dataItem.year;
            data[i][6]=dataItem.month;
            data[i][7]=dataItem.date;
            data[i][8]=dataItem.subject1;
            data[i][9]=dataItem.subject2;
            data[i][10]=dataItem.hobbies;
            data[i][11]=dataItem.picture;
            data[i][12]=dataItem.address;
            data[i][13]=dataItem.state;
            data[i][14]=dataItem.city;


        }
        return data;
    }
}
