/**
 * Created by alexandraqin on 4/14/15.
 */
public class ClassesAndObjects {

    public static boolean isOlder(Cat c1, Cat c2) {
        return (c1.getAge() >= c2.getAge());
    }


    public static void makeBestFriends(Cat c1, Cat c2) {
        c1.setFavoriteFood(c2.getFavoriteFood());
    }

    public static Cat makeKitten(Cat parent1, Cat parent2) {
        Cat baby = new Cat(parent1.getName() + parent2.getName());
        baby.setAge(0);
        return baby;
    }

    public static void adoption(Cat c1, Person p1) {
        if (c1.getName().equals("Catwoman"))
            System.out.println("Catwoman will never be anyone's pet!");
        else
            c1.setOwner(p1);
    }

    public static boolean isFree(Cat c1) {
        return (c1.getOwner() == null);
    }

    public static boolean isSibling(Cat c1, Cat c2) {
        return (c1.getOwner().equals(c2.getOwner()));
    }

    public static void main (String args[]) {


        Cat c1 = new Cat("Garfield");
        Cat c2 = new Cat("Pink Panther");
        Cat c3 = new Cat("Catwoman");

        c1.setFavoriteFood("Lasagna");
        c2.setFavoriteFood("Pizza");
        c3.setFavoriteFood("Tuna");

        c1.setAge(10);
        c2.setAge(8);
        c3.setAge(30);


    }
}
