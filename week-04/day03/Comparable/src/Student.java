public class Student implements Cloneable {
    public String name;
    public int age;
    public String gender;
    public String previousOrganization;
    public int skippedDays;

    public Student(String name, int age, String gender, String previousOrganization) {
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    public void introduce(){
        System.out.println("Hi, I'm "+ this.name +", a "+this.age+" year old "+this.gender+" from "+ this.previousOrganization+
                " who skipped "+this.skippedDays+" days from the course already.");
    }

    @Override
    public Student clone() {
        Student cloneStudent = new Student(this.name, this.age, this.gender, this.previousOrganization);
        return cloneStudent;
    }
}


