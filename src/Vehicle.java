public class Vehicle {

    protected int changing_gears;


    public void setChanging_gears(int x) {
        if (x > 0 & x <= 5) {
            System.out.println(this.changing_gears = x);

        } else {
            System.out.println("The value introduced it is invalid");
        }


    }
}