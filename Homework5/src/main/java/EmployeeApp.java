public class EmployeeApp {
    public static void main(String[] args) {
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("������ ���� ����������", "Java-�����������",
                "petr@new.nl", "+39226895562", "100000", Integer.parseInt("27"));
        empArray[1] = new Employee("��������� ���������� ��������", "������",
                "tnt@new.nl", "+79024586366", "68000", Integer.parseInt("34"));
        empArray[2] = new Employee("������ ���� ������", "���������",
                "ivanovii@new.nl", "899924938", "59000", Integer.parseInt("44"));
        empArray[3]= new Employee("�������� ������� ����������", "Devops engineer",
                "arsen@new.nl", "123456789", "1005000", Integer.parseInt("40"));
        empArray[4]= new Employee("�������� ������� �������������", "��������",
                "vedro@new.nl", "8556995558", "50000", Integer.parseInt("60"));
        for (int i=0; i<5; i++) {
            if (empArray[i].age > 40) {
                empArray[i].info();}
        }

    }
}
