public class Termometro {
    private double celsius;

    public void setCelsius(double c) {
        celsius = c;
    }

    public double getFahrenheit() {
        return celsius * 9 / 5 + 32;
    }

    public String getEstado() {
        if (celsius < 15) {
            System.out.println("hace frío");
        } else {
            System.out.println("hace calor");
        }
        return "hello";
    }
}
