package abcd;

public class DuplicateCharCount_String {

	public static void main(String[] args) {
		String s="social distance";
		int count;
		//Converts given string into character array  
		char str[]=s.toCharArray();
		for(int i = 0; i <s.length()-1; i++) {  
			count = 1;  
			for(int j = i+1; j <s.length()-1; j++) {
				
                    count++;  
                    //Set string[j] to 0 to avoid printing visited character  
              

			}
		}

	}
}
//public class DuplicateCharacters {  
//    public static void main(String[] args) {  
//       String string1 = "Great responsibility";  
//       int count;  
//         
//       //Converts given string into character array  
//       char string[] = string1.toCharArray();  
//         
//       System.out.println("Duplicate characters in a given string: ");  
//       //Counts each character present in the string  
//       for(int i = 0; i <string.length; i++) {  
//           count = 1;  
//           for(int j = i+1; j <string.length; j++) {  
//               if(string[i] == string[j] && string[i] != ' ') {  
//                   count++;  
//                   //Set string[j] to 0 to avoid printing visited character  
//                   string[j] = '0';  
//               }  