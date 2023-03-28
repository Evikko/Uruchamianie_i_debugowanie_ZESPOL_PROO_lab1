class Team {
    private String name;    //nazwa zespołu
    public final String[] members;  //członkowie
    public Team() { //konstruktor bezparametrowy
        name = "Zwierzeta";
        members = new String[] {"Kot", "Pies", "Owca"};
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
class Main {
    public static void main(String[] args) {
        Team zespol = new Team();       // tworzymy obiekt

        String tablica[] = zespol.members;
//        zespol.members[0] = "Żaba";

        System.out.println(zespol.getName());
        zespol.setName("Ssaki");
        System.out.println(zespol.getName());

        for(int i=0; i < 3; i++) {
            System.out.println(zespol.members[i]);
        }

    }
}