package org.kilo.test;


public class Sorry 
{    
	public static String chineseNum(int n){ 

		String[] num = {"��","һ","��","��","��","��","��","��","��","��"};        
		String[] digit = {"ʮ","��","ǧ","��","ʮ��"};        
		int length = String.valueOf(n).length();
		String[] results = new String[length]; 

		for(int i = 0;i < length;i++){            
			int t = n % 10;
			n = n / 10;
			results[i] = "";            
			results[i] += num[t];            
			if(t != 0 && i > 0){                
				if(t == 1 && i == length - 1 && (i == 1 || i == 5)){                    
					results[i] = ""+digit[i-1]; 
				}else{                    
					results[i] += digit[i-1];  
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

	public static void main(String[] args) {        
	 	for(int i = 1;i <= 100; i++){  
		System.out.println(chineseNum(i));        
		}    
	}
}




