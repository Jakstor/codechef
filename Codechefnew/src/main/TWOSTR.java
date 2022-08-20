package main;

import java.util.Scanner;

public class TWOSTR {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int j=0;j<t;j++){
		    int flag = 0;
		    String str1 = sc.next();
		    String str2 = sc.next();
		    String[] str1Arr = str1.split("");
		    String[] str2Arr = str2.split("");
		    for(int i=0;i<str1.length();i++){
		        System.out.println(str1Arr[i]);
		        System.out.println(str2Arr[i]);
		        if(!str1Arr[i].equals(str2Arr[i])){
		            if(!str1Arr[i].equals("?") && !str2Arr[i].equals("?")){
		                flag = 1;
		                break;
		            }
		        }
		    }
		    if(flag == 1){
		        System.out.println("No");
		    }
		    else{
		        System.out.println("Yes");
		    }
		    
		}
	}

}
