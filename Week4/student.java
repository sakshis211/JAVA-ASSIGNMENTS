public class Student {
    private String name;
    private String studentId;
    private int marks;

    public Student(String name,String studentId,int marks){
        this.name = name;
        this.studentId = studentId;
        this.marks = marks;
    }

    public String getname(){
        return name;
    }
    public String getstudentId(){
        return studentId;

    }
    public int getmarks(){
        return marks;
    }
    public boolean setmarks(int marks){
        if(marks<0 || marks>100){
            return false;
        }
        this.marks = marks; 
        return true;
    }
    public boolean hasPasses(){
        return marks>=40;
    }
    public String getclassification(){
        if(marks>=70){
            return "first class";
        }
        else if(marks>=60){
            return "upper second class";
        }
        else if (marks>=50){
            return "third class";
        }
        else if (marks>=40){
            return "lower class";
        }
        else{
            return "fail";
        }
    }
}
