package app.model;

import org.springframework.stereotype.Component;

@Component
public class Cat extends Animal {
    private String voice;

    public Cat(String voice) {
        this.voice = voice;
    }
    @Override
    public String toString() {
        return "Im a Cat";
    }

    @Override
    void doVoice() {
        System.out.println(voice);
    }
}
