package tutor.d3_25.step1;

public class Dog {
    private String name;
    private int size;
    private String species;

    public Dog(String name, int size, String species) {
        this.name = name;
        this.size = size;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
