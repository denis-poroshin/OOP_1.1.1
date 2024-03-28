public class Main {
    public static void main(String[] args) {

        HgwartsStudent garri = new GryffindorStudent("Гарри", "Поттер", 100, 95, 100, 95, 85);
        HgwartsStudent germiona = new GryffindorStudent("Гермиона", "Грейнджер", 95, 30, 95, 80, 80);
        HgwartsStudent ron = new GryffindorStudent("Рон", "Уизли", 80, 50, 80, 90, 50);
        HgwartsStudent zechariah = new HufflepuffStudent("Захария", "Смит", 70, 80, 50, 10, 100);
        HgwartsStudent sedric = new HufflepuffStudent("Седрик", "Диггори", 100, 85, 100, 90, 80);
        HgwartsStudent finch = new HufflepuffStudent("Финч", "- Флетчли", 70, 60, 100, 90, 80);
        HgwartsStudent zhou = new RavenclawStudent("Чжоу", "Чанг", 95, 75, 100, 50, 90, 30);
        HgwartsStudent padma = new RavenclawStudent("Падма", "Патил", 60, 70, 95, 80, 85, 35);
        HgwartsStudent marcus = new RavenclawStudent("Маркус", "Белби", 50, 30, 90, 95, 70, 60);
        HgwartsStudent drako = new SlytherinStudent("Драко", "Малфой", 58, 89, 100, 70, 30, 25, 50);
        HgwartsStudent graham = new SlytherinStudent("Грэхэм", "Монтегю", 70, 60, 35, 100, 80, 60, 70);
        HgwartsStudent gregorio = new SlytherinStudent("Грегори", "Гойл", 75, 60, 95, 30, 85, 100, 100);


        System.out.println(garri);

        ((GryffindorStudent) garri).equalsStudent((GryffindorStudent) germiona);
        ((HufflepuffStudent) zechariah).equalsStudent((HufflepuffStudent)sedric);
        ((RavenclawStudent) zhou).equalsStudent((RavenclawStudent) padma);
        ((SlytherinStudent) drako).equalsStudent((SlytherinStudent) graham);
        System.out.println();

        garri.equalsAllStudent(gregorio);



        //hgwarts[0].equalsStudent(hgwarts[1]);
        //Gryffindor equalsStudent(Gryffindor hgwarts,Gryffindor hgwarts1);

/*
        Hgwarts[] hufflepuff = {
                new Hufflepuff("Захария", "Смит", 50, 10, 100),
                new Hufflepuff("Седрик", "Диггори", 100, 90, 80),
                new Hufflepuff("Финч", "- Флетчли", 100, 90, 80)
        };
        /*
        for (int i = 0; i < hufflepuff.length; i++) {
            System.out.println(hufflepuff[i]);
        }
        Hgwarts[] ravenclaw = {
                new Ravenclaw("Чжоу", "Чанг", 100, 50, 90, 30),
                new Ravenclaw("Падма", "Патил", 95, 80, 85, 35),
                new Ravenclaw("Маркус", "Белби", 90, 95, 70, 60)
        };
        for (int i = 0; i < ravenclaw.length; i++) {
            System.out.println(ravenclaw[i]);
        }
        Hgwarts[] slytherin = {
                new Slytherin("Драко", "Малфой,", 100, 70, 30, 25, 50),
                new Slytherin("Грэхэм", "Монтегю", 35, 100, 80, 60, 70),
                new Slytherin("Грегори", "Гойл", 95, 30, 85, 100, 100)
        };
        for (int i = 0; i < slytherin.length; i++) {
            System.out.println(slytherin[i]);
        }
        studentDescription();

        Hufflepuff sedric = new Hufflepuff("Седрик", "Диггори",100, 85, 100, 90, 80);
        Hufflepuff.studentDescription(sedric);
        //studentDescription(hgwarts, 4);

        Gryffindor garri = new Gryffindor("Гарри", "Поттер",100, 95 ,100, 95, 85);
        Gryffindor germiona = new Gryffindor("Гермиона", "Грейнджер", 95, 30, 95, 80, 80);

        Gryffindor.equalsStudent(garri, germiona);
        Slytherin drako = new Slytherin("Драко", "Малфой,", 58, 89, 100, 70, 30, 25, 50);
        Hufflepuff finch = new Hufflepuff("Финч", "- Флетчли",70, 60, 100, 90, 80);
        Hgwarts.equalsAllStudent(drako, finch);
         */


    }
}






/*
    public static void studentDescription(Hgwarts[] hufflepuff, int num){
        for (int i = 0; i < hufflepuff.length; i++) {
            if(num < 0){
                break;
            }
            if(i == num && i <= 2){
                System.out.println("Качества которые присущи всем студентам Грифиндора: благородство, честь, храбрость.");
                System.out.println(hufflepuff[i]);
                break;
            }
            if (i == num && i > 2 && i <= 5){
                System.out.println("Качества которые присущи всем студентам Пуффендуй: трудолюбие, верность, честность.");
                System.out.println(hufflepuff[i]);
                break;
            }
            if(i == num && i > 5 && i <= 8){
                System.out.println("Качества которые присущи всем студентам Когтевран: ум, мудрость, остроумие, творчество.");
                System.out.println(hufflepuff[i]);
                break;
            }else{
                System.out.println("Качества которые присущи всем студентам Слизерин: хитрость, решительность, амбициозность, находчивость, жажда власти.");
                System.out.println(hufflepuff[i]);
                break;
            }
        }

 */
