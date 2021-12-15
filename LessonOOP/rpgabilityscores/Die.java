package rpgabilityscores;

import java.util.Random;

public class Die {
    private int _sides;
    private int _value;
    private Random _generator;

    public Die(int sides){
        this._sides=sides;
        this._generator=new Random();
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

    public int setSides(int sides) {
        this._sides = sides;
        return _sides;
    }

    public int roll(){
        _value=_generator.nextInt(_sides)+1;
        return _value;
    }

    public int roll(int n){
        int sum=0;
        for(int i=0; i<n; i++){
            sum+=this.roll();
        }
        return sum;
    }

    public int getValue()
    {
        return _value;
    }
}
