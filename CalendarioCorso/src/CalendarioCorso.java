public class CalendarioCorso {
    
    public int giorno;
    public String mese;

    public void date() {

        switch (mese) {
            case "gennaio", "marzo", "maggio":
                if(giorno < 1 || giorno > 31) {
                    System.out.println("Giorno inserito non valido");
                }
                break;

            case "febbraio":
                if(giorno < 1 || giorno > 28) {
                    System.out.println("Giorno inserito non valido");   
                }
                break;

            case "aprile":
                if(giorno < 1 || giorno > 30) {
                    System.out.println("Giorno inserito non valido");
                }
                break;

            case "giugno", "settembre", "novembre":
                if(giorno >= 1 && giorno <= 30) {
                    System.out.println("Corso non presente");
                } else if (giorno < 1 || giorno > 30) {
                    System.out.println("Giorno inserito non valido");
                }
                break;

            case "luglio", "agosto", "ottobre", "dicembre":
                if(giorno >= 1 && giorno <= 31) {
                    System.out.println("Corso non presente");
                } else if (giorno < 1 || giorno > 31) {
                    System.out.println("Giorno inserito non valido");
                }
            break;

            default:
                System.out.println("Mese o giorno inserito non valido");
        }
    }

    public void moduloPerData() {
        if(mese.equals("gennaio") && giorno >= 1 && giorno <= 31 ) {
            System.out.println("Corso non ancora avviato");

        } else if (mese.equals("febbraio") && giorno >= 1 && giorno <= 12) {
            System.out.println("Corso non ancora avviato");

        } else if (mese.equals("febbraio") && giorno >= 13 && giorno <= 28) {
            System.out.println("Web");

        } else if (mese.equals("marzo") && giorno >= 1 && giorno <= 4) {
            System.out.println("Web");

        } else if (mese.equals("marzo") && giorno == 5) {
            System.out.println("DASA");

        } else if (mese.equals("marzo") && giorno >= 6 && giorno <= 10) {
            System.out.println("Java");

        } else if (mese.equals("marzo") && giorno == 11) {
            System.out.println("GitHub");

        } else if (mese.equals("marzo") && giorno >= 12 && giorno <= 31) {
            System.out.println("Java");

        } else if (mese.equals("aprile") && giorno >= 1 && giorno <= 8) {
            System.out.println("Java");

        } else if (mese.equals("aprile") && giorno >= 9 && giorno <= 17) {
            System.out.println("Database");

        } else if (mese.equals("aprile") && giorno >= 18 && giorno <= 20) {
            System.out.println("JDBC");

        } else if (mese.equals("aprile") && giorno >= 22 && giorno <= 23) {
            System.out.println("JDBC");

        } else if (mese.equals("aprile") && giorno == 24) {
            System.out.println("Spring");

        } else if (mese.equals("aprile") && giorno >= 26 && giorno <= 30) {
            System.out.println("Spring");

        } else if (mese.equals("maggio") && giorno >= 1 && giorno <= 8) {
            System.out.println("Spring");

        } else if (mese.equals("maggio") && giorno >= 9 && giorno <= 21) {
            System.out.println("Project Work");

        } else if (mese.equals("maggio") && giorno >= 22 && giorno <= 30) {
            System.out.println("Corso terminato");

        } else if (mese.equals("aprile") && giorno == 21 || giorno == 25) {
            System.out.println("Festivo");

        } else if (mese.equals("maggio") && giorno == 1) {
            System.out.println("Festivo");

        }
        
    }

}