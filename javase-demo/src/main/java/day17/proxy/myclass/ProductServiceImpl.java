package day17.proxy.myclass;

/**
 * @author Yang Song
 * @date 2022/8/9 18:07
 */
public class ProductServiceImpl implements ProductService {

    @Override
    public void add() {
        System.out.println("增加");
    }

    @Override
    public void delete() {
        System.out.println("删除");
    }
}
