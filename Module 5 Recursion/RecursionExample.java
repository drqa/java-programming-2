public class RecursionExample { 
    public static void main(String[] args) {
        keepTalking(10, "blablabla");
    }
    public static void keepTalking(int n, String word) {

        if(n == 0){
            System.out.println("Phew, done talking!");
        }else {
            System.out.println(word);
            n--;
            keepTalking(n, word);
        }
    }
}







