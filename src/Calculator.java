public class Calculator {


    public void printYearsAndDays(double minutes){
        if(minutes<0){

            System.out.println("Invalid value");

        } else{
            double minutesOfYear=365*24*60;
            double years=minutes/minutesOfYear;
            double days=(minutes % minutesOfYear)/(24*60);


            System.out.println("\""+(int)minutes+ " min = "+(int)years+" y" +" and "+ (int)days+" d"+"\"");


        }




    }




}
