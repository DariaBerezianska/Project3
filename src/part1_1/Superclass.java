package part1_1;
//Part1.1 Basic case of polymorphic method
class Superclass {
    //1. create the method inside superclass
    public void theMethod() {
        System.out.println("Called method from the superclass");
    }
}

//2. extend superclass with subclass
class Subclass extends Superclass {
    //3. override the method of the superclass in the subclass.
    @Override
    public void theMethod() {
        System.out.println("Called method from the subclass");
    }
}

class Main {
    public static void main(String[] args) {
        //4. Superclass a = new Subclass()
        Superclass obj = new Subclass();
        //5. call theMethod for this object
        obj.theMethod(); //will call the method of the subclass because it overrides the method of the superclass
    }
}


