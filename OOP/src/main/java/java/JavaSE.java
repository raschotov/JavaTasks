package java;

public class JavaSE extends Java {

    public void updateVersion() {
        version(); // ошибки кампиляции нету, можно вызывать protected метод
    }

    public void getId() {
        uniqueId = 5; // можем обратиться к protected переменной
        otherId = 6; // можем обратиться к default переменной
    }
}
