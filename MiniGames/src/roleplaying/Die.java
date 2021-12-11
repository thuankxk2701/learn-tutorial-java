package roleplaying;
import java.util.Random;

public final class Die {
    private int  _sides;
    private int _value;
    private Random _generator;

    public Die(int sides) {
        this._sides  = sides;
        this._generator = new Random();
        this.roll();
    }
    public Die(int sides, int seed) {
        this._sides  = sides;
        this._generator = new Random(seed);
        this.roll();
    }

    public int getSides() {
        return _sides;
    }
    public int getValue()
    {
        return _value;
    }
    public int setSides(int sides) {
        this._sides = sides;
        return _sides;
    }

    public int roll(){
        this._value=_generator.nextInt(this._sides)+1;
        return  this._value;
    }




}
