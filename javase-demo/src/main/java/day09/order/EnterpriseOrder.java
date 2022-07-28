package day09.order;

/**
 * @author Yang Song
 * @date 2022/7/28 9:46
 */
public class EnterpriseOrder extends BaseOrder{
    public EnterpriseOrder() {
    }
    public EnterpriseOrder(String orderNo, String ownerName, int productNum) {
        super(orderNo, ownerName, productNum);
    }
    @Override
    public EnterpriseOrder orderClone() {
        EnterpriseOrder cloneOrder = new EnterpriseOrder();
        cloneOrder.setOrderNo(this.getOrderNo());
        cloneOrder.setOwnerName(this.getOwnerName());
        return cloneOrder;
    }
}
