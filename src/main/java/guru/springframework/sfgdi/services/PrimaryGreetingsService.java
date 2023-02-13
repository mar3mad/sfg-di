package guru.springframework.sfgdi.services;

public class PrimaryGreetingsService implements  GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - From the PRIMARY bean";
    }
}

