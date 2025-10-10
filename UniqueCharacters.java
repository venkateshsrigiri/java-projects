public class UniqueCharacters {
    public static void main(String[] args) {
        String  s = "lavaavalavadevdevdev";
        StringBuilder sb = new StringBuilder();

        for(int i = 0;i<s.length();i++){
            if(i ==s.indexOf(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());

    }

}
