public class Student {
    private String Name;
    private String Password;
    static int Count=0;
    private int number;
    public Student(String Name,String Password){
        this.Name=Name;
        this.Password=Password;
        Count++;
        this.number=Count;
    }
    public boolean logIn(int enteredNo,String enteredStr){
        if(enteredNo==number && enteredStr.equals(Password)){
            return true;
        }
        else return false;
    }
    @Override
    public String toString() {
        return "Student [Name=" + Name + ", Password=" + Password + ", number=" + number + "]";
    }
    
}

