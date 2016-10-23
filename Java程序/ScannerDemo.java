/**
* 程序3-3:一个简单的控制台输入程序
*/
import java.util.Scanner;	//加载程序运行需要的Scanner类
/**
* 一个控制台的输入程序
*/
public class ScannerDemo{
	public static void main(String[] args){
		System.out.println("请输入若干个数，每输入一个数后按回车确认");
		System.out.println("最后，输入任一个非数字字符表示结束");
		double sum = 0;
		int m = 0;			//表示输入的数值个数
		Scanner reader = new Scanner(System.in);
		while (reader.hasNextDouble()){
			sum += reader.nextDouble();
			m++;
		}
		System.out.printf("%d个输入的数值和为%f",m,sum);
	}
}
