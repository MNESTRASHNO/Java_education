package src.myLittleUbojestvo.OOP;

public class Worker {
    String name;

    String jobTitle;

    int salary;


    Worker(){
        name = "Ilya";

        jobTitle = "Malware Reverser engineer";

        salary = 0;
    }
    Worker(String name, String jobTitle, int salary){
        this.salary = salary;
        this.name = name;
        this.jobTitle = jobTitle;
    }

    void setParams(String name, String jobTitle, int salary){
        this.salary = salary;
        this.name = name;
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}
