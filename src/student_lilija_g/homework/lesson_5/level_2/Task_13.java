package student_lilija_g.homework.lesson_5.level_2;

class Task_13 {

    public static void main(String[] args) {

        int[] myNumbers = new int[3];
        int myResult = 0;
        for ( int i = 0; i < myNumbers.length; i++) {
            myNumbers[i] = (int)(Math.random()*100);
            myResult = myResult +  myNumbers[i];
        }

        System.out.println("Sum of array integers with dimension 3 {" +
                myNumbers[0] + ", " +
                myNumbers[1] + ", " +
                myNumbers[2] + "} is " + myResult);

    }
}
