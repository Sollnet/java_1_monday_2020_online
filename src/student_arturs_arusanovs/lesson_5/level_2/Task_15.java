package student_arturs_arusanovs.lesson_5.level_2;

class Task_15 {

    public static void main(String[] args) {

        int[] numbers = {7, 8, 9};

        for (int i = 0; i < numbers.length; i++){
            System.out.println("[" + i + "] = " + numbers[i] );
        }

        for (int i = 0; i < numbers.length; i++) {
            int plus = numbers[i] + 2 ;
            System.out.println("[" + i + "] = " + plus);

        }
    }
}