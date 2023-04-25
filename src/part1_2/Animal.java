package part1_2;
//Part1.2 Animal sounds example

import java.util.ArrayList;

//1. create an abstract class Animal with abstract method makeSound()
abstract class Animal {
    public abstract void makeSound();
}

//2. create subclasses of Animal: Cat, Dog, Cow, Pig.
//3. override makeSound in subclasses
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Moo");
    }
}

class Pig extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Oink");
    }
}

class Main {
    public static void main(String[] args) {
        //4. create ArrayList<Animal> and add there different objects of Cat, Dog, Cow, Pig
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Cow());
        animals.add(new Pig());
        //5. iterate through ArrayList and call for every element makeSound();
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}


