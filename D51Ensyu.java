public class D51Ensyu {
    public static void main(String[] args) {
        String id = args[0];
        String name = args[1];

        D51Ensyu student = new D51Ensyu(id, name);
        System.out.println(student);


    }




    private String id;
    private String name;

    public D51Ensyu(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("学籍番号: %s\n氏名: %s", id, name);
    }
}
