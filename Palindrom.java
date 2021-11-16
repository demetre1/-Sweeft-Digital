public class Palindrom {
    public static void main(String[] args){


        String original = "race car ";
        original = original.replace(" ", "");

        String reverse ="";
        for(int i = original.length() - 1; i>=0 ; i --   ) {
            reverse += original.charAt(i);
        }
        boolean Palindrom = true;
        for(int i = 0; i < original.length(); i ++){
            if(original.charAt(i)!= reverse.charAt(i)){
                Palindrom = false;
            }
        }
        if(Palindrom){
            System.out.println("es aris palindromi ");
        }else{
            System.out.println("es ar aris palindromi ");
        }
    }


}
