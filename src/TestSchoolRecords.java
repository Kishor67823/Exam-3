public class TestSchoolRecords {
    Person[] persons;

    public TestSchoolRecords(Person[] persons) {
        this.persons = new Person[6];
    }

    public <persons> void setPersons(Person[] persons) {
        this.persons = new Person[6];
    }

    public String getPersons() {
        String Person = null;
        return Person;
    }

    public static void main(String[] args) {
        Person[] persons = new Person[6];
        Student hay = new Student("Hay", "a ave", "345-453-1233", "a2342gmail.com", "junior");
        Student may = new Student("May", "b ave", "657-453-1233", "b2342gmail.com", "junior");
        Faculty jim = new Faculty("Jim", "c ave", "567-923-0663", "c2342gmail.com", "EVS", 10000, "nov 8 2020", "7:00 am to 10:00 am", "entry");
        Faculty tim = new Faculty("Tim", "d ave", "777-888-1111", "d2342gmail.com", "Nursing", 20000, "aug 9 2019", "10:00 am to 12:00 pm", "entry");
        Staff kim = new Staff("Kim", "e ave", "888-999-0000", "e2342gmail.com", "chairman", 40000, "dec 10 1990", "head of chairmen");
        Staff lim = new Staff("Lim", "f ave", "999-000-1111", "f2342gmail.com", "corporate", 20000, "dec 9 2015", "head of corporate");

        persons[0] = hay;
        persons[1] = may;
        persons[2] = jim;
        persons[3] = tim;
        persons[4] = kim;
        persons[5] = lim;

        for (Person person : persons) {
            System.out.println(person.toString());
        }


    }

    public static Person[] newList(Person[] persons) {
        int count = 0;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] instanceof Employee) {
                count++;
            }
        }
        Person[] storeEmployees = new Person[count];
        int secondCount = 0;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] instanceof Faculty || persons[i] instanceof Staff) {
                secondCount++;
                storeEmployees[secondCount] = persons[i];
            }
        }
        return storeEmployees;
    }

    @Override
    public String toString() {
        return "";
    }

}
