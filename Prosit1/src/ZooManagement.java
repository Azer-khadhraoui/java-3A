public class ZooManagement {
    public static void main(String[] args) {

        Animal lion = new Animal("Felidae", "Simba", 5, true);


        Zoo myZoo = new Zoo("My Zoo", "Tunis", 20);


        myZoo.displayZoo();

        System.out.println(myZoo);
        System.out.println(myZoo.toString());


        Animal tiger = new Animal("Felidae", "Shera", 3, true);
        Animal parrot = new Animal("Psittacidae", "Polly", 2, false);


        System.out.println(lion);
        System.out.println(tiger);
        System.out.println(parrot);
    }
}
