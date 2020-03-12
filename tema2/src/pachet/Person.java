package pachet;
public class Person{

    private String Name;
    private String Surname;
    private String age;
    private Long idNo;
    private String type;

    public Person( String name, String surname, String age, Long idNo, String type){
        this.Name = name;
        this.Surname = surname;
        this.age = age;
        this.idNo = idNo;
        this.type = type;
    }

    public Long getIdNo() {
        return idNo;
    }

    public String getAge() {
        return age;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public String getType() {
        return type;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setIdNo(Long idNo) {
        this.idNo = idNo;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void print( ){
        System.out.println("Name: " + this.Name);
        System.out.println("Surname: " + this.Surname);
        System.out.println("Age: " + this.age);
        System.out.println("idNo: " + this.idNo);
        System.out.println("Type: " + this.type);
        System.out.println(' ');
    }

}

