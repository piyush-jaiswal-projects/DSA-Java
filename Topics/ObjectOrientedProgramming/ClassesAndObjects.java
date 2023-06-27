
class Human{
// Classes consists of data and members.

// Below we are defining data.
    String Name;
    String Color;
    String Country;
    String Religion;

// Non-parameterized Constructor
Human(){

}
// Parameterized Constructor
Human(String Name, String Color, String Country, String Religion){
    this.Name = Name;
    this.Color = Color;
    this.Country = Country;
    this.Religion = Religion;
}

// Members(function/methods) are defined below.
void printInfo(){
    System.out.println(this.Name + " lives in " + this.Country);
}

}

public class ClassesAndObjects{

    public static void main(String[] args) {
        // Creating an object
        Human piyush = new Human(); 
        piyush.Name="Piyush Jaiswal";
        piyush.Color="Wheatish";
        piyush.Country="India";
        piyush.Religion="Hindu";
        piyush.printInfo();
        Human human2 = new Human("Shalabh","Fair","India","Hindu");
        human2.printInfo();
    }


}