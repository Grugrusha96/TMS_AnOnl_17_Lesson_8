package Work;
import Work.Director;
import Work.Accountant;
import Work.Profession;
import Work.Worker;
//   2. Создать классы "Директор", "Рабочий", "Бухгалтер".
//   Реализовать интерфейс с методом, который печатает название
//   должности и имплементировать этот метод в созданные классы.
//   Дополнительное задание

public class Main {
    public static void main(String[] args){
        Profession[] professions = {
                new Director(),
                new Accountant(),
                new Worker()};
        for (Profession profil : professions){
            profil.getProfession();
        }
    }
}
