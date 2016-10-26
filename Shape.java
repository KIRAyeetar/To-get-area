/**
 * Created by Administrator on 2016/10/25 0025.
 */
public class Shape extends Area{
     public double r;
     public double base;
     public double high;
     public double wide;

    public double r(){
        this.r=r;
        return r;
    }
    public void getRoundArea(){
        final double pi=3.14;
        this.area=r*r*pi;
        System.out.println("圆形面积为："+area);
    }
    public double wide(){
        this.wide=wide;
        return base;
    }

    public void getSquareArea(){
        area=wide*wide;
        System.out.println("正方形面积为："+area);
    }
    public double high(){
        this.high=high;
        return high;
    }

    public double base(){
        this.base=base;
        return  base;
    }

    public void getTriangleArea(){
        area=high*base/2;
        System.out.println("三角形面积为："+area);
    }

}




