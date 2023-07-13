public class MyString implements IString{
    public boolean isPrime(int n){
        if(n < 2){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    @Override
    public int f1(String str) {
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                int num = Integer.parseInt(""+ str.charAt(i));
                if(isPrime(num)){
                    count++;
                }
            }
        }
        return count;
    }
       
    @Override
    public String f2(String str) {
        String result = "";
        String[] c = str.split(" ");
        for(int i = c.length - 1; i >= 0; i--){
            result += " " + c[i];
        }
        return result.trim();
    }
    
}
