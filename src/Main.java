public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var massBoxerFirst = 78.2;
        var massBoxerSecond = 82.7;
        var massBoxerSumma = massBoxerFirst + massBoxerSecond;
        System.out.println(massBoxerSumma);
        var massBoxerSubtraction =  massBoxerSecond - massBoxerFirst;
        System.out.println(massBoxerSubtraction);
        var massBoxerReminder = massBoxerSecond % massBoxerFirst;
        System.out.println(massBoxerReminder);
        var fullTimeLimit = 640;
        var timePerson = 8;
        var personInCompany = fullTimeLimit / timePerson;
        System.out.println("Всего работников в компании - " + personInCompany + " человек");
        personInCompany = personInCompany + 94;
        var timePersonNew = fullTimeLimit / personInCompany;
        System.out.println("Если в компании работает " + personInCompany + " человек, то всего " + timePersonNew +
                " часа работы может быть поделено между сотрудниками");
    }
}