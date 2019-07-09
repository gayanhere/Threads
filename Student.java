import java.util.ArrayList;
import java.util.List;

public class Student {

    public String name;
    public int marks;

  Student(String name,int marks){
      this.name = name;
      this.marks = marks;
  }

//Student s = new Student();
public String getName()
{
    return name;

}

public void setName()
{

    this.name = name;
}

public int getMarks()
{

    return  marks;
}
public void setMarks()
{
    this.marks = marks;
}

public static List<Student> getAllStudents()
{

    List<Student> std = new ArrayList<>();
    std.add(new Student("Saman",86));
    std.add(new Student("Kaurie",45));
    std.add(new Student("Nimal",34));
    std.add(new Student("Nihal",66));
    std.add(new Student("Kamal",84));
    std.add(new Student("Sugath",65));
    std.add(new Student("Gayan",87));
    std.add(new Student("Charith",43));
    std.add(new Student("Anuradha",98));
    std.add(new Student("John",66));
    std.forEach(Student ->{
        System.out.println("Name :" + Student.getName() + ",Marks :" +Student.getMarks());

    });
return std;

}
}
