public class Cat
{
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public double getAge()
    {
        return age;
    }
    // add a getAge() getter below for
    // obtaining the Cat's age



    // MODIFY this method so that the Cat randomly
    // returns one of three different messages
    // (make any messages you want!) rather than always returning "meow".
    // Each message should have equal chance of being returned.
    public String speak() {
        if (Math.random() > 0.66666667)
        {
            return "meow!";
         } else if (Math.random() > 0.3333334) {
            return "hi";
        }else{
            return "It's time for food";
        }

    }

    public void introduce() {
        System.out.println("Hello. My name is " + name + " and I am " + age + " years old. Now, mind your own business.");
    }
}