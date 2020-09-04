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


    public String get_name() {
        return _name;
    }

    public String get_position() {
        return _position;
    }

    public String get_mail() {
        return _mail;
    }

    public String get_phone() {
        return _phone;
    }

    public int get_salary() {
        return _salary;
    }

    public int get_age() {
        return _age;
    }

    public void printEmpData() {
        System.out.println("ФИО: " + this._name + "; Должность: " + this._position + "; Почта: " + this._mail + "; Телефон: " +
                this._phone + "; Зарплата: " + this._salary + "; Возраст: " + this._age);
    }
}
