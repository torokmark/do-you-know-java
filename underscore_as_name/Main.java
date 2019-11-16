
// Java 7 allows single underscore as an identifier
// while Java 9 and upwards deny it.
// Multiple underscores concatenated next to each other as ok with both version
class Main {
    public static void main(String[] args) {
        int _ = 1;
        System.out.println(_);

        int __ = 1;
        System.out.println(__);
    }
}
