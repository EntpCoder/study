package day09.order;

/**
 * @author Yang Song
 * @date 2022/7/28 9:47
 */
public class OrderUtil {
    public static BaseOrder[]  splitOrder(BaseOrder baseOrder){
        int length = (int) Math.ceil((float)baseOrder.getProductNum()/1000.0);
        BaseOrder[] baseOrders = new BaseOrder[length];
        int i = 0;
        while (baseOrder.getProductNum() > 1000){
            BaseOrder cloneOrder = baseOrder.orderClone();
            cloneOrder.setProductNum(1000);
            baseOrder.setProductNum(baseOrder.getProductNum() - 1000);
            baseOrders[i++] = cloneOrder;
        }
        baseOrders[i] = baseOrder;
        return baseOrders;
    }
    public static BaseOrder[] s(IOrder baseOrder){
        return null;
    }
}
