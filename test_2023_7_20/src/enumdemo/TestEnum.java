package enumdemo;


//Java当中的枚举类非常特殊，都是默认继承于Java原生的Enum类
public enum TestEnum {
    //枚举对象
    RED(1, "RED"),
    WHITE(2, "WHITE"),
    GREEN(3, "GREEN");

    public String color;
    public int ordinal;

    private TestEnum(int ordinal, String color) {
        this.ordinal = ordinal;
        this.color = color;
    }

    /*private TestEnum() {

    }*/

    public static void main2(String[] args) {
        TestEnum[] testEnums = TestEnum.values();
        for (int i = 0; i < testEnums.length; i++) {
            System.out.println(testEnums[i] + " " + testEnums[i].ordinal());
        }
        System.out.println("========");
        TestEnum testEnum = TestEnum.valueOf("RED");
        System.out.println(testEnum);

        System.out.println(RED.compareTo(WHITE));
    }

    public static void main1(String[] args) {
        TestEnum testEnum = TestEnum.RED;
        switch (testEnum) {
            case RED:
                System.out.println("红色");
                break;
            case GREEN:
                System.out.println("绿色");
                break;
            case WHITE:
                System.out.println("白色");

                break;
            default:
                break;
        }
    }
}
