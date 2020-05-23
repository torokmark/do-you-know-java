
record Person(String name, int age) implements Comparable<Person> {

    // private String address; // does not compile, it must be static

    Person() {
        this("default", 0);
    }

    @Override
    public int compareTo(Person other) {
        return 0;
    }

}

class Main {

    private record Box(int a, int b, int c) {}

    public static void main(String[] args) {
        record Box(int a, int b, int c) {}
        Person person = new Person("jancsi", 24);        
        System.out.println(person);
        // person.setName("julcsa"); // compile time error
        System.out.println(person);

        Person other = new Person();
        System.out.println(other);
    }
}
