package day09;

/**
 * @author Yang Song
 * @date 2022/7/28 13:48
 */
public enum MySeason {
    // 春，夏，秋，冬
    SPRING("春"),SUMMER("夏"),AUTUMN("秋"),WINTER("冬");
    private final String msg;
    MySeason(String msg){
        this.msg = msg;
    }
    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return this.msg;
    }
}
