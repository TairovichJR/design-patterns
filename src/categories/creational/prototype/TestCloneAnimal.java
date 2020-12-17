package categories.creational.prototype;

public class TestCloneAnimal {
    public static void main(String[] args) {

        CloneFactory animalMaker = new CloneFactory();

        Sheep sally = new Sheep("Sally");
        Sheep clonedSheep = (Sheep) animalMaker.getClone(sally);

        System.out.println(sally);
        System.out.println(clonedSheep);

        clonedSheep.setName("Kelly");

        System.out.println(sally);
        System.out.println(clonedSheep);

        System.out.println("Sally hashcode: " + System.identityHashCode(sally));
        System.out.println("Cloned Sally hashcode: " + System.identityHashCode(clonedSheep));

    }
}
