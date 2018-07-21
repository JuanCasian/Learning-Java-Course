import java.awt.desktop.SystemEventListener;

public class Main {
    public static void main(String args[])
    {
        Pet d;
        Pet c;

        d = new Dog();
        c = new Cat();

        d.play();
        c.play();


        //  Adding some lambda functions
        Yesno isOdd = n -> n % 2 != 0;
        System.out.println(isOdd.test(5));
    }
}
