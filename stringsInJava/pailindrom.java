package stringsInJava;

public class pailindrom {
            public static void main(String[] args) {
                boolean b = true;
                String str = "malayalam";
                for(int i=0; i< str.length();i++){
                    if(str.charAt(i) != str.charAt(str.length()-1-i)){
                        b=false;
                    }
                }
                System.out.println(b);
            }
}
