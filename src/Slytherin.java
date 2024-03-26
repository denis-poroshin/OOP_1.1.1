public class Slytherin extends Hgwarts{
    private int cunning; // хитрость
    private int determination; // решительность
    private int ambition; // амбициозность
    private int resourcefulness; // находчивость
    private int lustForPower; // жажда власти

    public Slytherin(String name, String surname,int thePowerOfMagic, int transgression, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, surname, thePowerOfMagic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }
    public void studentDescription(Slytherin slytherin){
        System.out.println("Качества которые присущи всем студентам Грифиндора: благородство, честь, храбрость.");
        System.out.println("Качества которые присущи всем студентам Пуффендуй: трудолюбие, верность, честность.");
        System.out.println("Качества которые присущи всем студентам Когтевран: ум, мудрость, остроумие, творчество.");
        System.out.println("Качества которые присущи всем студентам Слизерин: хитрость, решительность, амбициозность, находчивость, жажда власти.");
        System.out.println(slytherin.toString());


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
        return "Слизерин\n" + getName() + " " + getSurname() + "\n" +
                "Хитрость: " + cunning + "\n" +
                "Решительность: " + determination + "\n" +
                "Амбициозность: " + ambition + "\n" +
                "Находчивость: " + resourcefulness + "\n" +
                "Жажда власти: " + lustForPower + "\n";
    }

    public static void equalsStudent(Slytherin frist, Slytherin second) {
        int fristTotal = frist.getCunning() + frist.getDetermination() + frist.getAmbition() + frist.getResourcefulness() + frist.getLustForPower();
        int secondTotal = second.getCunning() + second.getDetermination() + second.getAmbition() + second.getResourcefulness() + second.getLustForPower();
        if(fristTotal > secondTotal){
            System.out.println("Студент: " + frist.getName() + " " + frist.getSurname() + " лучший в Слизерине чем " + second.getName() + " " + second.getSurname());
        }else if (fristTotal == secondTotal) {
            System.out.println("Студенты: " + frist.getName() + " " + frist.getSurname() + " и " + second.getName() + " " + second.getSurname() + "одинаково хороши" +
                    " на совем факулитете");

        }else {
            System.out.println("Студент: " + second.getName() + " " + second.getSurname() + " лучший в Слизерине чем" + frist.getName() + " " + frist.getSurname());
        }


    }
}