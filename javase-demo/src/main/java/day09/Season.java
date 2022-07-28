package day09;

/**
 * @author Yang Song
 * @date 2022/7/28 13:37
 */
public class Season {
    private String seasonName = "";
    public static final Season SPRING = new Season("春");
    public static final Season SUMMER = new Season("夏");
    public static final Season AUTUMN = new Season("秋");
    public static final Season WINTER = new Season("冬");
    private Season(String seasonName){
        this.seasonName = seasonName;
    }

}
