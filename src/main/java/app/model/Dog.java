package app.model;

import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {
    private String voice;

    public Dog(String voice) {
        this.voice = voice;
    }
    @Override
    public String toString() {
        return "I'am a Dog";
    }

    @Override
    void doVoice() {
        System.out.println(voice);
    }
}



