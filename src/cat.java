public class cat {
    public double weight;
    public String name;
    public int age;
    public String color;

    public cat(double weight, String name, int age, String color) {
        this.weight = weight;
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public cat() {
        weight = 3000;
        name = "Barsik";
        age = 3;
        color = "Orange";
    }

    public void meow () {
            System.out.println("Meow");
        }

    public void pee () {
            weight -= 20;
        }

    public void eat () {
            weight += 50;
        }
}
