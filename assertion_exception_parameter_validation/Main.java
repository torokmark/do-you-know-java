public class Main {
    
    private static final String PARAMETER_NULL_CHECK_MSG = "parameter cannot be null!";

    public static void main(String[] args) {
        print(new Object());
        print("alma");
        print(null);
    }

    public static void print(Object o) {
        assert null == o : PARAMETER_NULL_CHECK_MSG;
        //if (null == o) {
        //    throw new IllegalArgumentException(PARAMETER_NULL_CHECK_MSG);
        //}
        System.out.println("done");
    }


}

