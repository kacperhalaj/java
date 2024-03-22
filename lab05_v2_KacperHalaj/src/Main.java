public class Main {

    public static void main(String[] args) {

        Budynek budynek1 = new Budynek("Dom jednorodzinny",2006,2);
        Budynek budynek2 = new Budynek("Dom bliźniak",1999,3);
        Budynek budynek3 = new Budynek("Blok mieszkalny",2013,12);
        Budynek budynek4 = new Budynek("Wiezowiec",2018,50);

        budynek1.view();
        budynek2.view();
        budynek3.view();
        budynek4.view();

    }
}