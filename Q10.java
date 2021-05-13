// Question: https://www.hackerrank.com/challenges/java-static-initializer-block/problem


static int B, H;
static boolean flag;

static{
    Scanner scan = new Scanner(System.in);
    B = scan.nextInt();
    H = scan.nextInt();
    if((B > 0)&&(H > 0))
        flag = true;
    else{
        flag = false;
        System.out.print("java.lang.Exception: Breadth and height must be positive");
    }
        
}

    
