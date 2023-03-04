public class StringBufferReplace {
    
    public static void main(String[] args) {
        String str = "Nguyen Ngoc Diem";
       StringBuffer s = new StringBuffer(str);
       System.out.println(s);
       s.replace(0, 5, "Le");
       System.out.println(s);
    }
}
