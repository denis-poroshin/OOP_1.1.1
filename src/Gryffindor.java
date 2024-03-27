import java.util.Objects;

public class Gryffindor extends Hgwarts{
    private int nobility; // благородство
    private int honor; // честь
    private int bravery; // храбрость

    public Gryffindor(String name, String surname,int thePowerOfMagic, int transgression, int nobility, int honor, int bravery) {
        super(name, surname, thePowerOfMagic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }


    public int getNobility() {
        return nobility;
    }


    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }


    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }


    @Override
    public String toString() {
        return "Грифиндор:\n" + getName() + " " + getSurname() + "\n" +
                "Благородство: " + nobility + "\n" +
                "Честь: " + honor + "\n" +
                "Храбрость: " + bravery + "\n";

    }
    public static void studentDescription(Hgwarts student){
        Gryffindor newStudent = (Gryffindor) student;
        System.out.println("Качества которые присущи всем студентам Грифиндора: благородство, честь, храбрость.");
        System.out.println("Качества которые присущи всем студентам Пуффендуй: трудолюбие, верность, честность.");
        System.out.println("Качества которые присущи всем студентам Когтевран: ум, мудрость, остроумие, творчество.");
        System.out.println("Качества которые присущи всем студентам Слизерин: хитрость, решительность, амбициозность, находчивость, жажда власти.");
        System.out.println(newStudent.toString());


    }

    public void equalsStudent(Hgwarts frist) {
        Gryffindor that = (Gryffindor) frist;
        int fristTotal = that.getBravery() + that.getNobility() + that.getHonor();
        int thisTotal =  this.bravery + this.nobility + this.honor;
        if(fristTotal > thisTotal){
            System.out.println("Студент: " + frist.getName() + " " + frist.getSurname() + " лучший в Гриффиндоре чем " + this.name + " " + this.surname);


        }else if (fristTotal == thisTotal) {
            System.out.println("Студенты: " + frist.getName() + " " + frist.getSurname() + " и " + this.name + " " + this.surname + "одинаково хороши" +
                    " на совем факулитете");
        }else {
            System.out.println("Студент: " + this.name + " " + this.surname + " лучший в Гриффиндоре чем " + frist.getName() + " " + frist.getSurname());
        }


    }

}
