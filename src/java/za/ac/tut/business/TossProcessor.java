
package za.ac.tut.business;


public class TossProcessor {

    public TossProcessor() {
    }
    
    public String determineOutcome(String toss,String guess){
        String outcome ="You win, server loses";
        
        if(toss.equals(guess)){
            outcome="You lose, server wins";
        }
        return outcome;
      
    }
}
