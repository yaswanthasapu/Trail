package task;

public class Task {
    public static void main(String[] args) throws Exception, Cust_Exception {
        String st = "Life is beautiful its really beautiful";
        //  string = string.toLowerCase();
        String words[] = st.split(" ");
        int count=0;
        //  System.out.println("Duplicate words in a given string : ");
        for(int i = 0; i < words.length; i++) {

            for(int j = i+1; j < words.length; j++) {
                if(words[i].equals(words[j])) {
               // System.out.println(words[i]);
                    count++;
                }
            }
        }
                System.out.println(count);
                if(count==0) {
                    throw new Cust_Exception("no.............");
                }



        }
}




