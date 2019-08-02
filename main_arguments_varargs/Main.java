
class Main {
    public static void main(String... args) {
        System.out.println("Size: " + args.length);
        for(String arg: args) {
            System.out.println(arg);
        }

        String[] arr = {"apple", "nut", "plum"};
        basket(arr);
    }

    public static void basket(String... args) {
      
    }
}
