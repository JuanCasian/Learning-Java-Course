import java.util.Random;

public class Dice {
    int value;

    public Dice(){
        this.roll();
    }

    public void roll ()
    {
        int res;
        Random rand = new Random();
        this.value = rand.nextInt(6) + 1;
    }
}
