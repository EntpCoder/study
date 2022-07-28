package day09.order;

/**
 * @author Yang Song
 * @date 2022/7/28 9:46
 */
public interface IOrder {
    /**
     * 克隆方法
     * @return 克隆对象
     */
    BaseOrder orderClone();
}
