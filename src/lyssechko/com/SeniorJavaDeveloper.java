package lyssechko.com;

public class SeniorJavaDeveloper extends DeveloperDecorator{
    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String makeReview(){
        return "Make code review. ";
    }

    @Override
    public String doWork() {
        return super.doWork() + makeReview();
    }
}
