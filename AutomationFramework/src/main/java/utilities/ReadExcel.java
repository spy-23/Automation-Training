package utilities;

import com.poiji.bind.Poiji;
import com.poiji.option.PoijiOptions;
import java.io.File;
import java.util.List;

public class ReadExcel {
    public static ExcelMapper excelReader(int i) {
        PoijiOptions poijiOptions = PoijiOptions.PoijiOptionsBuilder.settings().build();
        List<ExcelMapper> readExcel = Poiji.fromExcel(new File("D:\\Automation\\Automation-Training\\AutomationFramework\\resources\\MOCK_DATA.xlsx"), ExcelMapper.class, poijiOptions);
        return readExcel.get(i);
    }
}
