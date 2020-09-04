public class Main {

    public static Employee[] fEmpArr;

    public static void main(String[] args) {

        initEmpArr();

        printEmpByAge(40);
    }

    private static void printEmpByAge(int pAge) {
        for (int i=0;i<fEmpArr.length;i++)
        {
            if (fEmpArr[i].get_age()>pAge) {
                fEmpArr[i].printEmpData();
            }
        }
    }

    private static void initEmpArr() {
        fEmpArr = new Employee[5];
        fEmpArr[0] = new Employee("Игорь Игоревич Игорев", "Старший специалист", "asd@mail.ru", "123331", 2000, 25);
        fEmpArr[1] = new Employee("Eгор Егорович Егоров", "Младший специалист", "zxc@mail.ru", "1768996", 2030, 41);
        fEmpArr[2] = new Employee("Виктор Сергеевич Крунов", "Егерь", "qwe@mail.ru", "11223", 22440, 40);
        fEmpArr[3] = new Employee("Степан Игнатьевич Бегорев", "Разработчик FORTRAN", "arty@mail.ru", "123434", 22200, 98);
        fEmpArr[4] = new Employee("Радион Константинович Райков", "Стажёр", "rtyuf@mail.ru", "121", 908000, 15);
    }
}



