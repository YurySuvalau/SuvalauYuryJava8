public class Main {
    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            int userChoose;
            Tasks task = new Tasks();
            userChoose = task.listOfTasks();
            if (userChoose == 1) {
                task.taskOne();
            } else if (userChoose == 2) {
                task.taskTwo();
            } else if (userChoose == 3) {
                task.taskThree();
            } else if (userChoose == 0) {
                exit = true;
            } else {
                System.out.println("Введите корректное значение!");
            }
        }
    }
}




