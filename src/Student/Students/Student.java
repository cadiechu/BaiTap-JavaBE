package Student.Students;
public class Student {
    private String studentId;
    private String studentName;
    private int age;
    private boolean sex;
    private float htmlScore;
    private float cssScore;
    private float javascriptScore;
    private float avgScore;

    // Constructor mặc định
    public Student() {
    }

    // Constructor khởi tạo tất cả thông tin sinh viên
    public Student(String studentId, String studentName, int age, boolean sex, float htmlScore, float cssScore, float javascriptScore) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
        this.htmlScore = htmlScore;
        this.cssScore = cssScore;
        this.javascriptScore = javascriptScore;
    }

    // Phương thức nhập thông tin sinh viên (trừ avgScore)
    public void inputData() {
        // Thêm mã code để nhập thông tin sinh viên từ bàn phím
    }

    // Phương thức hiển thị thông tin sinh viên
    public void displayData() {
        // Thêm mã code để hiển thị thông tin sinh viên ra màn hình console
    }

    // Phương thức tính điểm trung bình của sinh viên
    public void calAvgScore() {
        this.avgScore = (htmlScore + cssScore + javascriptScore) / 3.0f;
    }

    // Getter và Setter cho avgScore
    public float getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(float avgScore) {
        this.avgScore = avgScore;
    }

    // Getter cho studentName
    public String getStudentName() {
        return studentName;
    }
}
