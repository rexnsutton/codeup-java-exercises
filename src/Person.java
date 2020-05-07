class Person {
    private String name;

    // the Person constructor
    public Person(String name) {
    this.name = name;
    }
    // returns the person's name
    public String getName(){
        return name;

    }
    // changes the name property to the passed value
    public void setName(String name){
    this.name = name;
    }
    // prints a message to the console using the person's name
    public void sayHello(){
        System.out.println("hello there " + name);

    }

    public static void main(String[] args) {
//        Person p1 = new Person("rex");
//        Person p2 = new Person("dave");
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());

    }


}
