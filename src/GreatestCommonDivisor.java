public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second){
        if(first >= 10 && second >= 10){
            int greatCommonDivisor = 0;

            for(int i = 1; i <= first || i <= second; i++){
                int counter1 = first % i;
                int counter2 = second % i;

                if(counter1 == 0 && counter2 == 0){
                    greatCommonDivisor = i;
                }
            }
            return  greatCommonDivisor;
        }else{
            return -1;
        }
    }

}
