public class CalendarioCorsoTest {
    
    public static void main(String[] args) {
        
        CalendarioCorso mioCalendarioCorso = new CalendarioCorso();

        mioCalendarioCorso.mese = "maggio";
        mioCalendarioCorso.giorno = 2;
        mioCalendarioCorso.moduloPerData();
        mioCalendarioCorso.date();
    }
}
