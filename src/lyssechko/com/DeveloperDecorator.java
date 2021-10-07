package lyssechko.com;

public class DeveloperDecorator implements Developer {

    Developer developer;
    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String doWork() {
        return developer.doWork();
    }
}
