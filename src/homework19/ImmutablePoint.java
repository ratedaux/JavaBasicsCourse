package homework19;

public class ImmutablePoint {

    final int x;
    final int y;

    ImmutablePoint() {
        x = 10;
        y = 5;
    }


    public void setY(int y) {
        //this.y=y; константы не могут быть переопределены
    }

    public void setX(int x) {
        //this.x=x; константы не могут быть переопределены
    }
}
