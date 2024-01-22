package Documentation;

import java.util.Date;

public class FinancialInvoice extends Doc {

    private final int codeDepartement;
    private final int resyltSum;

    public FinancialInvoice(int documentNumber, Date documentDate, int codeDepartement, int resyltSum){
        super(documentNumber, documentDate);
        this.codeDepartement = codeDepartement;
        this.resyltSum = resyltSum;
    }
    public FinancialInvoice(){
        this(0, new Date(), 0, 0);
    }

    @Override
    public String toString() {
        return "\nFinancialInvoice\n" +
                "documentDate = " + documentDate +
                ",\ncodeDepartement = '" + codeDepartement + '\'' +
                ",\ndocumentNumber = " + getDocumentNumber() +
                ",\nresyltSum = " + resyltSum;
    }
}
