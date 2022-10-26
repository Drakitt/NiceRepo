public class Main {
  public static void main(String[] args) {
  
  String anyWord = "aefrsnh";
  
  System.out.println(anyWord.length());
  
  char[] arrayWord = anyWord.toCharArray();
  
  Arrays.sort(arrayWord);
  
  String result = "";
  
    for(int i = 0; i < anyWord.length(); i++) 
    {
    	if(i>0 && i < anyWord.length()-1){
        	
            result = result+(arrayWord[anyWord.length()-i]);
            System.out.println(arrayWord[anyWord.length()-i]);
        
        }
    }
		System.out.println(result);
  }
}
