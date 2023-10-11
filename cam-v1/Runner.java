public class Runner {
    public Runner(){
        VirtualPet v = new VirtualPet();
        v.exercise();
        takeABeat(1000);
        v.feed();
        String ans = getAnswer("How are you");
        if (ans.equalsIgnoreCase)
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