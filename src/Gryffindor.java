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
    public void studentDescription(Gryffindor gryffindor){
        System.out.println("Качества которые присущи всем студентам Грифиндора: благородство, честь, храбрость.");
        System.out.println("Качества которые присущи всем студентам Пуффендуй: трудолюбие, верность, честность.");
        System.out.println("Качества которые присущи всем студентам Когтевран: ум, мудрость, остроумие, творчество.");
        System.out.println("Качества которые присущи всем студентам Слизерин: хитрость, решительность, амбициозность, находчивость, жажда власти.");
        System.out.println(gryffindor.toString());


    }



    public static void equalsStudent(Gryffindor frist, Gryffindor second) {
        int fristTotal = frist.getBravery() + frist.getNobility() + frist.getNobility();
        int secondTotal = second.getBravery() + second.getNobility() + second.getNobility();
        if(fristTotal > secondTotal){
            System.out.println("Студент: " + frist.getName() + " " + frist.getSurname() + " лучший в Гриффиндоре чем " + second.getName() + " " + second.getSurname());
        }else if (fristTotal == secondTotal) {
            System.out.println("Студенты: " + frist.getName() + " " + frist.getSurname() + " и " + second.getName() + " " + second.getSurname() + "одинаково хороши" +
                    " на совем факулитете");

        }else {
            System.out.println("Студент: " + second.getName() + " " + second.getSurname() + " лучший в Гриффиндоре чем" + frist.getName() + " " + frist.getSurname());
        }


    }



}
