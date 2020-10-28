public class Triangles{
  private Point v1, v2, v3;
  public Triangle(Point a, Point b, Point c) {
    v1 = a;
    v2 = b;
    v3 = c;
  }
  public Triangle(double x1, double y1,double x2, double y2,double x3, double y3){
    v1 = Point(x1,y1);
    v2 = Point(x2,y2);
    v3 = Point(x3,y3);
  }
}
