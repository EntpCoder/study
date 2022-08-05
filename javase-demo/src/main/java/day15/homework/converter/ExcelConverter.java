package day15.homework.converter;


import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.converters.ReadConverterContext;
import com.alibaba.excel.enums.CellDataTypeEnum;


/**
 * @author Yang Song
 * @date 2022/8/5 21:05
 */
public class ExcelConverter implements Converter<String> {
    @Override
    public Class<?> supportJavaTypeKey() {
        return String.class;
    }
    @Override
    public CellDataTypeEnum supportExcelTypeKey() {
        return CellDataTypeEnum.STRING;
    }
    @Override
    public String convertToJavaData(ReadConverterContext<?> context){
        System.out.println(context.getReadCellData().getStringValue()+"===============================================");
        return "";
        //return LocalDate.parse(context.getReadCellData().getStringValue(),DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
}
