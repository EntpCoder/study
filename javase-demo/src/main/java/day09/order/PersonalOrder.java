package day09.order;

/**
 * @author Yang Song
 * @date 2022/7/28 9:46
 */
public class PersonalOrder extends BaseOrder{
    public PersonalOrder() {
    }
    public PersonalOrder(String orderNo, String ownerName, int productNum) {
        super(orderNo, ownerName, productNum);
    }
    @Override
    public PersonalOrder orderClone() {
        PersonalOrder orderClone = new PersonalOrder();
        orderClone.setOrderNo(this.getOrderNo());
        orderClone.setOwnerName(this.getOwnerName());
        return orderClone;
    }
}
