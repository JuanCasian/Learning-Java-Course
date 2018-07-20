public class Main {
    public static void main(String args[])
    {
        FamilyMembers jorge = new FamilyMembers(16, "Jorge", "Brother");
        FamilyMembers ivette = new FamilyMembers(51, "Ivette", "Mother");
        FamilyMembers juan = new FamilyMembers(50, "Juan Pedro", "Father");

        jorge.printPerson();
        ivette.printPerson();
        juan.printPerson();
    }
}
