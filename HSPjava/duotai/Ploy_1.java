public class Ploy_1 {
    public static void main(String[] args) {
        Master master = new Master("yue");
        // Dog dog = new Dog("��");
        // Bone bone = new Bone("��ͷ");
        // master.Feed(dog,bone);
        // Cat cat = new Cat("è");
        // Fish fish = new Fish("��");
        // master.Feed(cat,fish);
        Animal animal = new Cat("ss");
        // animal.test();
        Cat cat  = (Cat)animal;
        cat.test();
    }
}
