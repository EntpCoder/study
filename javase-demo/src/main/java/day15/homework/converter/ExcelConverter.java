package day15.homework.converter;


import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.converters.ReadConverterContext;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/**
 * @author Yang Song
 * @date 2022/8/5 21:05
 */
public class ExcelConverter implements Converter<LocalDate> {
    @Override
    public Class<?> supportJavaTypeKey() {
        return LocalDate.class;
    }
    @Override
    public LocalDate convertToJavaData(ReadConverterContext<?> context){
        // 获取excel的字符串类型数据
        String stringValue = context.getReadCellData().getStringValue();
        // 根据.分割成数组
        String[] split = stringValue.split("\\.");
        // 将String数组转成Integer类型 即可[2000,4,26]
        List<Integer> excelDate = Arrays.stream(split)
                .map(Integer::valueOf)
                .collect(Collectors.toList());
        return LocalDate.of(excelDate.get(0),excelDate.get(1),excelDate.get(2));
    }
}
