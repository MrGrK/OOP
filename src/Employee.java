public class Employee {

    private String _name;

    private String _position;

    private String _mail;

    private String _phone;

    private int _salary;

    private int _age;

    public Employee(String pName, String pPosition, String pMail, String pPhone, int pSalary, int pAge)
    {
        _name = pName;
        _position = pPosition;
        _mail =pMail;
        _phone = pPhone;
        _salary = pSalary;
        _age = pAge;
    }

    public void printEmpData() {
        System.out.println("ФИО: " + this._name + "; Должность: " + this._position + "; Почта: " + this._mail + "; Телефон: " +
                this._phone + "; Зарплата: " + this._salary + "; Возраст: " + this._age);
    }
}
