
/**
 * @(#)Circle.java
 * 
 * 
 * @author Brian Repsher
 * @version 1.00 2010/8/13
 */
class Circle implements Shape {
  private LegacyCircle adaptee =  new LegacyCircle();

  public void draw(int x1, int y1, int x2, int y2) {
        adaptee.draw(x1, y1, x2, y2);
  }

}
