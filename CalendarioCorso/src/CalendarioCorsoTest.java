public class CalendarioCorsoTest {
    
    public static void main(String[] args) {
        
        CalendarioCorso mioCalendarioCorso = new CalendarioCorso();

        mioCalendarioCorso.mese = "maggio";
        mioCalendarioCorso.giorno = 24;
        mioCalendarioCorso.moduloPerData();
        mioCalendarioCorso.date();
    }
}
