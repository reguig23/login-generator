package geco;

import java.util.Random;

public class PasswordGeneration {

    private static final Random rand = new Random();
    private static final   String Xsi ="abcdefghijklmnopqrstuvwxyz";
    private static final String Gamm ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String Iot = "1234567890";
    private static final String[] listeChar = {Xsi,Gamm,Iot};
    public String getRandomPassword(){
        String mdp="";

        for (int i =0;i<8;i++){
            int r = rand.nextInt(3);
            String charalea = listeChar[r];
            int cha = rand.nextInt(charalea.length());
            mdp=mdp+charalea.charAt(cha);
        }

        return mdp;
    }
}
