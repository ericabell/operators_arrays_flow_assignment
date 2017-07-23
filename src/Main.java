public class Main {

    public static void main(String[] args) {
        System.out.println("begin");

        /* check for empty args, print list of args in non-empty */
        if(args.length < 2) {
            System.out.println("Didn't pass enough args");
        }
        else {
            System.out.println(" * Printing arguments passed into main");
            for (int i = 0; i < args.length; i++) {
                System.out.println("   Argument " + i + ": " + args[i]);
            }

            /* Assume first argument is a number, convert to int */
            int firstArgument = Integer.parseInt(args[0]);

            /* Branches on one of the arguments */
                System.out.println(" * Branching on first argument int.");
                if( firstArgument == 1 ){
                    System.out.println("   Hey! First argument was 1.");
                }
                else {
                    System.out.println("   First argument was not 1.");
                }

            /* switch on the second argument, which is a string */
                System.out.println(" * Switch on second argument.");
                switch(args[1]) {
                    case "one":
                        System.out.println("   second argument was one");
                        break;
                    case "two":
                        System.out.println("   second argument was two");
                    case "three":
                        System.out.println("   second argument was three");
                    default:
                        System.out.println("   second argument was not one, two, or three");
                }
        }



    }
}
