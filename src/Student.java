public class Student extends User{
    String subject;
    String phone;

    public Student( String subject, String phone) {
        super();
        this.subject = subject;
        this.phone = phone;
    }
//    public String toString() {
//        return "Student{" +
//                "subject='" + subject + '\'' +
//                ", password='" + passwrod + '\'' +
//                ", phone='" + phone + '\'' +
//                '}';
//    }
}
