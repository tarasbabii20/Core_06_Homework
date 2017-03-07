import java.util.Arrays;

/**
 * Created by Taras on 07.03.2017.
 */
public class Main {
    public static void main(String[] args) {

        String s = "qab504_wfw_f123fwefe_12dfsf54fe";
        String words [] = s.split("[^0-9]");
        int max = 0;

        for(int i = 0; i < words.length; i++){
            if(!(words[i].equals("")) && max < Integer.parseInt(words[i])){
                max = Integer.parseInt(words[i]);
            }
        }

        System.out.println("Max number " + max);

    }
}
