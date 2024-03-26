public abstract class Hgwarts{
    protected String name;
    protected String surname;
    protected int thePowerOfMagic;
    protected int transgression;



    public Hgwarts(String name, String surname, int thePowerOfMagic, int transgression) {
        this.name = name;
        this.surname = surname;
        this.thePowerOfMagic = thePowerOfMagic;
        this.transgression = transgression;


    }
    //public abstract void equalsStudent(Hgwarts hgwarts, Hgwarts hgwarts1);
    public static void equalsAllStudent(Hgwarts frist, Hgwarts second){
        int fristTotal = frist.getThePowerOfMagic() + frist.getTransgression();
        int secondTotal = frist.getThePowerOfMagic() + frist.getTransgression();
        if(fristTotal > secondTotal){
            System.out.println("Студент: " + frist.getName() + " " + frist.getSurname() + " лучший в Хогвартсе чем " + second.getName() + " " + second.getSurname());
        }else if (fristTotal == secondTotal) {
            System.out.println("Студенты: " + frist.getName() + " " + frist.getSurname() + " и " + second.getName() + " " + second.getSurname() + "одинаково хороши" +
                    " в Хогвартсе");

        }else {
            System.out.println("Студент: " + second.getName() + " " + second.getSurname() + " лучший в Хогвартсе чем" + frist.getName() + " " + frist.getSurname());
        }



    }


    public String getName() {
        return name;
    }


    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getThePowerOfMagic() {
        return thePowerOfMagic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setThePowerOfMagic(int thePowerOfMagic) {
        this.thePowerOfMagic = thePowerOfMagic;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }
}
