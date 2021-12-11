package roleplaying;

public class Weapon {
    private String _name;
    private String _action;
    private int _maxDamage;
    private int _criticalHit;
    private Die _die;

    public Weapon(String name, String action, int maxDamage)
    {
        this._name = name;
        this._action = action;
        this._maxDamage = maxDamage;
        this._die = new Die(_maxDamage);
    }
    public String name() { return _name; }

    public String action() { return _action; }

    public int maxDamage() { return _maxDamage; }

    public int hitDamage() {
        return _die.roll();
    }

    @Override
    public String toString()
    {
        return String.format("%s (Max Damage: %d)", this._name, this._maxDamage);
    }

}
