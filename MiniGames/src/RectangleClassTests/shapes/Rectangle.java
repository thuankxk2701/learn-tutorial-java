package RectangleClassTests.shapes;

public class Rectangle {
    private int _length;
    private int _width;

    public Rectangle(int length,int width){
        this._length=length;
        this._width=width;
    }
    public Rectangle(){
        this._width=0;
        this._length=0;
    }

    public int getWidth()  {
        return this._width;
    }

    public int setWidth(int width) {
        return (this._width = width);
    }
    public int setLength( int length) {
        return (this._length = length);
    }
    public int area() {
        return this._length*this._width;
    }
    public int perimeter() {
        return 2*(_length+_width);
    }
}
