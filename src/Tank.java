public class Tank {

    int x, y;
    int fuel;

    public Tank() {
        x = 0;
        y = 0;
        fuel = 100;
    }
    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
        fuel = 100;
    }

    public Tank(int x, int y, int fuel) {
        this(x, y);
        this.fuel = fuel;
    }

    public void goForward(int i) {
        if (fuel >= i) {
            x += i;
        } else {
            x = x + fuel;
        }
    }

    public void printPosition() {
        System.out.println("The Tank is at " + x + ", " + y + " now.");
    }

    public void goBackward(int i) {
        goForward(-i);
    }
}