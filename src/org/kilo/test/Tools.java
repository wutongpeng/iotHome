package org.kilo.test;

public class Tools {

	public static void main(String[] args) {
//		int a=101;
//		int b=a % 10;
//		int c= a / 10;
//		System.out.println("a="+a+"\n"+"b="+b+"\n"+"c="+c);
		//for(int i = 1;i <= 10000; i++){  
		
			System.out.println(chineseNum(101)+"��"+" �Բ���");        
			//}    

	}
	
	public static String chineseNum(int n){ 

		String[] num = {"��","һ","��","��","��","��","��","��","��","��"};        
		String[] digit = {"ʮ","��","ǧ","��","ʮ��"};        
		int length = String.valueOf(n).length();
		String[] results = new String[length]; 
        System.out.println("n="+n+"\n");
		for(int i = 0;i < length;i++){  
        System.out.println("i="+i+"\n");   
			int t = n % 10; 
            System.out.println("t="+t+"\n");			
			n = n / 10; 
            System.out.println("n="+n+"\n");
			results[i] = ""; 
            System.out.println("results"+"["+i+"]"+"="+results[i]+"\n");
			results[i] += num[t];
            System.out.println("results"+"["+i+"]"+"="+results[i]+"\n");
			if(t != 0 && i > 0){                
				if(t == 1 && i == length - 1 && (i == 1 || i == 5)){                    
					results[i] = ""+digit[i-1]; 
					System.out.println("results"+"["+i+"]"+"="+results[i]+"\n");
				}else{                    
					results[i] += digit[i-1];  
					System.out.println("results"+"["+i+"]"+"="+results[i]+"\n");
				}            
			}        
		}        
		String result = "";        
		boolean empty = false;         
		for(int i = length - 1;i >= 0;i--){            
			if(results[i].equals("��")){                
				empty = true;            
			}else{                
				if(empty){                    
					result += "��";                    
					empty = false;                
				}                
			    result += results[i];            
			}        
		}        
		return result;   
    } 

}
