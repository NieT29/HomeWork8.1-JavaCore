import java.time.LocalDate;

public class Member {
    private int id;
    private String name;
    private LocalDate dayOfBirth;
    private String job;

    public Member(int id, String name, LocalDate dayOfBirth, String job) {
        this.id = id;
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dayOfBirth=" + dayOfBirth +
                ", job='" + job + '\'' +
                '}';
    }
}

