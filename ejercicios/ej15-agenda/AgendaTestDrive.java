public class AgendaTestDrive {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.agregar("Ana");
        agenda.agregar("Beto");
        agenda.agregar("Carla");
        agenda.agregar("");
        agenda.listarConIndice();
        agenda.borrar("Beto");
        agenda.listarSimple();
        System.out.println("Quedan " + agenda.cuantos() + " contactos");
    }
}
