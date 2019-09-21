package 异常;

import java.util.Scanner;
import org.apache.log4j.Logger;
public class Test1 {
    public static Logger logger=Logger.getLogger(Test1.class);

    public static void main(String[] args) {


            Scanner input=new Scanner(System.in);
            System.out.println("请输入1-3的整数");

            try {
                int number =input.nextInt();
                logger.debug(number);
                switch (number){
                    case 1:
                        System.out.println("C#");
                        break;
                    case 2:
                        System.out.println("java");
                        break;
                    case 3:
                        System.out.println("Html");
                        break;
                    default:
                        System.err.println("您输入的不在1-3范围");
                        break;
                }

            }
            catch (Exception ex){

                System.err.println("输入的不是整数");
                logger.error(ex.getMessage());
            }
            finally {
                System.err.println("欢迎提出建议");
            }

    }

}
