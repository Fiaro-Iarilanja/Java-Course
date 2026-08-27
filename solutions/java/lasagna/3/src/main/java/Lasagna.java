public class Lasagna {
    private int ovenTime;
    private int layerPreparationTime;

    public Lasagna(){
        ovenTime = 40;
        layerPreparationTime = 2;
    }
    
    public int expectedMinutesInOven(){
        return this.ovenTime;
    }
    public int remainingMinutesInOven(int actualMinutes){
        return this.expectedMinutesInOven() - actualMinutes;
    }
    public int preparationTimeInMinutes(int layers){
        return layers*this.layerPreparationTime;
    }
    public int totalTimeInMinutes(int layers, int actualMinutes){
        return this.preparationTimeInMinutes(layers) + actualMinutes; 
    }
}
