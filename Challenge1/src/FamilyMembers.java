public class FamilyMembers {
    int     age;
    String  name;
    String  relation;

    public FamilyMembers(int iage, String iname, String irelation)
    {
        this.age = iage;
        this.name = iname;
        this.relation = irelation;
    }

    void printPerson()
    {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Relation: " + this.relation);
        System.out.println();
    }
}
