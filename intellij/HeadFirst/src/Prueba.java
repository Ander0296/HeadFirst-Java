class Clase {
    int num;

    public int getNum() {
        return num;
    }
}

public class Prueba {
    public static void main(String[] args) {
        Clase clase = new Clase();
        clase.num = 10;
        System.out.println(clase.getNum());
    }
}
