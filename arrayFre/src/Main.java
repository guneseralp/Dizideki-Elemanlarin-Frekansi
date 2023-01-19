public class Main {
    static boolean isFind (int[] arr, int value){
        for (int i: arr){
            if (i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] star = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] duplicate = new int [star.length];
        int startIndex = 0;
        int count = 0;
        for (int i=0; i< star.length;i++){
            count=0;
            for (int j = 0; j< star.length;j++){
                if((i != j) && (star[i] == star[j])){
                    count++;
                }
            }
            if (!isFind(duplicate, star[i])) {
                System.out.println(star[i] +" sayısı " + (count+1) +" kere tekrar etti.");
                duplicate[startIndex++] = star[i];
            }
        }



    }
}