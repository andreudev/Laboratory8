package open.close;

public class InstrumentAdapter {
    private Instrument instrument;

    public InstrumentAdapter(Instrument instrument) {
        this.instrument = instrument;
    }

    public void playNotes(int notes) {
        for (int i = 0; i < notes; i++) {
            instrument.play();
        }
    }
}
