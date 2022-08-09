package day17.proxy.jdkproxy;

/**
 * @author Yang Song
 * @date 2022/8/8 20:23
 */
public interface ProductService {
    /**
     * 保存逻辑
     */
    public void save();
    /**
     * 修改逻辑
     */
    public void update();
    /**
     * 删除逻辑
     */
    public void delete();
    /**
     * 获取逻辑
     */
    public void getById();
}
