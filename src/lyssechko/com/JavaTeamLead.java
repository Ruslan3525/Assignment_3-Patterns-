package lyssechko.com;

import java.util.zip.DeflaterOutputStream;

public class JavaTeamLead extends DeveloperDecorator {
    public JavaTeamLead(Developer developer){
        super(developer);
    }

    public String sendReport() {
        return "Send week report to customer";
    }

    @Override
    public String doWork() {
        return super.doWork() + sendReport();
    }
}

