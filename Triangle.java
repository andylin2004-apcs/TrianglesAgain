public class Triangle{
  private Point v1, v2, v3;
  public Triangle(Point a, Point b, Point c) {
    v1 = a;
    v2 = b;
    v3 = c;
  }
  public Triangle(double x1, double y1,double x2, double y2,double x3, double y3){
    v1 = new Point(x1,y1);
    v2 = new Point(x2,y2);
    v3 = new Point(x3,y3);
  }
  public double getPerimeter(){
    return(v1.distanceTo(v2)+v2.distanceTo(v3)+v3.distanceTo(v1));
  }
  public double getArea(){
    double semi = getPerimeter()/2;
    return Math.sqrt(semi*(semi-v1.distanceTo(v2))*(semi-v2.distanceTo(v3))*(semi-v3.distanceTo(v1)));
  }
  public String classify(){
    double a = Math.round(v1.distanceTo(v2)*10000.00);
    double b = Math.round(v2.distanceTo(v3)*10000.00);
    double c = Math.round(v3.distanceTo(v1)*10000.00);
    a /= 10000.00;
    b /= 10000.00;
    c /= 10000.00;
    if (a == b && b == c){
      return "equilateral";
    } else if (a == b || b == c || a == c){
      return "isosceles";
    }
    return "scalene";
  }
  public String toString(){
    return "v1("+v1.getX()+", "+v1.getY()+") v2("+v2.getX()+", "+v2.getY()+") v3("+v3.getX()+", "+v3.getY()+")";
  }
  public void setVertex(int index, Point newP){
    if (index == 0){
      v1 = newP;
    }else if (index == 1){
      v2 = newP;
    }else if (index == 2){
      v3 = newP;
    }
  }
}
