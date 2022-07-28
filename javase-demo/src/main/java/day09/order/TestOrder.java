package day09.order;

import java.util.Arrays;

/**
 * @author Yang Song
 * @date 2022/7/28 9:43
 */
public class TestOrder {
    public static void main(String[] args) {
        EnterpriseOrder enterpriseOrder = new EnterpriseOrder("1","驰星",9900);
        PersonalOrder personalOrder = new PersonalOrder("2","宋洋",8001);
        BaseOrder[] baseOrders1 = OrderUtil.splitOrder(enterpriseOrder);
        BaseOrder[] baseOrders2 = OrderUtil.splitOrder(personalOrder);
        System.out.println(Arrays.toString(baseOrders1));
        System.out.println(Arrays.toString(baseOrders2));
    }
}
