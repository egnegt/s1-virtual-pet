import javax.swing.*;

public class Runner {
    public Runner(){
        VirtualPet v = new VirtualPet();
        v.face.setMessage("Let's apply for college!");
        takeABeat(5000);
        v.doExtra();
        takeABeat(5000);
        v.doSat();
        takeABeat(5000);
        v.doSat();
        takeABeat(5000);
        v.doClasses();
        takeABeat(5000);
        v.doClasses();
        takeABeat(5000);
        v.doExtra();
        takeABeat(5000);
        v.doExtra();
        takeABeat(5000);
        v.apply();



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