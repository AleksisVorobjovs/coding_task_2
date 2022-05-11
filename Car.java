//idk much about cars
//Create a Car class which inherits from Vehicle class.
public class Car extends Vehicle{
    double steeringWheelAngle;
    int numberOfGears;
    int currentGear;

    public Car(double maxSpeed,String brand,String color,int numberOfGears){
        super(maxSpeed,brand,color);
        this.numberOfGears=numberOfGears;

    }

    public void startVehicle(){
        if(this.currentGear==1){
            this.vectorialSpeed=5;
            System.out.println("Starting car");
        }
    }
    public void speedUp(){
        if(this.currentGear<numberOfGears&&this.vectorialSpeed%20==0){
            this.currentGear+=1;
            this.vectorialSpeed+=5;
            System.out.println("wrom wrom");
        } else if (this.vectorialSpeed<this.maxSpeed) {
            this.vectorialSpeed+=5;
        }else{
            System.out.println("can't wrom wrom any faster");
        }
    }
    public void speedDown(){
        if(this.currentGear>-1&&this.vectorialSpeed%20==0){
            this.currentGear-=1;
            this.vectorialSpeed+=5;
            System.out.println("wromn't wromn't");
        } else if (this.vectorialSpeed<this.maxSpeed) {
            this.vectorialSpeed+=5;
        }else{
            stopVehicle();
        }
    }
    public void stopVehicle(){
        this.currentGear=1;
        this.vectorialSpeed=0;
        System.out.println("car has stopped");
    }
    public void turnLeft(){
        System.out.println("left");
        if(this.steeringWheelAngle>-270)
            this.steeringWheelAngle -= 45;
    }
    public void turnRight(){
        System.out.println("right");
        if(this.steeringWheelAngle>270)
            this.steeringWheelAngle += 45;
    }
}
