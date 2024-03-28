public class SlytherinStudent extends HgwartsStudent{
    private int cunning; // хитрость
    private int determination; // решительность
    private int ambition; // амбициозность
    private int resourcefulness; // находчивость
    private int lustForPower; // жажда власти

    public SlytherinStudent(String name, String surname,int thePowerOfMagic, int transgression, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, surname, thePowerOfMagic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }


    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }


    @Override
    public String toString() {
        return "Качества которые присущи всем студентам Грифиндора: благородство, честь, храбрость." + "\n" +
                "Качества которые присущи всем студентам Пуффендуй: трудолюбие, верность, честность." + "\n" +
                "Качества которые присущи всем студентам Когтевран: ум, мудрость, остроумие, творчество." + "\n" +
                "Качества которые присущи всем студентам Слизерин: хитрость, решительность, амбициозность, находчивость, жажда власти." + "\n" +
                "Слизерин\n" + getName() + " " + getSurname() + "\n" +
                "Хитрость: " + cunning + "\n" +
                "Решительность: " + determination + "\n" +
                "Амбициозность: " + ambition + "\n" +
                "Находчивость: " + resourcefulness + "\n" +
                "Жажда власти: " + lustForPower + "\n";
    }

    public void equalsStudent(SlytherinStudent frist) {
        int fristTotal = frist.getCunning() + frist.getDetermination() + frist.getAmbition() + frist.getResourcefulness() + frist.getLustForPower();
        int thisTotal =  this.cunning + this.determination + this.ambition + this.resourcefulness + this.lustForPower;
        if(fristTotal > thisTotal){
            System.out.println("Студент: " + frist.getName() + " " + frist.getSurname() + " лучший в Слизерине чем " + this.name + " " + this.surname);

        }else if (fristTotal == thisTotal) {
            System.out.println("Студенты: " + frist.getName() + " " + frist.getSurname() + " и " + this.name + " " + this.surname + "одинаково хороши" +
                    " на совем факулитете");
        }else {
            System.out.println("Студент: " + this.name + " " + this.surname + " лучший в Слизерине чем" + frist.getName() + " " + frist.getSurname());
        }


    }
}