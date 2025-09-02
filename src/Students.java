import javax.naming.Name;

public class Students {

    private int Id;
    private String Name;
    private int age;

    public Students(int Id,String Name,int age){
        this.Id = Id;
        this.Name = Name;
        this.age =age;
    }
    public void show(){
        System.out.println(Id);
        System.out.println(Name);
        System.out.println(age);
    }

    }

//    public int getId() {
//        return Id;
//    }

//    public void setId(int id) {
//        if (id <= 0){
//            System.out.println("Invalid ID");
//        }
//        Id = id;
//    }

//    public String getName() {
//        return Name;
//    }
//
//    public void setName(String name) {
//        if (name == null){
//            System.out.println("Invalid Name");
//        }
//        Name = name;
//    }

//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        if (age <= 0){
//            System.out.println("Invalid Age");
//        }
//        this.age = age;
//    }
//


