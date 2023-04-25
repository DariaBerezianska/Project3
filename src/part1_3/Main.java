package part1_3;
//Part1.3 Animal sounds example extended

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //9. ArrayList<SoundMaker> and add there different objects of Cat, Dog, Cow, Pig, Bee, Cricket, Frog
        ArrayList<SoundMaker> livingBeings = new ArrayList<>();
        livingBeings.add(new Cat());
        livingBeings.add(new Dog());
        livingBeings.add(new Cow());
        livingBeings.add(new Pig());
        livingBeings.add(new Bee());
        livingBeings.add(new Cricket());
        livingBeings.add(new Frog());
        //9. iterate through ArrayList and call for every element makeSound();
        for (SoundMaker livingBeing : livingBeings) {
            livingBeing.makeSound();
        }
    }
}
