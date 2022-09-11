public class Playing {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(false, 45));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if(summer == false){
            if(temperature >= 25 && temperature <= 35){
                return true;
            }else{
                return false;
            }
        }else {
            if(temperature <= 45 && temperature >= 25){
                return true;
            }else {
                return false;
            }
        }
    }
}
