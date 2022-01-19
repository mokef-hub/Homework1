import java.util.Objects;

public class Airport {
    private String name;

    public Airport(String name) {
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
        if (name.length() != 3){
            throw new RuntimeException("Must consist of 3 characters");
        }

        if (!name.equals(name.toUpperCase())){
            throw new RuntimeException("Must be in capital case!!!");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        return Objects.equals(name, airport.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Airport{" +
                "name='" + name + '\'' +
                '}';
    }
}


