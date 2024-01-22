package Documentation;

import java.util.Date;

public final class Employeecontacts extends Doc{

    private final String deteStopContract;
    private final String nameEmployee;

    public Employeecontacts (int documentNumber, Date documentDate, String nameEmployee, String deteStopContract){
        super(documentNumber, documentDate);
        this.deteStopContract = deteStopContract;
        this.nameEmployee = nameEmployee;
    }
    public Employeecontacts (){
        this (0, new Date(), "Error", "Error date");
    }

    @Override
    public String toString() {
        return "\nEmployeecontacts\n" +
                "nameEmployee = " + nameEmployee +
                ",\ndateStopContract = '" + deteStopContract + '\'' +
                ",\ndocumentNumber = " + getDocumentNumber() +
                ",\ndocumentDate = " + documentDate;
    }
}
