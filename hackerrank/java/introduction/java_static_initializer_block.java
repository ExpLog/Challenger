//https://www.hackerrank.com/challenges/java-static-initializer-block?h_r=next-challenge&h_v=zen

    static int B;
    static int H;
    static boolean flag = false;
    static {
        Scanner in = new Scanner(System.in);
        B = in.nextInt();
        H = in.nextInt();
        if(B > 0 && H > 0) {
            flag = true;
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }