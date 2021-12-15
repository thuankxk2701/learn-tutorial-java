package rpgabilityscores;

public class RPGAbilityscores {
    public static void main(String[] args){
        Die d6 = new Die(6,6);
        System.out.printf("Character Ability Roll:\n");
        System.out.printf("Str Int Dex Con Wis Cha\n");
        for(int i=0;i<6;i++) {
            System.out.printf("%3d ", d6.roll(3));
        }
        System.out.println();

    }
}
