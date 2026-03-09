public class Game{
    String name;
    int happinessIncr;
    int weightDecr;
    int energyDecr;
    
    public Game(String name, int happinessIncr, int weightDecr, int energyDecr){
        this.name = name;
        this.happinessIncr = happinessIncr;
        this.weightDecr = weightDecr;
        this.energyDecr = energyDecr;
    }
    
    public boolean isWinner(){
        double randomNum = Math.floor(Math.random() * 2);
        if(randomNum == 1){
            return true;
        }
        else{
            return false;
        }
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getHappinessIncr(){
        return this.happinessIncr;
    }
    
    public int getWeightDecr(){
        return this.weightDecr;
    }
    
    public int getEnergyDecr(){
     return this.energyDecr; 
    }
}
