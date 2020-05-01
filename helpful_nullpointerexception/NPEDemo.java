
// $ java -XX:+ShowCodeDetailsInExceptionMessages NPEDemo
class NPEDemo {
    public static void main(String[] args) {
        String value = null;
        System.out.println(value.length());
    }
}
