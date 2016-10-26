/**
 * Created by Administrator on 2016/10/26 0026.
 */
public class Test {
    public static void main(String[] args) {
        Shape a=new Shape();
        a.r=3;
        a.getRoundArea();

        Shape b=new Shape();
        b.wide=3;
        b.getSquareArea();

        Shape c=new Shape();
        c.base=3;
        c.high=3;
        c.getTriangleArea();
    }
}
