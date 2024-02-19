package inheritance;

public class Pet {
    private String petID;
    private String petName;
    private PetSpecific specific;

    public Pet(String petID, String petName, PetSpecific specific){
        this.petID=petID;
        this.petName=petName;
        this.specific=specific;
    }

    public Pet(){

    }


    public PetSpecific getSpecific() {
        return specific;
    }
    public void setSpecific(PetSpecific specific) {
        this.specific = specific;
    }
    public String getPetID() {
        return petID;
    }

    public void setPetID(String petID) {
        this.petID = petID;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }


}
