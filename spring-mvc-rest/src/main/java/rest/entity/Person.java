package rest.entity;

public enum Person {
    Jancsi(1L, 26), Julcsa(2L, 25), Marcsi(3L, 28), Borcsa(4L, 26), Karcsi(5L, 28);

    private Long id;
    private int age;
    private boolean exist = true;

    private Person(Long id, int age) {
        this.id = id;
        this.age = age;
    }

    public static Person findById(Long id) {
        for (Person person : values()) {
            if (person.id.equals(id) && person.exist) {
                return person;
            }
        }
        return null;
    }

    public static Person findByName(String name) {
        for (Person person : values()) {
            if (person.name().equals(name) && person.exist) {
                return person;
            }
        }
        return null;
    }

    public void setExist(boolean exist) {
        this.exist = exist;
    }

    @Override
    public String toString() {
        return "[id=" + id + ", name=" + name() +", age=" + age + "]";
    }
}
