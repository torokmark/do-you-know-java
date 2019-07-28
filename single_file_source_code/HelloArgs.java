
class HelloArgs {
    public static void main(String[] args) {
        String strArgs = "Hello ";
        for (String arg : args) {
            strArgs += arg + ", ";
        }
        System.out.println(strArgs.substring(0, strArgs.length() - 2));
    }
}
