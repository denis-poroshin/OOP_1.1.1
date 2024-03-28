public abstract class HgwartsStudent{
    protected String name;
    protected String surname;
    protected int thePowerOfMagic;
    protected int transgression;



    public HgwartsStudent(String name, String surname, int thePowerOfMagic, int transgression) {
        this.name = name;
        this.surname = surname;
        this.thePowerOfMagic = thePowerOfMagic;
        this.transgression = transgression;


    }

    public void equalsAllStudent(HgwartsStudent frist){
        int fristTotal = frist.getThePowerOfMagic() + frist.getTransgression();
        int thisTotal = this.getThePowerOfMagic() + this.getTransgression();
        if(fristTotal > thisTotal){
            System.out.println("Студент: " + frist.getName() + " " + frist.getSurname() + " лучший в Хогвартсе чем " + this.getName() + " " + this.getSurname());

        }else if (fristTotal == thisTotal) {
            System.out.println("Студенты: " + frist.getName() + " " + frist.getSurname() + " и " + this.getName() + " " + this.getSurname() + "одинаково хороши" +
                    " в Хогвартсе");

        }else {
            System.out.println("Студент: " + this.getName() + " " + this.getSurname() + " лучший в Хогвартсе чем " + frist.getName() + " " + frist.getSurname());
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

    @Override
    public String toString() {
        return this.name + this.surname;
    }
}
