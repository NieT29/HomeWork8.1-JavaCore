import java.util.ArrayList;

public class HouseHold {
    private int idHouseHold;
    private String address;
    private ArrayList<Member> members;

    public HouseHold(int idHouseHold, String address) {
        this.idHouseHold = idHouseHold;
        this.address = address;
    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<Member> members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "HouseHold{" +
                "idHouseHold=" + idHouseHold +
                ", address='" + address + '\'' +
                ", members=" + members +
                '}';
    }
}

