package roleplaying;

public class Actor {
    private String _name;
    private int _health;
    private int _armorClass;
    private Weapon _weapon;

    public Actor(String name, int health, int armorClass, Weapon weapon)
    {
        this._name = name;
        this._health = health;
        this._armorClass = armorClass;
        this._weapon = weapon;
    }

    public String name() { return _name; }

    public int health() { return _health; }

    public int armorClass() { return _armorClass; }

    public Weapon weapon() { return this._weapon; }

    public boolean isDead() {
        return (this._health <=0);
    }
    public int takeDamage(int amount) {
        this._health = this._health - amount;
        return this._health;
    }

    @Override
    public String toString()
    {
        return String.format("%s: Armor:%d, Health:%d, Weapon: %s", this._name, this._armorClass, this._health, this.weapon());
    }
}
