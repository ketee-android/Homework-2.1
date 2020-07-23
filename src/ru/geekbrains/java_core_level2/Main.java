//  Домашнее задание:
//
//  1. Создайте три класса Человек, Кот, Робот. Эти классы должны уметь бегать и прыгать
//     (методы просто выводят информацию о действии в консоль). Подумайте, что вам сможет помочь не дублировать код и
//     унифицировать эти классы для дальнейшей работы с ими?
//  2. Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны выполнять
//     соответствующие действия (бежать или прыгать), результат выполнения печатаем в консоль
//     (успешно пробежал, не смог пробежать и т.д.).
//  3. Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
//  4. У препятствий есть длина (для дорожки) или высота (для стены), а у участников ограничения на бег и прыжки.
//     Если участник не смог пройти одно из препятствий, то дальше по списку препятствий он не идет.

package ru.geekbrains.java_core_level2;

public class Main {

    public static void main(String[] args) {
        Actions[] competitors = {new Human("Василий"), new Cat("Барсик"), new Robot("Бамблби")};

        Obstacle[] obstacles = {new RunningTrack(300), new Wall(5)};

        Team team = new Team(competitors);

        System.out.println("В команды входят:");
        team.showResults();
        System.out.println(" ");

        Course course = new Course(obstacles);

        System.out.println("Прохождение:");
        course.go(team);
        System.out.println(" ");

        System.out.println("Результаты прохождения:");
        team.showResults();
        System.out.println(" ");

        System.out.println("Прошли все препятствия:");
        team.showMembersFinishedCourse();
        System.out.println(" ");
        
    }
}
