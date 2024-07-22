package utilities;

import com.poiji.annotation.ExcelCell;
import com.poiji.annotation.ExcelSheet;
import lombok.Data;

@Data
@ExcelSheet("Sheet1")
public class ExcelMapper {
    @ExcelCell(0)
    private String firstname;
    @ExcelCell(1)
    private String lastname;
    @ExcelCell(2)
    private String email;
    @ExcelCell(3)
    private String gender;
    @ExcelCell(4)
    private String  mobilenumber;
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
    }





