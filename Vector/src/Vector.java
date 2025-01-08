    public class Vector {
        private double x1;
        private double y1;
        private double x2;
        private double y2;


        public Vector(double x1, double y1, double x2, double y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }


        public Vector() {
            this(0, 0, 0, 0);
        }


        public double getX1() {
            return x1;
        }


        public double getY1() {
            return y1;
        }


        public double getX2() {
            return x2;
        }


        public double getY2() {
            return y2;
        }

        public void setX1(double x1) {
            this.x1 = x1;
        }


        public void setY1(double y1) {
            this.y1 = y1;
        }


        public void setX2(double x2) {
            this.x2 = x2;
        }

        public void setY2(double y2) {
            this.y2 = y2;
        }


        public double crossProduct(Vector v) {
            return (this.x2 - this.x1) * (v.y2 - v.y1) - (this.y2 - this.y1) * (v.x2 - v.x1);
        }


        public double dotProduct(Vector v) {
            return (this.x2 - this.x1) * (v.x2 - v.x1) + (this.y2 - this.y1) * (v.y2 - v.y1);
        }


        public double length() {
            return Math.sqrt(Math.pow(this.x2 - this.x1, 2) + Math.pow(this.y2 - this.y1, 2));
        }


        public Vector multiply(double scalar) {
            double newX2 = this.x1 + scalar * (this.x2 - this.x1);
            double newY2 = this.y1 + scalar * (this.y2 - this.y1);
            return new Vector(this.x1, this.y1, newX2, newY2);
        }


        public Vector add(Vector v) {
            double newX2 = this.x2 + (v.x2 - v.x1);
            double newY2 = this.y2 + (v.y2 - v.y1);
            return new Vector(this.x1, this.y1, newX2, newY2);
        }


        public Vector subtract(Vector v) {
            double newX2 = this.x2 - (v.x2 - v.x1);
            double newY2 = this.y2 - (v.y2 - v.y1);
            return new Vector(this.x1, this.y1, newX2, newY2);
        }


        public static void main(String[] args) {
            // Создать объект класса, вызвав конструктор с параметрами
            Vector v1 = new Vector(1, 2, 3, 4);

            // Создать объект класса, вызвав конструктор без параметров
            Vector v2 = new Vector();


            System.out.println("Векторное произведение: " + v1.crossProduct(v2));
            System.out.println("Скалярное произведение: " + v1.dotProduct(v2));
            System.out.println("Длина вектора v1: " + v1.length());

            Vector v3 = v1.multiply(2);
            System.out.println("Умножение v1 на 2: (" + v3.getX2() + ", " + v3.getY2() + ")");

            Vector v4 = v1.add(v2);
            System.out.println("Сумма v1 и v2: (" + v4.getX2() + ", " + v4.getY2() + ")");

            Vector v5 = v1.subtract(v2);
            System.out.println("Разность v1 и v2: (" + v5.getX2() + ", " + v5.getY2() + ")");
        }
    }














