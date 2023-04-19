public class exercise_2023_4_19 {
    public static void main(String[] args) {

        String str=scan.nextLine();
    }
//    //PTA L1-038 新世界
//    public static void main(String[] args){
//        System.out.println("Hello World");
//        System.out.println("Hello New World");
//    }
}
//PTA L1-035 情人节
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] str=new String[100];
        int i=0;
        while(scan.hasNextLine()){
            str[i++]=scan.nextLine();
        }
        if(str[1]!=null&&(!(".".equals(str[1])))){
            if(str[13]!=null){
                System.out.printf("%s and %s are inviting you to dinner...",str[1],str[13]);
            }else {
                System.out.printf("%s is the only one for you...",str[1]);
            }
        }else {
            System.out.printf("Momo... No one is for you ...");
        }
    }
}