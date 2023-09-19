

public class employee {
    String name;
    int number;
    double salary;

    // constructor
    public employee( String na, int num, double salary){
    name = na;
    number = num;
    this.salary = salary;
    }

    void display(){
        System.out.println(name +" "+ number +" "+ salary);
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        employee kakku = new employee("Abul Hasan", 12345, 50000.50);
        kakku.display();
    }
}
