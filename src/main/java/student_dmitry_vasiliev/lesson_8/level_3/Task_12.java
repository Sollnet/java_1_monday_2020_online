package student_dmitry_vasiliev.lesson_8.level_3;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Task_12 {

/*    Исправьте код программы так, что бы он компилировался.
    Реализовывать метод canReceiveLoan() нельзя.*/


    abstract class LoanSystem {

        abstract boolean canReceiveLoan(Human human);

    }
}
