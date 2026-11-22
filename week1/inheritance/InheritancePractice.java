package week1.inheritance;

public class InheritancePractice {
    public static void main(String[] args){

        // Person Class
        Person p = new Person("Rami", 26);
        System.out.println(p);

        p.setAge(120);
        System.out.println(p);

        p.setAge(-1);
        System.out.println(p);

        p.setAge(150);
        System.out.println(p);

        p.setAge(28);
        System.out.println(p);

        System.out.println(p.getAge());

        // Point Class
        Point p1 = new Point(1, 2);
        Point p2 = p1.move(3, 4);
        System.out.println(p1);
        System.out.println(p2);

        // Animal Class
        Animal a = new Animal("Generic");
        Dog d = new Dog("Shiro");
        Cat c = new Cat("Tom");
        a.speak();
        d.speak();
        c.speak();
        d.fetch();
        System.out.println(d.getName());
    }

}
