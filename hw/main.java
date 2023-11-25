import controller.TeacherController;
 class main {
    static TeacherController teacherController = new TeacherController();

    public static void main(String[] args) {
        teacherController.create("Иван", "Иванович", "Иванов");
        teacherController.create("Пётр", "Петрович", "Петров");
        teacherController.create("Сидор", "Сидорович", "Сидоров");
        teacherController.create("Иван", "Петрович", "Иванов");
        teacherController.create("Пётр", "Иванович", "Иванов");
        teacherController.create("Иван", "Иванович", "Сидоров");
        teacherController.create("Иван", "Петрович", "Сидоров");
        teacherController.create("Сидор", "Иванович", "Сидоров");
        teacherController.create("Иван", "Сидорович", "Иванов");
        teacherController.create("Иван", "Сидорович", "Петров");
        teacherController.create("Сидор", "Петрович", "Иванов");
        teacherController.create("Пётр", "Сидорович", "Сидоров");

        teacherController.printAllTeacher();
    }
    
}
