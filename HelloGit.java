package com.github.yao;

import java.util.Random;

public class  HelloGit{
	public static void main(String[] args){
		Random r = new Random();
		int num = r.nextInt(10);
		if(num==1){
			System.out.println("恭喜您中奖了");
		}else{
			System.out.println("抽中的数字为：" + num);
			System.out.println("谢谢参与，继续加油");
		}		
	} 
}