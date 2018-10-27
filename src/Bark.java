public class Bark {


    public boolean bark(boolean barking, int hourOfDay) {

        if(barking) {
            if(hourOfDay <0 || hourOfDay > 23) {
                //System.out.println("HourOfDay is not in range [0:00 am - 23:00 pm]");
                return false;
            }
            //check hour interval
            if(hourOfDay < 8 || hourOfDay > 22) {
                return true;
            } else {
                return false;
            }
        } else {
            //return false dog is not barking
            return false;
        }
    }
}



