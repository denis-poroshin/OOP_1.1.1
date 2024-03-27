public class Hufflepuff extends Hgwarts{
    private int hardWork; // трудолюбие
    private int loyalty; // верность
    private int honesty; // честность

    public Hufflepuff(String name, String surname,int thePowerOfMagic, int transgression, int hardWork, int loyalty, int honesty) {
        super(name, surname, thePowerOfMagic, transgression);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }


    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
    public static void studentDescription(Hgwarts student){
        Hufflepuff newStudent = (Hufflepuff) student;
        System.out.println("Качества которые присущи всем студентам Грифиндора: благородство, честь, храбрость.");
        System.out.println("Качества которые присущи всем студентам Пуффендуй: трудолюбие, верность, честность.");
        System.out.println("Качества которые присущи всем студентам Когтевран: ум, мудрость, остроумие, творчество.");
        System.out.println("Качества которые присущи всем студентам Слизерин: хитрость, решительность, амбициозность, находчивость, жажда власти.");
        System.out.println(newStudent.toString());


    }


    @Override
    public String toString() {
        return "Пуффендуй\n" + getName() + " " + getSurname() + "\n" +
                "Трудолюбие: " + hardWork + "\n" +
                "Верность: " + loyalty + "\n" +
                "Честность: " + honesty + "\n";
    }

    public void equalsStudent(Hgwarts frist) {
        Hufflepuff that = (Hufflepuff) frist;
        int fristTotal = that.getHardWork() + that.getLoyalty() + that.getHonesty();
        int thisTotal =  this.hardWork + this.loyalty + this.honesty;
        if(fristTotal > thisTotal){
            System.out.println("Студент: " + frist.getName() + " " + frist.getSurname() + " лучший в Пуффендуе чем " + this.name + " " + this.surname);

        }else if (fristTotal == thisTotal) {
            System.out.println("Студенты: " + frist.getName() + " " + frist.getSurname() + " и " + this.name + " " + this.surname + "одинаково хороши" +
                    " на совем факулитете");
        }else {
            System.out.println("Студент: " + this.name + " " + this.surname + " лучший в Пуффендуе чем " + frist.getName() + " " + frist.getSurname());
        }


    }
}