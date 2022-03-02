package ss6_ke_thua_trong_java.bai_tap.PointAndMoveablePoint;

public class Point {

        private float x = 0.0f;
        private float y = 0.0f;

        public Point() {
        }

        public Point(float x, float y) {
            this.x = x;
            this.y = y;
        }

        public float getX() {
            return x;
        }

        public void setX(float x) {
            this.x = x;
        }

        public float getY() {
            return y;
        }

        public void setY(float y) {
            this.y = y;
        }

        public void setXY(float x, float y) {
            this.x = x;
            this.y = y;
        }

        public float[] getXY(float x, float y) {
            float[] array1 = new float[2];
            array1[0] = this.x;
            array1[1] = this.y;

            return array1;
        }

        @Override
        public String toString() {
            return "Point2D{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }


