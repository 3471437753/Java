package chapter03;

public class Java06_FlowControl_Test {
    public static void main(String[] args) {
//        //TODO 流程控制 - 小练习
//        //九层妖塔
//        /*
//                *
//              * * *
//            * * * * *（九层）
//         */
//        //打印第一层的数据
//        //println方法打印字符串之后，会自动添加换行符
//        //print方法打印字符串，不换行
//        for(int i = 0; i < 1 ; i ++){
//            System.out.println("*");
//        }
        for (int j = 0; j < 9; j++) {
            for( int i = 0; i < 8 - j; i ++ ){
                System.out.print(" ");
            }
            for(int i = 0 ; i < j * 2 - 1 ; i ++){
            System.out.print("*");
        }
        System.out.println("");
    }

    }
}
