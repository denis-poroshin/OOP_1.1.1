public class RavenclawStudent extends HgwartsStudent{
    private int mind; // ум
    private int wisdom; // мудрость
    private int wit; // остроумие
    private int creation; // творчество

    public RavenclawStudent(String name, String surname,int thePowerOfMagic, int transgression, int mind, int wisdom, int wit, int creation) {
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



    @Override
    public String toString() {
        return "Качества которые присущи всем студентам Грифиндора: благородство, честь, храбрость." + "\n" +
                "Качества которые присущи всем студентам Пуффендуй: трудолюбие, верность, честность." + "\n" +
                "Качества которые присущи всем студентам Когтевран: ум, мудрость, остроумие, творчество." + "\n" +
                "Качества которые присущи всем студентам Слизерин: хитрость, решительность, амбициозность, находчивость, жажда власти." + "\n" +
                "Когтевран\n" + getName() + " " +  getSurname() + "\n" +
                "Ум: " + mind + "\n" +
                "Мудрость: " + wisdom + "\n" +
                "Остроумие: " + wit + "\n" +
                "Творчество: " + creation + "\n";
    }

    public void equalsStudent(RavenclawStudent frist) {
        int fristTotal = frist.getMind() + frist.getWisdom() + frist.getWit() + frist.getCreation();
        int thisTotal =  this.mind + this.wisdom + this.wit + this.creation;
        if(fristTotal > thisTotal){
            System.out.println("Студент: " + frist.getName() + " " + frist.getSurname() + " лучший в Когтевране чем " + this.name + " " + this.surname);

        }else if (fristTotal == thisTotal) {
            System.out.println("Студенты: " + frist.getName() + " " + frist.getSurname() + " и " + this.name + " " + this.surname + "одинаково хороши" +
                    " на совем факулитете");
        }else {
            System.out.println("Студент: " + this.name + " " + this.surname + " лучший в Когтевране чем " + frist.getName() + " " + frist.getSurname());
        }


    }
}
