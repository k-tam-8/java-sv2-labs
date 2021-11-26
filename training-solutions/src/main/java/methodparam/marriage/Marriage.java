package methodparam.marriage;

import java.time.LocalDate;

public class Marriage {
    public void getMarried(Woman woman, Man man){
        woman.addRegisterDate(new RegisterDate("házasságkötés ideje", LocalDate.now()));
        man.addRegisterDate(new RegisterDate("házasságkötés ideje", LocalDate.now()));
        changeWomanName(woman);
    }
    public void changeWomanName(Woman woman){
        woman.setName("Cenzné");
    }
}
