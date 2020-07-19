class PrintThreeArguments {

    public static void main(String[] args) {

        System.out.println(args.length);
        if (args.length > 2)
        {
            for (int i = 0; i < 3; i ++)
            {
                System.out.println(args[i]);
            }
        }
        System.out.println(args);
        String s = new String("alo");
        String t = new String("alo");
        System.out.println(s == t);
    }
}