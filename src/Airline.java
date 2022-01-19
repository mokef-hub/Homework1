import java.util.Objects;

public class Airline {
    private String name;



    public Airline(String name) {
        validate(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        validate(name);
        this.name = name;
    }

    private void validate(String name) {
        if (name.length() >= 8 ){
            throw new RuntimeException("Must be less than 8 characters");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airline airline = (Airline) o;
        return Objects.equals(name, airline.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Airline{" +
                "name='" + name + '\'' +
                '}';
    }
}
