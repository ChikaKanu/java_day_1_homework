public class WaterBottle {

    private int volume;
    private int currentVolume;
    private int eachDrink;


    public WaterBottle(int volume, int currentVolume, int eachDrink){
        this.volume = 100;
        this.currentVolume = currentVolume;
        this.eachDrink = 10;


    }

    public int getVolume(){
        return this.volume;
    }

    public int drinkWater(int currentVolume){
        if(currentVolume > eachDrink) {
            return this.volume = currentVolume - eachDrink;
        } else {
            return this.volume;
        }
    }

    public double emptyWaterBottle(int currentVolume){
        if(currentVolume > 0) {
            return this.volume = 0;
        }
        return this.volume;
    }


    public double fillWaterBottle(int currentVolume){
        if(currentVolume == 0){
            return this.volume = 100;
        }
        return this.volume;
    }



//    The volume should start at 100.
//    Add a drink function that takes 10 from the volume each time it is called.
//    Create an empty function that brings the volume down to 0.
//    Create a fill function that fills the volume back to 100.

}
