package Documentation;

public final class Register {
    private int countDocument = 0;
    private final Doc[] allDocs = new Doc[10];

    public Register() {

    }

    public void addDoc(Doc doc) {
        allDocs[countDocument] = doc;
        countDocument++;
    }

    public void printInfoDocument(int documentNumber) {

        for (Doc doc : allDocs) {
            if (doc != null && doc.getDocumentNumber() == documentNumber) {
                System.out.println(doc);
                break;
            }
        }
    }
}
