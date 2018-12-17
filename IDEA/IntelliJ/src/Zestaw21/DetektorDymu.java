package Zestaw21;

public class DetektorDymu {

    private boolean jestDym;

    DetektorDymu(){
        jestDym = false;
    }

    void sprawdz() throws Alarm{
        if(jestDym)
            throw new Alarm("Wyczuto dym");
    }

    void wlaczDym(){
        jestDym = true;
    }
}
