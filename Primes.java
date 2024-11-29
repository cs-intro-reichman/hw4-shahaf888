

public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        boolean[] newArray = new boolean [n+1];

        System.out.println("Prime numbers up to " + n + ":");

        for (int i = 0; i < newArray.length; i++){
            if (i == 0 || i == 1){
                newArray[i] = false;
            }
            else{
                newArray[i] = true;
            }
        }
       int i = 2;
        while (i < newArray.length){

            if(newArray[i] == true){
                int j = i * i;
                while(j < newArray.length){
                    newArray[j] = false;
                    j = j+i;
                }
            }
            i++;
        }
        int counter = 0;
        for (int m = 0; m < newArray.length; m++){
            if (newArray[m] == true){
                counter++;
                System.out.println(m);
            }

        }


        if (counter > 0){
            System.out.println("There are " + counter + " primes between 2 and " + n + " (" + (counter*100/n) + "% are primes)");

        }
        else{
            System.out.println("There are " + 0 + " primes between 2 and " + n + "(0% are primes)");

        }


    }
}