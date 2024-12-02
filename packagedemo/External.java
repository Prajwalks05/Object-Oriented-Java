package SEE;

import CIE.Student;
import CIE.Internals;

public class External extends Internals {
    private int[] externalMarks;

    public External(String usn, String name, int sem, int[] internalMarks, int[] externalMarks) {
        super(usn, name, sem, internalMarks);
        this.externalMarks = externalMarks;
    }

    public int[] getExternalMarks() {
        return externalMarks;
    }

    public int[] getFinalMarks() {
        int[] finalMarks = new int[5];
        for (int i = 0; i < 5; i++) {
            finalMarks[i] = internalMarks[i] + externalMarks[i];
        }
        return finalMarks;
    }
}