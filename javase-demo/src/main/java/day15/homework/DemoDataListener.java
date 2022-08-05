package day15.homework;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Yang Song
 * @date 2022/8/5 17:01
 */
public class DemoDataListener implements ReadListener<Student> {
    /**
     * 每隔5条存储数据库，实际使用中可以100条，然后清理list ，方便内存回收
     */
    private static final int BATCH_COUNT = 100;
    /**
     * 缓存的数据
     */
    private List<Student> students;
    private Student student;
    public DemoDataListener(){
        student = new Student();
        students = new ArrayList<>();
    }
    @Override
    public void invoke(Student student, AnalysisContext analysisContext) {
        students.add(student);
    }
    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        System.out.println("数据读取完成共"+students.size()+"条数据");
    }
}
