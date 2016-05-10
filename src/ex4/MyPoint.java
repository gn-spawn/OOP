package ex4;

class MyPoint {
    int x;
    int y;

    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public double getR() {
        return Math.sqrt(getX()*getX() + getY()*getY());
    }

    public double getTheta() {
        return Math.toDegrees(Math.atan2((double)getY(), (double)getX()));
    }

    public double distance(MyPoint anotherPoint) {
        return Math.sqrt((double)(this.getX()- anotherPoint.getX())*(double)(this.getX() - anotherPoint.getX()) + (double)(this.getY() - anotherPoint.getY())*(double)(this.getY() - anotherPoint.getY()));
    }

    public String toString() {
        return "a MyPoint(" + getX() + ", " + getY() + ")";
    }

    public boolean equals(MyPoint aPoint) {
        boolean ans;
        ans = (getX() == aPoint.getX()) && (getY() == aPoint.getY());
        return ans;
    }
}

