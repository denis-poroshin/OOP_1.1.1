public class Ravenclaw extends Hgwarts{
    private int mind; // ум
    private int wisdom; // мудрость
    private int wit; // остроумие
    private int creation; // творчество

    public Ravenclaw(String name, String surname,int thePowerOfMagic, int transgression, int mind, int wisdom, int wit, int creation) {
        super(name, surname, thePowerOfMagic, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }


    public void setWit(int wit) {
        this.wit = wit;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }
    public void studentDescription(Ravenclaw ravenclaw){
        System.out.println("Качества которые присущи всем студентам Грифиндора: благородство, честь, храбрость.");
        System.out.println("Качества которые присущи всем студентам Пуффендуй: трудолюбие, верность, честность.");
        System.out.println("Качества которые присущи всем студентам Когтевран: ум, мудрость, остроумие, творчество.");
        System.out.println("Качества которые присущи всем студентам Слизерин: хитрость, решительность, амбициозность, находчивость, жажда власти.");
        System.out.println(ravenclaw.toString());


    }


    @Override
    public String toString() {
        return "Когтевран\n" + getName() + " " +  getSurname() + "\n" +
                "Ум: " + mind + "\n" +
                "Мудрость: " + wisdom + "\n" +
                "Остроумие: " + wit + "\n" +
                "Творчество: " + creation + "\n";
    }

    public static void equalsStudent(Ravenclaw frist, Ravenclaw second) {
        int fristTotal = frist.getMind() + frist.getWisdom() + frist.getWit() + frist.getCreation();
        int secondTotal = second.getMind() + second.getWisdom() + second.getWit() + second.getCreation();
        if(fristTotal > secondTotal){
            System.out.println("Студент: " + frist.getName() + " " + frist.getSurname() + " лучший в Когтевране чем " + second.getName() + " " + second.getSurname());
        }else if (fristTotal == secondTotal) {
            System.out.println("Студенты: " + frist.getName() + " " + frist.getSurname() + " и " + second.getName() + " " + second.getSurname() + "одинаково хороши" +
                    " на совем факулитете");

        }else {
            System.out.println("Студент: " + second.getName() + " " + second.getSurname() + " лучший в Когтевране чем" + frist.getName() + " " + frist.getSurname());
        }


    }
}
