package da.Experiment.Exp2;

import java.util.Scanner;


public class Decrypt {
	public static void main(String[] args) {
		String input="";
		Scanner scanner=new Scanner(System.in);
		System.out.print("请输入加密的字符：");
		input=scanner.next();
		System.out.println("原文："+input);
		char key='x';
		StringBuilder encrypt=new StringBuilder();
		for (char i : input.toCharArray()) {
			encrypt.append((char)(i^key));
		}
		System.out.println("密文："+encrypt.toString());
		StringBuilder outputBuilder=new StringBuilder();
		for(char a : encrypt.toString().toCharArray()){
			outputBuilder.append((char)(a^key));
		}
		System.out.println("解密："+outputBuilder.toString());
	}
}
