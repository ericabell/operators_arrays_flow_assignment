public class Main {

    public static void main(String[] args) {
        System.out.println("begin");

        /* check for empty args */
        if(args.length == 0) {
            System.out.println("Didn't pass any args");
        }
        else {
            System.out.println("printing arguments passed into main");
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + i + ": " + args[i]);
            }
        }

    }
}
