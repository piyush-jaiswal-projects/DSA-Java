class Hosteler{
    String Name;
    int RoomNo;
    int IdNo;
    String Department;

    void getInfo(String Name, String Department){
        System.out.println(Name + this.RoomNo);
    }

    void getInfo(String Name, int IdNo){
        System.out.println(Name + IdNo);
    }

    Hosteler(String Name, int RoomNo, int IdNo, String Department){
        this.Name=Name;
        this.RoomNo=RoomNo;
        this.IdNo=IdNo;
        this.Department=Department;
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Hosteler person1 = new Hosteler("Piyush", 422, 26, "UIET");
        person1.getInfo("Piyush", "UIET");
    }
}
