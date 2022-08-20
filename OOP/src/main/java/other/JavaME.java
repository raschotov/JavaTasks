package other;

import java.Java;

public class JavaME extends Java {
    public int getVersion() {
        return version();
    }

    public void getId() {
        uniqueId = 5; // можем обратиться к protected переменной
        // otherId = 5; // обратиться не можем, ошибка компиляции, в разных пакетах лежат
    }
}
