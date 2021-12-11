package roleplayinggame;

import roleplaying.Actor;
import roleplaying.Weapon;

public class RolePlayingGame {
    public static void main(String[] args) {
        Weapon sword = new Weapon("Sword", "slashes",  10);
        Weapon bite = new Weapon("Bite", "bites", 5);
        Actor knight = new Actor("Sir Glegane", 20, 5, sword);
        Actor snake = new Actor("Viper", 10, 1, bite);
        System.out.println(knight);
        System.out.println(snake);
        int damage = snake.weapon().hitDamage();
        knight.takeDamage(damage);
        System.out.printf("%s %s for %d damage.\n", snake.name(), snake.weapon().action(),damage);
        damage = knight.weapon().hitDamage();
        System.out.printf("%s %s for %d damage.\n", knight.name(), knight.weapon().action(),damage);
        snake.takeDamage(damage);
        System.out.println(knight);
        System.out.println(snake);
    }
}
