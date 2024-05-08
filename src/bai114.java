public class bai114 {
    public static void main(String[] args) {
        int []number = {1,2,3,4,5};
//        System.out.println(number[1]);
//        System.out.println(number[4]);



//        for (int i =0;  i<number.length;i++){
//            System.out.print(number[i]+ " ");
//        }



//int sum =0;
//for (int i =0;i < number.length;i++){
//sum += number[i];
//}
//        System.out.println(sum);



        int max =  number[0];
        for (int i =0 ; i < number.length;i++){
            if(number[i] > max){
                max = number[i];
            }

        }
        System.out.println(max);



    }
}
