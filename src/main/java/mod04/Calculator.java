package mod04;

public class Calculator {
    private double x;
    private double y;

        public Calculator (double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        public double add() {
            double result = x + y;
            return result;
        }

        public double subtract() {
            double result = x - y;
            return result;
        }
}





