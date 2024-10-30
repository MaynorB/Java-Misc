import java.lang.Math;

public class Hw08 {
    
    public int calc(int n){
        int result = 0;
        for(int i = n; i < 1000; i++){
            if((Math.pow(2, i) % i == 2) && !checkPrime(i)){
                result = i;
                break;
            }
        }
        return result;
    }

    public boolean checkPrime(int n){
        for (int j = 2; j < n; j++){
            if (n % j == 0){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Hw08 num = new Hw08();
        System.out.println(num.calc(0)); //gets 341
        System.out.println(num.calc(342)); //gets 561
        System.out.println(num.calc(562)); //gets the next psudoprime
        System.out.println(Math.pow(3, num.calc(562) % 3)); //checks the psudoprime
    }
}
