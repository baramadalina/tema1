public class Car extends Vehicle{

    protected int speed=10;

    public void increasingSpeed(int speedToIncrease){
        if(speedToIncrease > 0) {
            this.speed+= speedToIncrease;
            System.out.println("New speed after increase is : " +this.speed);
        }
    }


    public void decreasingSpeed(int speedToDecrease) {

        if(speedToDecrease < 0) {
            System.out.println("Speed cannot be negative");
            return;
        }
        int tmpSpeed = this.speed - speedToDecrease;
            if(tmpSpeed < 0){
            System.out.println("Speed result after decrease seems to be negative");
            return;

        }else{
            this.speed -= tmpSpeed;
            System.out.println("New speed after decrease is : " +this.speed);
        }

    }








}