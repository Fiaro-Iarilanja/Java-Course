public class Lasagna {
    private int ovenTime;
    private int layerPreparationTime;
    
    public int expectedMinutesInOven(){
        this.ovenTime = 40;
        return this.ovenTime;
    }
    public int remainingMinutesInOven(int actualMinutes){
        return this.expectedMinutesInOven() - actualMinutes;
    }
    public int preparationTimeInMinutes(int layers){
        this.layerPreparationTime = 2;
        return layers*this.layerPreparationTime;
    }
    public int totalTimeInMinutes(int layers, int actualMinutes){
        return this.preparationTimeInMinutes(layers) + actualMinutes; 
    }
}
