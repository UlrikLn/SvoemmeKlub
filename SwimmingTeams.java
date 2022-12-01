import java.util.ArrayList;
public class SwimmingTeams {

        private ArrayList<KonkurrenceSvømmer> juniorKonkurrencesvømmere = new ArrayList<>();
        private ArrayList<KonkurrenceSvømmer> seniorKonkurrencesvømmere = new ArrayList<>();
        private ArrayList<KonkurrenceSvømmer> konkurrenceDeltagelse = new ArrayList();

        public void tilføjJuniorKonkurrencesvømmere(KonkurrenceSvømmer konkurrenceSvømmer) {
            juniorKonkurrencesvømmere.add(konkurrenceSvømmer);
        }

        public void tilføjSeniorKonkurrencesvømmere(KonkurrenceSvømmer konkurrencesvømmere) {
            seniorKonkurrencesvømmere.add(konkurrencesvømmere);
        }

        public ArrayList<KonkurrenceSvømmer> getSeniorKonkurrencesvømmere() {
            return seniorKonkurrencesvømmere;
        }

        public ArrayList<KonkurrenceSvømmer> getJuniorKonkurrencesvømmere() {
            return juniorKonkurrencesvømmere;
        }
    }
}
