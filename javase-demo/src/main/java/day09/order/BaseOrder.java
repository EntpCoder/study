package day09.order;

/**
 * @author Yang Song
 * @date 2022/7/28 9:50
 */
public abstract class BaseOrder implements IOrder {
    private String orderNo;
    private String ownerName;
    private int productNum;
    public BaseOrder(){}
    public BaseOrder(String orderNo, String ownerName, int productNum) {
        this.orderNo = orderNo;
        this.ownerName = ownerName;
        this.productNum = productNum;
    }
    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getProductNum() {
        return productNum;
    }

    public void setProductNum(int productNum) {
        this.productNum = productNum;
    }

    @Override
    public String toString() {
        return "BaseOrder{" +
                "orderNo='" + orderNo + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", productNum=" + productNum +
                '}';
    }
}
