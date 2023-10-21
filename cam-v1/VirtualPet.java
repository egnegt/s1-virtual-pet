/* Virtual Pet, version 1
 * 
 * @author Cam
 * @author ?
 */
public class VirtualPet {
    
    VirtualPetFace face;
    int hunger = 0;   // how hungry the pet is.
    int happiness = 30;
    int points = 0;
    boolean taken = false;
    
    // constructor
    public VirtualPet() {
        face = new VirtualPetFace();
        face.setImage("normal");
        face.setMessage("Hello.");
    }
    
    public void feed() {
        if (hunger > 10) {
            hunger = hunger - 10;
        } else {
            hunger = 0;
        }
        face.setMessage("Yum, thanks");
        face.setImage("normal");
    }
    
    public void exercise() {
        hunger = hunger + 3;
        face.setMessage("1, 2, 3, jump.  Whew.");
        face.setImage("tired");
        if (hunger >= 10){
            face.setImage("skeleton");
            face.setMessage("I'm dead");
        }
    }
    
    public void sleep() {
        hunger = hunger + 1;
        face.setImage("asleep");
    }

    public void doExtra() {
        if (happiness > 0){
            face.setMessage("Let's do an extracurricular!");
            points = points + 3;
            face.setImage("extra");
            happiness = happiness - 5;
            if (happiness <= 0){
                face.setImage("verysad");
                face.setMessage("I don't wanna do this anymore");
        }
    }
        else{
            face.setMessage("I can't do this anymore. Let's just apply!");
    }
    }

    public void doSat(){
        if (!taken){
            face.setMessage("Let's take the SAT!");
            if (happiness > 0){
                points = points + 6;
                face.setImage("sat");
                happiness = happiness - 10;
                taken = true;
                if (happiness <= 0){
                    face.setImage("verysad");
                    face.setMessage("I don't wanna do this anymore");
        }
    }
            else{
                face.setMessage("I can't do this anymore. Let's just apply!");
        }
    }
        else{
            face.setMessage("I have already taken the SAT");
        }

    }

    public void doClasses(){
        face.setMessage("Let's take some hard courses!");
        if (happiness > 0){
            points = points + 4;
            face.setImage("classes");
            happiness = happiness - 5;
            if (happiness <= 0){
                face.setImage("verysad");
                face.setMessage("I don't wanna do this anymore");
        }
    }
        else{
            face.setMessage("I can't do this anymore. Let's just apply!");
        }
    }

    public void apply(){
        face.setMessage("Time to apply!");
        if (points >= 15){
            face.setImage("berkeley");
            face.setMessage("I got into Berkeley!");
        }
        else{
            face.setImage("verysad");
            face.setMessage("I didn't get in...");
        }

        }
    }



 // end Virtual Pet
