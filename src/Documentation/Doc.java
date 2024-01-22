package Documentation;

import java.util.Date;

public abstract class Doc {
    private final int documentNumber;
    protected    Date documentDate;

    public int getDocumentNumber(){
        return documentNumber;
    }
    protected  Doc (int documentNumber, Date documentDate){
        this.documentNumber = documentNumber;
        this.documentDate = documentDate;
    }
}
