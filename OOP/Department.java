public class Department {
    private String id;
    private String name;
    private String deptChairId;

    public Department(String id, String name, String deptChairId) {
        this.id = id;
        this.name = name;
        this.deptChairId = deptChairId;
    }

    public String getName() { return name; }
    public String getDeptChairId() { return deptChairId; }
}
