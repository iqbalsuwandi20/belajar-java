// Kata kunci super untuk mengambil method
class Shape {
    int getCorner() {
        return 0;
    }
}

class Retangle extends Shape {
    int getCorner() {
        return 4;
    }
    int getParentCorner() {
        return super.getCorner();
    }
}
