import org.junit.Test;

import java.util.Optional;

public class OptionalTest {

    public class Computer {
        private Optional<Soundcard> soundcard;

        public Optional<Soundcard> getSoundcard() {
            return soundcard;
        }

    }

    public class Soundcard {
        private Optional<USB> usb;

        public Optional<USB> getUSB() {
            return usb;
        }

    }

    public class USB {
        public String getVersion() {
            return "1.0";
        }
    }

    @Test
    public void getVersionWithOptional() {
        Computer computer = new Computer();
        Soundcard soundcard = new Soundcard();
        USB usb = new USB();

        soundcard.usb = Optional.of(usb);
        computer.soundcard = Optional.of(soundcard);

        computer.getSoundcard()
                .ifPresent(s -> s.getUSB().ifPresent(u -> System.out.println(u.getVersion())));
    }


}
