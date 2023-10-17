import javax.swing.*;

public class Runner {
    public Runner(){
        VirtualPet v = new VirtualPet();
        v.exercise();
        takeABeat(1000);
        String ans = getAnswer("How are you?");
        if(ans.equals("Great")){
            v.face.setMessage("Great!");
        }
        v.exercise();
        takeABeat(1000);
        v.exercise();
        takeABeat(1000);
        v.exercise();
        takeABeat(1000);
    }
//jeremy was here


    public String getAnswer(String q){
        String s = (String)JOptionPane.showInputDialog(
            new JFrame(),
            q,
            "Get a Response",
            JOptionPane.PLAIN_MESSAGE
        );
        return s;
    }

    public void takeABeat(int milliseconds){
        try {
            Thread.sleep(milliseconds);
        } catch(Exception e){

        }
    }

    public static void main(String[] args) {
        new Runner();
    }
}